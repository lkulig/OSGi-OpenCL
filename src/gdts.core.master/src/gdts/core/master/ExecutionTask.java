package gdts.core.master;

import gdts.common.Executor;
import gdts.common.GDTSNetId;
import gdts.common.Version;
import gdts.common.comm.CommParty;
import gdts.common.comm.Envelope;
import gdts.common.comm.messages.IMessage;
import gdts.common.comm.messages.MasterStartSlaveTaskMessage;
import gdts.common.comm.messages.Message;
import gdts.common.comm.messages.PingMessage;
import gdts.common.comm.messages.SlaveTaskResultsMessage;
import gdts.common.data.type.VArray;
import gdts.common.data.type.VSlave;
import gdts.common.data.type.VSlaveTask;
import gdts.common.data.type.VString;
import gdts.common.data.type.Variable;
import gdts.common.exception.GDTSConnectException;
import gdts.common.exception.ModuleNotInRepoException;
import gdts.common.exception.UnknownTaskException;
import gdts.common.logger.SimpleLogger;
import gdts.common.module.ModuleDescription;
import gdts.common.module.TaskDescriptor;
import gdts.core.parser.TaskParseHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;

class ExecutionTask implements Callable<Map<String, Variable>>, Executor {

    /**
	 * 
	 */
    private final Master master;
    private TaskDescriptor taskDescr;
    private Map<String, Variable> taskInput;
    private Map<String, Variable> taskOutput;
    private TaskParseHelper parseHelper;

    private Map<VSlaveTask, Thread> slaveTaskThreads;

    protected ExecutionTask(Master master, String instanceId, TaskDescriptor taskDescr) {
        this.master = master;
        this.taskDescr = taskDescr;
        slaveTaskThreads = new HashMap<VSlaveTask, Thread>();
    }

    @Override
    public Map<String, Variable> call() {

        try {
            taskDescr = this.master.repoService.getTask(taskDescr);
            parseHelper = new TaskParseHelper(taskDescr.getTaskFile(), this);
            parseHelper.init();
            parseHelper.setInput(taskInput);
            parseHelper.setOutput(taskOutput);
            parseHelper.executeFlow();

        } catch (UnknownTaskException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return parseHelper.getOutputVars();
    }

    public TaskDescriptor getTaskDescr() {
        return taskDescr;
    }

    public void setTaskDescr(TaskDescriptor taskDescr) {
        this.taskDescr = taskDescr;
    }

    public Map<String, Variable> getTaskInput() {
        return taskInput;
    }

    public void setTaskInput(Map<String, Variable> taskInput) {
        this.taskInput = taskInput;
    }

    public Map<String, Variable> getTaskOutput() {
        return taskOutput;
    }

    @Override
    public void commandCall(String id, ModuleDescription module, Map<String, Variable> params) {

        if (module == null) {
            systemCommandCall(id, params);
        } else {

            try {
                master.repoService.getModuleService(module).execute(id, convertParameterMapToVariableList(params));
            } catch (ModuleNotInRepoException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public void systemCommandCall(String id, Map<String, Variable> params) {
        if (MasterCommands.isMasterCommand(id)) {
            if (id.equals(MasterCommands.Command.START_SLAVETASK.toString())) {
                String slaveTaskId = ((VString) params.get("slaveTask")).toString();
                params.remove("slaveTask");
                GDTSNetId netId = ((VSlave) params.get("slave")).getNetId();
                params.remove("slave");
                Thread slaveTaskThread = startSlaveTask(netId, taskDescr.getId(), taskDescr.getVersion(), slaveTaskId,
                        params);
                VSlaveTask slaveTask = (VSlaveTask) params.get("slaveTaskObj");
                slaveTask.createUniqueId();
                slaveTaskThreads.put((VSlaveTask) slaveTask.duplicate(), slaveTaskThread);
            } else if (id.equals(MasterCommands.Command.JOIN_ALL.toString())) {
                VArray array = (VArray) params.get("tasks").duplicate();
                for (int i = 0; i < array.size(); i++) {
                    try {
                        slaveTaskThreads.get(array.getElementAt(i)).join();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            } else {
                master.masterCommands.execute(id, params);
            }
        } else {
            master.systemModule.execute(id, convertParameterMapToVariableList(params));
        }
    }

    private List<Variable> convertParameterMapToVariableList(Map<String, Variable> parametersMap) {
        List<Variable> parameters = new ArrayList<Variable>();
        for (Entry<String, Variable> entry : parametersMap.entrySet()) {
            parameters.add(entry.getValue());
        }
        return parameters;
    }

    private Thread startSlaveTask(GDTSNetId slave, String taskId, Version version, String slaveTaskId,
            Map<String, Variable> params) {

        TaskDescriptor taskDescr = new TaskDescriptor(taskId, version);
        Thread thread = new Thread(new SlaveTaskRunnable(slave, taskDescr, slaveTaskId, params, params.get("result")));
        thread.start();
        return thread;
    }

    class SlaveTaskRunnable implements Runnable, CommParty {

        private Thread thread;

        private GDTSNetId slave;
        private TaskDescriptor taskDescr;
        private String slaveTaskId;
        private Map<String, Variable> params;
        private Map<String, Variable> output;
        private Variable result;

        public SlaveTaskRunnable(GDTSNetId slave, TaskDescriptor taskDescr, String slaveTaskId,
                Map<String, Variable> params, Variable result) {
            super();
            this.slave = slave;
            this.taskDescr = taskDescr;
            this.slaveTaskId = slaveTaskId;
            this.params = params;
            this.result = result;
        }

        /*
         * (non-Javadoc)
         * 
         * @see java.lang.Runnable#run()
         */
        @Override
        public void run() {

            thread = Thread.currentThread();

            Message msg = new MasterStartSlaveTaskMessage(taskDescr, slaveTaskId, params);
            // System.out.println("SlaveTask params: ");

            try {
                master.commService.sendTo(this, slave, msg);
            } catch (GDTSConnectException e1) {
                // TODO What if client is not available? Implement this case.
                e1.printStackTrace();
            }

            // waiting for results from slave
            while (!thread.isInterrupted()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    break;
                }
            }

            // TODO only one variable in return from slavetask, it must be named
            // result! Change it.
            result.setValue(output.get("result"));
        }

        @Override
        public void receiveMessage(Envelope envelope) {
            IMessage msg = envelope.getMessage();

            if (msg instanceof SlaveTaskResultsMessage) {
                // System.out.println("Master: Received task data: "
                // + ((SlaveTaskResultsMessage) msg).getData());
                output = ((SlaveTaskResultsMessage) msg).getData();
                thread.interrupt();
            } else if (msg instanceof PingMessage) {
                try {
                    master.commService.sendTo(this, envelope.getSender(), ((PingMessage) msg).messageOK());
                } catch (GDTSConnectException e) {
                    SimpleLogger.log("Unable to respond to ping message!");
                }

            }
        }

        @Override
        public Object getPartyId() {
            return thread.hashCode();
        }

        public Variable getResults() {
            return result;
        }
    }

}