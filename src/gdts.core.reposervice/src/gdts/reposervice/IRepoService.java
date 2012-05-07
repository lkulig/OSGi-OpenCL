package gdts.reposervice;

import gdts.common.Version;
import gdts.common.exception.InstanceNotFoundException;
import gdts.common.exception.ModuleNotInRepoException;
import gdts.common.exception.UnknownTaskException;
import gdts.common.module.IModuleService;
import gdts.common.module.ModuleDescription;
import gdts.common.module.TaskDescriptor;

import java.io.File;
import java.util.List;

/**
 * Publiczny interfejs usługi repozytorium.
 * 
 * @author Maciej Milczarek
 */
public interface IRepoService {

	/**
	 * Klasa służąca do pobrania deskryptora Zadania.
	 * 
	 * @param id Identyfikator Zadania.
	 * @param version Wersja zadania.
	 * @return Deskryptor Zadania.
	 * @throws UnknownTaskException Wyjątek rzucany, jeśli Zadanie
	 * nie zostało znalezione w repozytorium.
	 */
	public TaskDescriptor getTask(String id, Version version)
			throws UnknownTaskException;

	/**
	 * Pobranie interfejsu usługi Modułu wykonawczego.
	 * 
	 * @param module Deskryptor Modułu.
	 * @return Interfejs usługi danego Modułu wykonawczego.
	 * @throws ModuleNotInRepoException Wyjątek rzucany, jeśli Moduł
	 * nie został znaleziony w repozytorium.
	 */
	public IModuleService getModuleService(ModuleDescription module)
			throws ModuleNotInRepoException;

	/**
	 * Pobranie listy Zadań obecnych w Repozytorium.
	 * 
	 * @return Lista deksryptorów Zadania.
	 */
	public List<TaskDescriptor> listTasks();

	/**
	 * Pobranie pliku Instancji.
	 * 
	 * @param instanceName Identyfikator instancji.
	 * @return Plik Instancji.
	 * @throws InstanceNotFoundException Wyjątek rzucany, jeśli Instancji nie udało się
	 * znaleźć w repozytorium.
	 */
	public File getInstanceFile(String instanceName)
			throws InstanceNotFoundException;

	/**
	 * Pobranie deskryptora Zadania - jeśli istnieje w repozytorium.
	 * 
	 * @param taskDescr Deskryptor Zadania do pobrania.
	 * @return Deskryptor Zadania, jeśli istnieje.
	 * @throws UnknownTaskException Wyjątek rzucany, jeśli zadanie nie zostało
	 * znalezione w repozytorium.
	 */
	TaskDescriptor getTask(TaskDescriptor taskDescr)
			throws UnknownTaskException;

	/**
	 * Sprawdza, czy dane Zadanie znajduje się w repozytorium.
	 * 
	 * @param taskDescr Deskryptor Zadania.
	 * @return true, jeśli Zadanie zostało odnalezione, w przeciwnym wypadku false.
	 */
	boolean taskInRepo(TaskDescriptor taskDescr);
}
