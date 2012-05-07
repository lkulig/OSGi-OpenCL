package gdts.core.parser;

import gdts.common.Executor;
import gdts.common.Version;
import gdts.common.data.type.VNumeric;
import gdts.common.data.type.Variable;
import gdts.common.module.ModuleDescription;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

/**
 * Klasa narzędziowa wykorzystywana podczas parsowania Zadania.
 * 
 * @author Maciej Milczarek
 */
public class TaskParseHelper {

	File taskFile;
	Executor executor;
	String slaveTaskId;
	boolean onMaster;

	FileInputStream in;
	ANTLRInputStream input;
	CommonTokenStream tokens;
	GDTSTaskParser parser;

	CommonTree mainTree;

	CommonTree taskDescriptionTree;
	CommonTree modulesTree;
	CommonTree taskInputTree;
	CommonTree taskOutputTree;
	CommonTree taskVariablesTree;
	CommonTree taskFlowTree;

	protected Map<String, Variable> inputVars;
	protected Map<String, Variable> outputVars;
	protected Map<String, Variable> vars;
	protected Set<ModuleDescription> modules;
	protected Map<String, ModuleDescription> modulesAliases;
	
	protected Map<String, CommonTree> slavetasks;

	public TaskParseHelper(File taskFile, Executor executor) {

		this.taskFile = taskFile;
		this.executor = executor;
		this.onMaster = true;
	}
	
	public TaskParseHelper(File taskFile, String slavetaskId, Executor executor) {

		this.taskFile = taskFile;
		this.executor = executor;
		this.slaveTaskId = slavetaskId;
		this.onMaster = false;
	}

	private void createSubtrees(CommonTree mainTree) {

		//System.out.println(mainTree.getChildren());

		@SuppressWarnings("unchecked")
		List<CommonTree> childs = mainTree.getChildren();

		for (CommonTree tree : childs) {
			switch (tree.getToken().getType()) {
			case GDTSTaskParser.TASK_DESCR:
				taskDescriptionTree = tree;
				break;
			case GDTSTaskParser.MODULES:
				modulesTree = tree;
				break;
			case GDTSTaskParser.TASK_INPUT:
				taskInputTree = tree;
				break;
			case GDTSTaskParser.TASK_OUTPUT:
				taskOutputTree = tree;
				break;
			case GDTSTaskParser.TASK_VARS:
				taskVariablesTree = tree;
				break;
			case GDTSTaskParser.FLOW_BLOCK:
				taskFlowTree = tree;
				break;
			}
		}
	}

