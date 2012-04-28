package gdts.core.master;

import gdts.common.GDTSNetId;
import gdts.common.logger.SimpleLogger;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Klasa odpowiedzialna za zarządzanie połączeniami z Wykonawcami. Przechowuje
 * informacje o zarejestrowanych wykonawcach oraz automatycznie wyrejestrowuje
 * ich z systemu, gdy nie zgłaszają swojej obecności przez w określonym
 * interwale czasowym.
 * Klasa jest singletonem.
 * 
 * @author Maciej Milczarek
 */
public final class SlavesManager {

	private static final long DEFAULT_TIMEOUT = 10000;
	private static final long DEFAULT_CHECK_INTERVAL = 500;
	
	private static SlavesManager instance;
	private ExecutorService execService;
	private Map<GDTSNetId, TimeoutTask> timeoutTasks = new HashMap<GDTSNetId, TimeoutTask>();
	
	private SlavesManager() {
		execService = Executors.newCachedThreadPool();
	}
	
	public synchronized static SlavesManager getInstance() {
		if(SlavesManager.instance == null) {
			SlavesManager.instance = new SlavesManager();
		}
		return SlavesManager.instance;
	}
	
	public synchronized void slaveCheckIn(GDTSNetId slave) {
		if(timeoutTasks.containsKey(slave)) {
			timeoutTasks.get(slave).reset();
		} else {
			SimpleLogger.log("New slave checking in: " + slave);
			TimeoutTask task = new TimeoutTask(slave);
			timeoutTasks.put(slave, task);
			execService.execute(task);
		}
//		System.out.println("Available slaves: " + timeoutTasks.keySet());
	}
	
	public synchronized Set<GDTSNetId> getSlaves() {
		return timeoutTasks.keySet();
	}
	
	private class TimeoutTask implements Runnable {
		
		long lastCheckTime;
		Thread thread;
		GDTSNetId slave;
		
		public TimeoutTask(GDTSNetId slave) {
			this.slave = slave;
		}
		
		@Override
		public void run() {
			this.thread = Thread.currentThread();
			reset();
			
			while(!thread.isInterrupted()) {
				try {
					Thread.sleep(DEFAULT_CHECK_INTERVAL);
				} catch (InterruptedException e) {
					continue;
				}
				if(lastCheckTime + DEFAULT_TIMEOUT < System.currentTimeMillis()) {
					thread.interrupt();
				}
			}
			removeSlave();
		}
		
		private void removeSlave() {
			synchronized(SlavesManager.this.timeoutTasks) {
				SimpleLogger.log("Slave going out: " + slave);
				timeoutTasks.remove(slave);
			}
		}
		
		public void reset() {
			this.lastCheckTime = System.currentTimeMillis();
		}
	}
}
