package gdts.core.parser;

import gdts.common.Version;
import gdts.common.data.VarType;
import gdts.common.data.type.VArray;
import gdts.common.data.type.VBoolean;
import gdts.common.data.type.VFloat;
import gdts.common.data.type.VInteger;
import gdts.common.data.type.VMatrix;
import gdts.common.data.type.VString;
import gdts.common.data.type.Variable;
import gdts.common.module.TaskDescriptor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.tree.CommonTree;

/**
 * Klasa służąca do analizy drzewa składniowego Instancji.
 * 
 * @author Maciej Milczarek
 */
public class InstanceWalker {

	private CommonTree mainNode;

	private TaskDescriptor taskDescriptor;
	private Map<String, Variable> data;

	public InstanceWalker(CommonTree mainNode) {
		this.mainNode = mainNode;
	}

	public void walk() {
		descriptionWalk((CommonTree) mainNode.getChild(0));
		dataWalk((CommonTree) mainNode.getChild(1));
	}

	private void descriptionWalk(CommonTree descrNode) {
		String taskId = descrNode.getChild(0).getText();
		Version taskVersion = Version.valueOf(descrNode.getChild(1).getText());

		taskDescriptor = new TaskDescriptor(taskId, taskVersion);
	}

	@SuppressWarnings("unchecked")
	private void dataWalk(CommonTree dataNode) {

		data = new HashMap<String, Variable>();

		for (CommonTree varNode : (List<CommonTree>) dataNode.getChildren()) {
			data.put(varNode.getChild(0).getText(), createVar(varNode));
		}
	}

	private Variable createVar(CommonTree varNode) {
		
		CommonTree typeNode = (CommonTree)varNode.getChild(1);
		
		if(isSimple(typeNode)) {
			return createSimpleVar(typeNode);
		} else {
			return createContainer(typeNode);
		}
	}
	
	
	private Variable createContainer(CommonTree typeNode) {
		if(typeNode.getToken().getType() == GDTSInstanceParser.TARRAY) {
			return createArray(typeNode);
		} else if(typeNode.getToken().getType() == GDTSInstanceParser.TMATRIX) {
			return createMatrix(typeNode);
		}
		
		return null;
	}

	@SuppressWarnings("unchecked")
	private Variable createMatrix(CommonTree typeNode) {
		
		VMatrix matrix = new VMatrix(getVarType((CommonTree)typeNode.getChild(0).getChild(0)));
		
		for(CommonTree arrayTypeNode : (List<CommonTree>)typeNode.getChildren()) {
			matrix.addRow(createArray(arrayTypeNode));
		}
		
		return matrix;
	}

	@SuppressWarnings("unchecked")
	private VArray createArray(CommonTree typeNode) {
		
		VArray array = new VArray(getVarType((CommonTree)typeNode.getChild(0)));
		
		for(CommonTree elementTypeNode : (List<CommonTree>)typeNode.getChildren()) {
			array.add(createSimpleVar(elementTypeNode));
		}
		
		return array;
	}
	
	private VarType getVarType(CommonTree typeNode) {
		switch (typeNode.getToken().getType()) {
		case GDTSInstanceParser.TINTEGER:
			return VarType.INTEGER;
		case GDTSInstanceParser.TBOOLEAN:
			return VarType.BOOLEAN;
		case GDTSInstanceParser.TFLOAT:
			return VarType.FLOAT;
		case GDTSInstanceParser.TSTRING:
			return VarType.STRING;
		}
		return null;
	}

	private boolean isSimple(CommonTree typeNode) {

		int nodeType = typeNode.getToken().getType();
		if (nodeType == GDTSInstanceParser.TINTEGER
				|| nodeType == GDTSInstanceParser.TFLOAT
				|| nodeType == GDTSInstanceParser.TBOOLEAN
				|| nodeType == GDTSInstanceParser.TSTRING) {
			return true;
		}
		return false;
	}

	private Variable createSimpleVar(CommonTree typeNode) {

		String value = typeNode.getChild(0).getText();

		switch (typeNode.getToken().getType()) {
		case GDTSInstanceParser.TINTEGER:
			return new VInteger(Long.parseLong(value));
		case GDTSInstanceParser.TBOOLEAN:
			if (value.equals("TRUE")) {
				return new VBoolean(true);
			} else {
				return new VBoolean(false);
			}
		case GDTSInstanceParser.TFLOAT:
			return new VFloat(Double.parseDouble(value));
		case GDTSInstanceParser.TSTRING:
			return new VString(value.substring(1, value.length() - 1));
		}

		return null;
	}

	public TaskDescriptor getTaskDescriptor() {
		return taskDescriptor;
	}

	public Map<String, Variable> getData() {
		return data;
	}
}