	public void init() {
		try {
			input = new ANTLRInputStream(new FileInputStream(taskFile), "UTF-8");
			GDTSLexer lexer = new GDTSLexer(input);
			tokens = new CommonTokenStream(lexer);
			parser = new GDTSTaskParser(tokens);

			GDTSTaskParser.task_return tr = parser.task();
			mainTree = (CommonTree) tr.getTree();
			

			
			createSubtrees(mainTree);

//			System.out.println(taskDescriptionTree);
//			System.out.println(modulesTree);
//			System.out.println(taskInputTree);
//			System.out.println(taskOutputTree);
//			System.out.println(taskVariablesTree);
//			System.out.println(taskFlowTree);
//			
//			System.out.println(mainTree.toStringTree());
			
			parseSlavetasks();

			if(onMaster == false) {
				mainTree = slavetasks.get(slaveTaskId);
				createSubtrees(mainTree);
			}
			
			parseVars();
			parseModules();
			


//			System.out.println(inputVars.toString() + outputVars.toString()
//					+ vars.toString());
//			System.out.println(modules.toString());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	private void parseSlavetasks() {
		
		slavetasks = new HashMap<String, CommonTree>();
		
		@SuppressWarnings("unchecked")
		List<CommonTree> mainNodes = mainTree.getChildren();
		
		for(CommonTree node : mainNodes) {
			if(node.getToken().getType() == GDTSTaskParser.SLAVETASK) {
				slavetasks.put(node.getChild(0).getChild(0).getText(), node);
			}
		}
//		System.out.println(slavetasks);
	}

	public void executeFlow() {
		executeFlow(taskFlowTree);
	}

	protected void executeFlow(CommonTree tree) {
		//System.out.println(taskFlowTree.toStringTree());
		FlowExecutor executor = new FlowExecutor(tree, this);
		executor.execute();
	}

	protected boolean evaluateBoolean(Variable var1, Variable var2,
			CommonTree operBool) {

		int operTokenType = operBool.getToken().getType();
		
		if (var1 instanceof VNumeric && var2 instanceof VNumeric) {
			int result = ((VNumeric) var1).compareTo((VNumeric) var2);

			if (result < 0) {
				switch (operTokenType) {
				case GDTSTaskParser.OPER_L:
				case GDTSTaskParser.OPER_LE:
				case GDTSTaskParser.OPER_NEQ:
					return true;
				}
			}
			if (result == 0) {
				switch (operTokenType) {
				case GDTSTaskParser.OPER_EQ:
					return true;
				}
			}
			if (result > 0) {
				switch (operTokenType) {
				case GDTSTaskParser.OPER_G:
				case GDTSTaskParser.OPER_GE:
				case GDTSTaskParser.OPER_NEQ:
					return true;
				}
			}

			return false;
		}
		
		if (var2 == null) {
			switch(operTokenType) {
				case GDTSTaskParser.OPER_EQ:
					return var1.isNull();
				case GDTSTaskParser.OPER_NEQ:
					return !var1.isNull();
			}
		}
		
		throw new RuntimeException("evaluateBoolean not implemented for types "
				+ var1.getClass().getSimpleName() + " and "
				+ var2.getClass().getSimpleName() + "!");
	}

	private void parseVars() throws RecognitionException {
		
		VarWalker inputWalker = new VarWalker(taskInputTree);
		inputVars = inputWalker.walk();
		
		VarWalker outputWalker = new VarWalker(taskOutputTree);
		outputVars = outputWalker.walk();
		
		VarWalker varsWalker = new VarWalker(taskVariablesTree);
		vars = varsWalker.walk();
	}

	private void parseModules() throws RecognitionException {

		this.modules = new HashSet<ModuleDescription>();
		this.modulesAliases = new HashMap<String, ModuleDescription>();

		if (modulesTree != null) {
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(modulesTree);
			nodes.setTokenStream(tokens);

			GDTSModulesWalker walker = new GDTSModulesWalker(nodes);
			walker.helper = this;
			walker.modules();
		}
	}

	protected void addModule(CommonTree id, CommonTree version, CommonTree alias) {

		ModuleDescription module = getModuleInstance(id, version, alias);
		modules.add(module);
		if (alias != null && alias.getText() != null
				&& !alias.getText().equals("")) {
			modulesAliases.put(alias.getText(), module);
		}

	}

	private ModuleDescription getModuleInstance(CommonTree id, CommonTree version,
			CommonTree alias) {

		ModuleDescription module = new ModuleDescription();
		module.setId(id.getText());
		if (version != null) {
			module.setVersion(Version.valueOf(version.getText()));
		}

		return module;
	}

	protected Variable getVar(String varId) {
		if (inputVars.containsKey(varId)) {
			return inputVars.get(varId);
		} else if (outputVars.containsKey(varId)) {
			return outputVars.get(varId);
		} else if (vars.containsKey(varId)) {
			return vars.get(varId);
		}
		return null;
	}

	protected void commandCall(String id, String moduleId, String paramName, Variable paramValue) {
		 Map<String, Variable> params = new HashMap<String, Variable>();
		 params.put(paramName, paramValue);
		 this.commandCall(id, moduleId, params);
	}
	
	protected void commandCall(String id, String moduleId, Map<String, Variable> params) {

		ModuleDescription module = null;

		if (moduleId != null && !moduleId.equals("")) {
			module = modulesAliases.get(moduleId);
			// TODO what if module does not have an alias...
		}

		executor.commandCall(id, module, params);
	}
	
	public Map<String, Variable> getInputVars() {
		return inputVars;
	}

	public Map<String, Variable> getOutputVars() {
		return outputVars;
	}

	public Map<String, Variable> getVars() {
		return vars;
	}

	public void setInput(Map<String, Variable> taskInput) {
		for (String varId : this.inputVars.keySet()) {
			this.inputVars.put(varId, taskInput.get(varId).duplicate());
		}
	}

	public void setOutput(Map<String, Variable> taskOutput) {
		// TODO Auto-generated method stub

	}
}
