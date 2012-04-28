package gdts.core.configservice.impl;

import gdts.common.GDTSNetId;
import gdts.common.exception.InvalidIPAddressException;
import gdts.common.logger.SimpleLogger;
import gdts.common.util.OSGIUtil;
import gdts.core.configservice.IConfigService;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.osgi.service.component.ComponentContext;

public class ConfigService implements IConfigService {

	private final String MASTER_BUNDLE_SYM_NAME = "gdts.core.master";
	private final String MASTER_CONFIG_FILE_NAME = "gdts-master.ini";
	private final String SLAVE_CONFIG_FILE_NAME = "gdts-slave.ini";
	
	
	
	String domainId;
	GDTSNetId masterNetId;
	int localPort;
	File repoDir;
	File taskDir;
	File instanceDir;
	private boolean isMaster;
	
	private void loadConfig(boolean isMaster) {
		
		this.isMaster = isMaster;
		
		File configFile = new File(isMaster? MASTER_CONFIG_FILE_NAME : SLAVE_CONFIG_FILE_NAME);
		Properties props = new Properties();
		
		try {
			props.load(new FileInputStream(configFile));
		} catch (FileNotFoundException e) {
			SimpleLogger.log("Config file not found " + configFile.getAbsolutePath());
		} catch (IOException e) {
			SimpleLogger.log("Error reading config file " + configFile.getAbsolutePath());
		}
		
		try {
			if(isMaster == false) {
				masterNetId = GDTSNetId.valueOf(props.getProperty("masterAddress"));
			}
		} catch (InvalidIPAddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.domainId = props.getProperty("domainId", "defaultDomain");
		
		this.repoDir = new File(props.getProperty("repoDir"));
		this.taskDir = new File(repoDir.getPath() + File.separator + "tasks");
		this.instanceDir = new File(repoDir.getPath() + File.separator + "inst");
		
		this.localPort = Integer.parseInt(props.getProperty("localPort"));
	}
	
	public synchronized void startup(ComponentContext context) {
		
		if(OSGIUtil.getInstance(context).bundleExists(MASTER_BUNDLE_SYM_NAME)) {
			loadConfig(true);
		} else {
			loadConfig(false);
		}

	}
	
	@Override
	public boolean isMaster() {
		return isMaster;
	}
	
	@Override
	public File getTaskDir() {
		return taskDir;
	}

	@Override
	public File getInstanceDir() {
		return instanceDir;
	}

	@Override
	public String getDomainId() {
		return domainId;
	}

	@Override
	public GDTSNetId getMasterNetId() {
		return masterNetId;
	}

	@Override
	public int getLocalPort() {
		return localPort;
	}
	
	
}
