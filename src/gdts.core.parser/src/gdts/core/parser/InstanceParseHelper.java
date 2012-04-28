package gdts.core.parser;

import gdts.common.data.type.Variable;
import gdts.common.module.TaskDescriptor;
import gdts.core.parser.util.ParseUtil;

import java.io.File;
import java.util.Map;

import org.antlr.runtime.tree.CommonTree;

/**
 * Klasa narzędziowa służąca do parsowania Instancji.
 * 
 * @author Maciej Milczarek
 */
public class InstanceParseHelper {

	private File instanceFile;
	private CommonTree mainNode;
	
	private TaskDescriptor task;
	private Map<String, Variable> data; 

	public InstanceParseHelper(File instanceFile) {
		super();
		this.instanceFile = instanceFile;
	}
	
	public void parse() {
		
		mainNode = ParseUtil.parseInstanceFile(instanceFile);
		InstanceWalker walker = new InstanceWalker(mainNode);
		walker.walk();
		
		this.task = walker.getTaskDescriptor();
		this.data = walker.getData();
	}

	public TaskDescriptor getTask() {
		return task;
	}

	public Map<String, Variable> getData() {
		return data;
	}
}
