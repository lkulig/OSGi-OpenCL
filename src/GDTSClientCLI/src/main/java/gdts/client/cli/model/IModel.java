package gdts.client.cli.model;

import gdts.common.GDTSNetId;
import gdts.common.data.type.Variable;
import gdts.common.exception.GDTSConnectException;
import gdts.common.exception.GDTSException;
import gdts.common.exception.InstanceAlreadyInRepoException;
import gdts.common.exception.TaskAlreadyInRepoException;
import gdts.common.module.InstanceDescriptor;
import gdts.common.module.TaskDescriptor;

import java.net.ConnectException;
import java.util.List;
import java.util.Map;

/**
 * Interfejs modelu klienta.
 * 
 * @author Maciej Milczarek
 */
public interface IModel {

	/**
	 * Ustawienie sieciowego identyfikatora Nadzorcy.
	 * 
	 * @param masterNetId Sieciowy identyfikator Nadzorcy.
	 */
	public void setMasterNetId(GDTSNetId masterNetId);

	/**
	 * Pobranie sieciowego Identyfikator Nadzorcy.
	 * 
	 * @return Sieciowy identyfikator Nadzorcy.
	 */
	public GDTSNetId getMasterNetId();

	/**
	 * Wykonanie "pingu" do Nadzorcy.
	 * 
	 * @throws ConnectException Rzucany, jesli nie udało się połączyć z Nadzorcą.
	 */
	public void pingMaster() throws ConnectException;

	/**
	 * Zlecenie listingu Zadań u Nadzorcy.
	 * 
	 * @return Lista deskryptorów Zadań.
	 * @throws ConnectException Rzucany, jesli nie udało się połączyć z Nadzorcą. 
	 */
	public List<TaskDescriptor> listTasks() throws ConnectException;

	/**
	 * Zlecenie listingu Instancji u Nadzorcy.
	 * 
	 * @return Lista deskryptorów Instancji.
	 * @throws ConnectException Rzucany, jesli nie udało się połączyć z Nadzorcą.
	 */
	public List<InstanceDescriptor> listInstances() throws ConnectException;

	/**
	 * Zlecenie wykonania Instancji.
	 * 
	 * @param instanceName Identyfikator Instancji.
	 * @throws GDTSException Rzucany, jesli nie udało się połączyć z Nadzorcą.
	 */
	public void executeInstance(String instanceName) throws GDTSException;

	/**
	 * Załadowanie pliku Zadania do Nadzorcy.
	 * 
	 * @param fileName Nazwa pliku.
	 * @param file Zawartość pliku w postaci tablicy byte[].
	 * @throws GDTSConnectException Rzucany, jeśli nie udało się połączyć z Nadzorcą.
	 * @throws TaskAlreadyInRepoException Rzucany, jesli Zadanie istnieje już w
	 * repozytorium Nadzorcy.
	 */
	public void uploadTaskFile(String fileName, byte[] file)
			throws GDTSConnectException, TaskAlreadyInRepoException;

	/**
	 * Załadowanie pliku Instancji do Nadzorcy.
	 * 
	 * @param fileName Nazwa pliku.
	 * @param file Zawartość pliku w postaci tablicy byte[].
	 * @throws GDTSConnectException Rzucany, jeśli nie udało się połączyć z Nadzorcą.
	 * @throws InstanceAlreadyInRepoException Rzucany, jeśli Instancja istnieje
	 * już w repozytorium Nadzorcy.
	 */
	public void uploadInstanceFile(String fileName, byte[] file)
			throws GDTSConnectException, InstanceAlreadyInRepoException;

	/**
	 * Pobranie wyników wykonania Instancji.
	 * 
	 * @return Lista nazwanych wyników w postaci Mapy.
	 */
	public Map<String, Variable> getInstanceResults();
}
