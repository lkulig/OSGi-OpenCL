package gdts.client.cli;

import static gdts.client.cli.util.FileType.INST;
import static gdts.client.cli.util.FileType.TASK;
import static gdts.client.cli.util.FileUtils.loadFile;
import static gdts.client.cli.util.FileUtils.parseFileName;
import static gdts.client.cli.util.OptionNames.EXECUTE;
import static gdts.client.cli.util.OptionNames.HELP;
import static gdts.client.cli.util.OptionNames.LIST_INIT;
import static gdts.client.cli.util.OptionNames.LIST_TASKS;
import static gdts.client.cli.util.OptionNames.MASTER;
import static gdts.client.cli.util.OptionNames.PING;
import static gdts.client.cli.util.OptionsBuilder.allOptions;
import gdts.client.cli.model.IModel;
import gdts.client.cli.model.Model;
import gdts.client.cli.util.FileUtils;
import gdts.client.cli.util.OptionNames;
import gdts.common.GDTSNetId;
import gdts.common.exception.GDTSConnectException;
import gdts.common.exception.GDTSException;
import gdts.common.exception.InstanceAlreadyInRepoException;
import gdts.common.exception.InstanceNotFoundException;
import gdts.common.exception.InvalidIPAddressException;
import gdts.common.exception.TaskAlreadyInRepoException;
import gdts.common.exception.TaskNotFoundException;
import gdts.common.module.InstanceDescriptor;
import gdts.common.module.TaskDescriptor;

import java.io.FileNotFoundException;
import java.net.ConnectException;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * Główna klasa aplikacji klienckiej CLI.
 * 
 * @author Maciej Milczarek
 * @author �ukasz Kulig - refaktor
 */
public class ClientCli {

    private static IModel model = new Model();
    private static Options options = allOptions().build();
    private static CommandLineParser parser = new GnuParser();
    private static CommandLine line;

    public static void main(String[] args) {
        try {
            line = parser.parse(options, args);
            processMasterOption();
            processOtherOptions();
        } catch (ParseException e) {
            System.err.println("Parsing command-line arguments failed.  Reason: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void processMasterOption() {
        if (line.hasOption(MASTER)) {
            try {
                model.setMasterNetId(GDTSNetId.valueOf(line.getOptionValue(MASTER)));
            } catch (InvalidIPAddressException e) {
                System.out.println("Invalid ip:port format!");
                help();
                return;
            }
        } else {
            System.out.println("Using localhost address for master: " + model.getMasterNetId());
        }
    }

    private static void processOtherOptions() {
        if (line.hasOption(HELP)) {
            help();
        } else if (line.hasOption(PING)) {
            ping();
        } else if (line.hasOption(LIST_TASKS)) {
            listTasks();
        } else if (line.hasOption(LIST_INIT)) {
            listInit();
        } else if (line.hasOption(EXECUTE)) {
            execute();
        } else if (line.hasOption(OptionNames.UPLOAD)) {
            uploadFile();
        }
    }

    private static void help() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptPrefix("--");
        formatter.printHelp("gdtsclient", "Options:", options, "", true);
    }

    private static void ping() {
        try {
            System.out.println("Pinging master at " + model.getMasterNetId());
            model.pingMaster();
            System.out.println("Ping succesful! Master available at " + model.getMasterNetId());
        } catch (ConnectException e) {
            System.out.println("Unable to connect to master at " + model.getMasterNetId());
        }
    }

    private static void listTasks() {
        try {
            System.out.println("Sending listing request to master at " + model.getMasterNetId());

            List<TaskDescriptor> tasks = model.listTasks();

            System.out.println("Response received! Tasks available on master:\n");

            String listing = "";
            for (TaskDescriptor task : tasks) {
                listing += task.getId();
                listing += "\t\t";
                listing += task.getVersion();
                listing += "\n";
            }

            System.out.println(listing);

        } catch (ConnectException exc) {
            System.out.println("Unable to connect to master at " + model.getMasterNetId());
        }
    }

    private static void listInit() {
        try {
            System.out.println("Sending listing request to master at " + model.getMasterNetId());

            List<InstanceDescriptor> instances = model.listInstances();

            System.out.println("Response received! Instances available on master:\n");

            String listing = "";
            for (InstanceDescriptor instance : instances) {
                listing += instance.getId();
                listing += "\t\t";
                listing += instance.getTask();
                listing += "\n";
            }

            System.out.println(listing);
        } catch (ConnectException e) {
            System.out.println("Unable to connect to master at " + model.getMasterNetId());
        }
    }

    private static void execute() {
        try {
            model.executeInstance(line.getOptionValue("execute"));
            System.out.println(model.getInstanceResults());
        } catch (GDTSException e) {
            if (e instanceof GDTSConnectException) {
                System.out.println("Unable to connect to master at " + model.getMasterNetId());
            } else if (e instanceof InstanceNotFoundException) {
                System.out.println("Instance not found on master at " + model.getMasterNetId());
            } else if (e instanceof TaskNotFoundException) {
                System.out.println("Task not found on master at " + model.getMasterNetId());
            }
        }
    }

    private static void uploadFile() {
        String fileName = line.getOptionValue(OptionNames.UPLOAD);
        String fileType = FileUtils.loadFileTypeFrom(fileName);

        try {
            switch (fileType) {
            case TASK:
                model.uploadTaskFile(parseFileName(fileName), loadFile(fileName));
                break;
            case INST:
                model.uploadInstanceFile(parseFileName(fileName), loadFile(fileName));
                break;
            default:
                System.out.println("Invalid file extension: " + fileType);
                System.exit(0);
            }
        } catch (FileNotFoundException exc) {
            System.out.println("Error: Could not find the file specified.");
        } catch (TaskAlreadyInRepoException e) {
            System.out.println("Task already present in master repo.");
        } catch (InstanceAlreadyInRepoException e) {
            System.out.println("Instance already present in master repo.");
        } catch (GDTSConnectException e) {
            System.out.println("Unable to connect to master at " + model.getMasterNetId());
        }
    }
}