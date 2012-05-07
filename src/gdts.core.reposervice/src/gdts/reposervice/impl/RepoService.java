package gdts.reposervice.impl;

import gdts.common.Version;
import gdts.common.comm.CommParty;
import gdts.common.comm.Envelope;
import gdts.common.comm.messages.IMessage;
import gdts.common.comm.messages.data.InstanceFileTransferMessage;
import gdts.common.comm.messages.data.TaskFileTransferMessage;
import gdts.common.comm.messages.listing.InstanceListingMessage;
import gdts.common.comm.messages.listing.InstanceListingRequestMessage;
import gdts.common.comm.messages.listing.TaskListingMessage;
import gdts.common.comm.messages.listing.TaskListingRequestMessage;
import gdts.common.exception.GDTSConnectException;
import gdts.common.exception.GDTSFileExistsException;
import gdts.common.exception.InstanceAlreadyInRepoException;
import gdts.common.exception.InstanceNotFoundException;
import gdts.common.exception.ModuleNotInRepoException;
import gdts.common.exception.NotDirectoryException;
import gdts.common.exception.TaskAlreadyInRepoException;
import gdts.common.exception.UnknownTaskException;
import gdts.common.logger.SimpleLogger;
import gdts.common.module.IModuleService;
import gdts.common.module.InstanceDescriptor;
import gdts.common.module.ModuleDescription;
import gdts.common.module.TaskDescriptor;
import gdts.common.util.DirWatcher;
import gdts.common.util.ExtensionFilenameFilter;
import gdts.core.commservice.ICommService;
import gdts.core.configservice.IConfigService;
import gdts.reposervice.IRepoService;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RepoService implements IRepoService, CommParty {

	private final String taskFileExt = "task";
	private final String instanceFileExt = "inst";

	private List<IModuleService> moduleServices = new ArrayList<IModuleService>();
	private Map<String, IModuleService> modulesMap = new HashMap<String, IModuleService>(); // TODO
																							// change
																							// that
																							// key
																							// would
																							// be
																							// ModuleDescr!!

	private IConfigService configService;
	private ICommService commService;

	private DirWatcher taskDirWatcher;
	private DirWatcher instDirWatcher;
	private Set<TaskDescriptor> tasks;

	private Map<String, InstanceDescriptor> instancesById;
	private Set<InstanceDescriptor> instances;
	private Map<InstanceDescriptor, File> instanceFiles;

	public synchronized void setModuleService(IModuleService moduleService) {
		if (!moduleServices.contains(moduleService)) {
			// System.out.println("Repository setted module service"
			// + moduleService);
			moduleServices.add(moduleService);
			modulesMap.put(moduleService.getModuleDescription().toString(),
					moduleService);
		}
	}

	public synchronized void unsetModuleService(IModuleService moduleService) {
		if (moduleServices.contains(moduleService)) {
			// System.out.println("Repository unsetted module service"
			// + moduleService);
			moduleServices.remove(moduleService);
			modulesMap.remove(moduleService.getModuleDescription().toString());
		}
	}

	public synchronized void setConfigService(IConfigService configService) {
		if (this.configService == null) {
			// System.out.println("Repository setted config service" +
			// configService);
			this.configService = configService;
		}
	}

	public synchronized void unsetConfigService(IConfigService configService) {
		if (this.configService == configService) {
			this.configService = null;
		}
	}

	public synchronized void setCommService(ICommService commService) {
		if (this.commService == null) {
			this.commService = commService;
			this.commService.registerParty(this);
		}
	}

	public synchronized void unsetCommService(ICommService commService) {
		if (this.commService == commService) {
			this.commService.unregisterParty(this);
			this.commService = null;
		}
	}

	public void startup() {
		try {
			taskDirWatcher = new DirWatcher(configService.getTaskDir(),
					new ExtensionFilenameFilter(taskFileExt));
			instDirWatcher = new DirWatcher(configService.getInstanceDir(),
					new ExtensionFilenameFilter(instanceFileExt));
			loadTasks();
			loadInstances();
		} catch (NotDirectoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sprawdza zawartośćkatalogu repozytorium i na podstawie nazw plików
	 * wczytuje informacje o zadaniach do zbioru.
	 */
	private synchronized void loadTasks() {
		tasks = new LinkedHashSet<TaskDescriptor>();
		for (File file : taskDirWatcher.getFiles()) {
			String fileName = file.getName();
			String[] fileNameTokens = fileName.split("-");
			String taskId = fileNameTokens[0];
			String taskVersion = fileNameTokens[1].substring(0,
					fileNameTokens[1].length() - 5);
			TaskDescriptor task = new TaskDescriptor(taskId, taskVersion);
			task.setTaskFile(file);
			tasks.add(task);
		}
	}

	private synchronized void loadInstances() {

		instancesById = new HashMap<String, InstanceDescriptor>();
		instances = new LinkedHashSet<InstanceDescriptor>();
		instanceFiles = new HashMap<InstanceDescriptor, File>();

		for (File file : instDirWatcher.getFiles()) {

			InstanceDescriptor instance = new InstanceDescriptor(file.getName()
					.substring(0, file.getName().length() - 5), null);

			instancesById.put(instance.getId(), instance);
			instances.add(instance);
			instanceFiles.put(instance, file);
		}
	}

	@Override
	@Deprecated
	public TaskDescriptor getTask(String id, Version version)
			throws UnknownTaskException {
		this.loadTasks();
		for (TaskDescriptor task : tasks) {
			if (task.getId().equals(id) && task.getVersion().equals(version)) {
				return task;
			}
		}

		throw new UnknownTaskException("Cannot find task " + id + ": "
				+ version);
	}
	
	@Override
	public TaskDescriptor getTask(TaskDescriptor taskDescr) throws UnknownTaskException {
		this.loadTasks();
		for (TaskDescriptor task : tasks) {
			if (task.equals(taskDescr)) {
				return task;
			}
		}

		throw new UnknownTaskException("Cannot find task: " + taskDescr);
	}
	
	@Override 
	public boolean taskInRepo(TaskDescriptor taskDescr) {
		this.loadTasks();
		
		return tasks.contains(taskDescr);
	}

	@Override
	public List<TaskDescriptor> listTasks() {
		return new ArrayList<TaskDescriptor>(tasks);
	}

	@Override
	public File getInstanceFile(String instanceName) throws InstanceNotFoundException {
		this.loadInstances();
		InstanceDescriptor instanceDescr = instancesById.get(instanceName);
		if(instanceDescr == null) {
			throw new InstanceNotFoundException(instanceName);
		}
		return instanceFiles.get(instanceDescr);
	}

	@Override
	public IModuleService getModuleService(ModuleDescription module)
			throws ModuleNotInRepoException {

		IModuleService moduleService = modulesMap.get(module.toString());

		if (moduleService == null) {
			throw new ModuleNotInRepoException(module.getId() + ": "
					+ module.getVersion());
		}
		return moduleService;
	}

	@Override
	public void receiveMessage(Envelope envelope) {
		IMessage msg = envelope.getMessage();

		try {
			if (msg instanceof TaskListingRequestMessage) {
				synchronized (tasks) {
					commService.sendTo(this, envelope.getSender(),
							new TaskListingMessage(new ArrayList<TaskDescriptor>(
									tasks), msg.getMessageId()));
				}
			} else if (msg instanceof InstanceListingRequestMessage) {
				synchronized (instances) {
					commService.sendTo(this, envelope.getSender(),
							new InstanceListingMessage(
									new ArrayList<InstanceDescriptor>(instances),
									msg.getMessageId()));
				}
			} else if (msg instanceof TaskFileTransferMessage) {
				synchronized (this) {
					try {
						saveTask((TaskFileTransferMessage) msg);
						commService.sendTo(this, envelope.getSender(), msg.statusOK());
					} catch (TaskAlreadyInRepoException e) {
						commService.sendTo(this, envelope.getSender(), msg.statusError(e));
					}
				}
			} else if (msg instanceof InstanceFileTransferMessage) {
				synchronized (this) {
					try {
						saveInstance((InstanceFileTransferMessage) msg);
						commService.sendTo(this, envelope.getSender(), msg.statusOK());
					} catch (InstanceAlreadyInRepoException e) {
						commService.sendTo(this, envelope.getSender(), msg.statusError(e));
					}
				}
			}
		} catch (GDTSConnectException e) {
			SimpleLogger.log("Unable to connect to " + envelope.getSender());
		}
	}

	private synchronized void saveTask(TaskFileTransferMessage msg)
			throws TaskAlreadyInRepoException {
		try {
			saveFile(configService.getTaskDir(), msg.getFileName(), msg.getData());
			SimpleLogger.log("New task was saved in repository: " + msg.getFileName());
		} catch (GDTSFileExistsException e) {
			SimpleLogger.log("Task file received, but not saved: " + msg.getFileName(), e);
			throw new TaskAlreadyInRepoException(msg.getFileName());
		}
	}
	
	private synchronized void saveInstance(InstanceFileTransferMessage msg)
			throws InstanceAlreadyInRepoException {
		try {
			saveFile(configService.getInstanceDir(), msg.getFileName(), msg.getData());
			SimpleLogger.log("New instance was saved in repository: " + msg.getFileName());
		} catch (GDTSFileExistsException e) {
			SimpleLogger.log("Task instance received, but not saved: " + msg.getFileName(), e);
			throw new InstanceAlreadyInRepoException(msg.getFileName());
		}
	}

	private synchronized void saveFile(File dir, String fileName, byte[] fileContent)
			throws GDTSFileExistsException {

		File file = new File(dir + File.separator
				+ fileName);
		if (file.exists() && !file.isDirectory()) {
			throw new GDTSFileExistsException(file.getName());
		}

		try {
			file.createNewFile();
			OutputStream output = new FileOutputStream(file);
			output.write(fileContent);
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Object getPartyId() {
		return "repo_service";
	}

}
