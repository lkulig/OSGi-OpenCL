package gdts.common.module;

import gdts.common.Version;
import gdts.common.data.type.Variable;
import gdts.common.module.annotation.Command;
import gdts.common.module.annotation.Module;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Klasa bazowa Modułów wykonawczych. Jest odpowiedzialna za analizę implementacji każdego modułu
 * i określenie na jej podstawie jego identyfikatora oraz komend wraz z listami nazwanych parametrów. 
 * 
 * @author Maciej Milczarek
 */
public abstract class ModuleBase implements IModuleService {
	
	private ModuleDescr moduleDescr;
	
	public ModuleBase() {
		this.moduleDescr = new ModuleDescr();
		Module moduleAnn = this.getClass().getAnnotation(Module.class);
		if(moduleAnn != null) {
			this.moduleDescr.setId(moduleAnn.id());
			this.moduleDescr.setVersion(Version.valueOf(moduleAnn.version()));
		}
		this.moduleDescr.setCommands(getCommands(this.getClass()));
		//TODO doda� setDependencies
	}


	private Map<String, CommandDescr> getCommands(Class<? extends IModuleService> moduleClass) {
		Method[] methods = moduleClass.getDeclaredMethods();
		Map<String, CommandDescr> cmdDescrs = new HashMap<String, CommandDescr>();
		for(Method method : methods) {
			Command cmdAnn = method.getAnnotation(Command.class);
			if(cmdAnn != null) {
				Map<String, ParamDescr> params = new HashMap<String, ParamDescr>();
				List<String> paramsOrder = new ArrayList<String>();
				for(int i = 0; i < cmdAnn.params().length; i++) {
					ParamDescr param = new ParamDescr(cmdAnn.params()[i].id(), cmdAnn.params()[i].role(), cmdAnn.params()[i].type());
					params.put(param.getId(), param);
					paramsOrder.add(param.getId());
				}
				
				CommandDescr cmdDescr = new CommandDescr(cmdAnn.id(), method.getName(), params, paramsOrder.toArray(new String[] {}));
				cmdDescrs.put(cmdDescr.getId(), cmdDescr);
				//TODO add uniquness to commands!!!
			}
		}
		return cmdDescrs;
	}

	@Override
	public void execute(String commandId, Map<String, Variable> params) {
		
		CommandDescr command = moduleDescr.getCommands().get(commandId);
		Method method = null;
		//TODO add ROLES!!!!
		for(Method m : this.getClass().getMethods()) {
			if(m.getName().equals(command.getMethodName())) {
				//TODO add some correctness checking
				method = m;
				break ;
			}
		}
		
		Variable[] paramsArray = paramsMapToArray(params, command);
		
		try {
			method.invoke(this, (Object[])paramsArray);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println("po wykonaniu...");
//		for(Variable var : paramsArray) {
//			System.out.println(var);
//		}
		
		
	}
	
	private Variable[] paramsMapToArray(Map<String, Variable> providedParams, CommandDescr command) {
		
		List<Variable> paramsList = new ArrayList<Variable>();
		String[] paramsOrder = command.getParamsOrder();
		
		for(String paramId : paramsOrder) {
			paramsList.add(providedParams.get(paramId));
		}
		
		
		
		return paramsList.toArray(new Variable[] {});
	}
	
//	private Map<String, Variable> paramsArrayToMap(Variable[] paramsArray, String[] paramsOrder) {
//		
//		Map<String, Variable> paramsMap = new HashMap<String, Variable>();
//		
//		for(int i = 0; i < paramsArray.length; i++) {
//			paramsMap.put(paramsOrder[i], paramsArray[i]);
//		}
//		
//		return paramsMap;
//	}

	@Override
	public ModuleDescr getModuleDescr() {
		return moduleDescr;
	}


	public String toString() {
		return moduleDescr.toString();
	}
	
	@Override
	public boolean equals(Object module) {
//		if(module instanceof ExecModule == false) {
//			return false;
//		} 
//		if(module.getClass().getSimpleName().equals(this.getClass().getSimpleName()) == false) {
//			return false;
//		}
//		if(((ExecModule)module).getVersion().equals(this.getVersion())) {
//			return true;
//		}
//		
		return false;
	}
}
