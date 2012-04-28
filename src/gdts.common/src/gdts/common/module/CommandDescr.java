package gdts.common.module;

import java.util.Map;

/**
 * Deskryptor komendy. Przechowuje informację o jej identyfikatorze, nazwie odpowiadającej jej metody,
 * liście nazwanych parametrów oraz ich kolejności w wywołaniu metody.
 * 
 * @author Maciej Milczarek
 */
public class CommandDescr {

	private String id;
	private String methodName;
	private Map<String, ParamDescr> params;
	private String[] paramsOrder;

	/**
	 * @param id Identyfikator komendy.
	 * @param methodName Nazwa korespondującej metody.
	 * @param params Lista parametrów.
	 * @param paramsOrder Tablica określająca kolejność parametrów w wywołaniu metody.
	 */
	public CommandDescr(String id, String methodName, Map<String, ParamDescr> params, String[] paramsOrder) {
		this.id = id;
		this.methodName = methodName;
		this.params = params;
		this.paramsOrder = paramsOrder;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String name) {
		this.id = name;
	}
	
	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public Map<String, ParamDescr> getParams() {
		return params;
	}

	public void setParams(Map<String, ParamDescr> params) {
		this.params = params;
	}
	
	public String[] getParamsOrder() {
		return paramsOrder;
	}

	public void setParamsOrder(String[] paramsOrder) {
		this.paramsOrder = paramsOrder;
	}

	@Override
	public String toString() {
		return "Command id: " + id + ", method name: " + methodName;
	}
}
