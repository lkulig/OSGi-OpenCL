package gdts.core.parser;

import gdts.common.data.VarType;
import gdts.common.data.type.VContainer;
import gdts.common.data.type.Variable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.tree.CommonTree;

/**
 * Klasa analizująca drzewo składniowe deklaracji zmiennych.
 * 
 * @author Maciej Milczarek
 */
public class VarWalker {

	CommonTree declTree;

	public VarWalker(CommonTree declTree) {
		this.declTree = declTree;
	}

	public Map<String, Variable> walk() {

		Map<String, Variable> vars = new HashMap<String, Variable>();

		@SuppressWarnings("unchecked")
		List<CommonTree> statements = declTree.getChildren();

		for (CommonTree statement : statements) {
			if (statement.getToken().getType() == GDTSTaskParser.VAR) {
				vars.put(statement.getChild(1).getText(),
						parseType((CommonTree) statement.getChild(0)));
			}
		}
		
		return vars;
	}

	private Variable parseType(CommonTree typeNode) {
		if (VarType.isSimple(typeNode.getText())) {
			return Variable.createSimple(typeNode.getText());
		} else {
			return parseContainerType(typeNode);
		}
	}

	private Variable parseContainerType(CommonTree typeNode) {
		String elementType = ((CommonTree)typeNode.getChild(0)).getText();
		VContainer var = (VContainer)Variable.createContainer(typeNode.getText(), elementType);
		var.setElementType(VarType.getVarType(elementType));
		var.fill(parseType((CommonTree)typeNode.getChild(0)));
		return var;
	}
}
