package gdts.core.parser;

import gdts.common.data.type.VArray;
import gdts.common.data.type.VInteger;
import gdts.common.data.type.VMatrix;
import gdts.common.data.type.Variable;
import gdts.common.logger.SimpleLogger;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.tree.CommonTree;

/**
 * Klasa służąca do wykonania bloków przepływu Zadania i Podzadania.
 * 
 * @author Maciej Milczarek
 */
@SuppressWarnings("unchecked")
public class FlowExecutor {

    CommonTree flowTree;
    TaskParseHelper helper;

    public FlowExecutor(CommonTree flowTree, TaskParseHelper helper) {
        this.flowTree = flowTree;
        this.helper = helper;
    }

    public void execute() {

        List<CommonTree> statements = flowTree.getChildren();

        if (statements != null) {
            for (CommonTree statement : statements) {
                switch (statement.getToken().getType()) {
                case GDTSTaskParser.FOR_LOOP:
                    forLoop(statement);
                    break;
                case GDTSTaskParser.ASSIGNMENT:
                    assignStatement(statement);
                    break;
                case GDTSTaskParser.WHILE_LOOP:
                    whileLoop(statement);
                    break;
                case GDTSTaskParser.COMMAND_CALL:
                    commandCall(statement);
                    break;
                default:
                    SimpleLogger.log("Uninmplemented flow for " + statement.getToken().getText() + " token!");
                }
            }
        }
    }

    /**
     * @param statement
     */
    private void assignStatement(CommonTree statement) {
        switch (((CommonTree) statement.getChild(1)).getToken().getType()) {
        case GDTSTaskParser.INCREMENT:
            helper.commandCall("INCREMENT", null, "var", varRef((CommonTree) statement.getChild(0)));
            break;
        case GDTSTaskParser.DECREMENT:
            helper.commandCall("DECREMENT", null, "var", varRef((CommonTree) statement.getChild(0)));
            break;
        default:
            varRef((CommonTree) statement.getChild(0)).setValue(expr((CommonTree) statement.getChild(1)).duplicate());
        }
    }

    /**
     * @param child
     * @return
     */
    private Variable varRef(CommonTree node) {
        switch (node.token.getType()) {
        case GDTSTaskParser.ID:
            return helper.getVar(node.getText());
        case GDTSTaskParser.ARRAY_REF:
            VArray array = (VArray) helper.getVar(node.getChild(0).getText());
            Variable var = array;
            for (int i = 1; i < node.getChildCount(); i++) {
                CommonTree indexNode = (CommonTree) node.getChild(i);
                if (indexNode.getToken().getType() == GDTSTaskParser.INDEX_BY_VAR) {
                    var = ((VArray) var).getElementAt((VInteger) varRef((CommonTree) indexNode.getChild(0)));
                }
            }
            return var;
        case GDTSTaskParser.MATRIX_REF:
            VMatrix matrix = (VMatrix) helper.getVar(node.getChild(0).getText());
            if (node.getChildCount() == 1) {
                return matrix;
            } else {
                int indexY = index((CommonTree) node.getChild(1));
                int indexX = index((CommonTree) node.getChild(2));
                return matrix.getValueAt(indexY, indexX);
            }
            // TODO works only for index by var! what about index by value?
        }

        return null;
    }

    private int index(CommonTree indexNode) {
        if (indexNode.getToken().getType() == GDTSTaskParser.INDEX_BY_VAR) {
            return (int) ((VInteger) varRef((CommonTree) indexNode.getChild(0))).longValue();
        } else {
            return Integer.parseInt(indexNode.getChild(0).getText());
        }
    }

    /**
     * @param tree
     * @return
     */
    private Variable expr(CommonTree node) {

        switch (node.getToken().getType()) {
        case GDTSTaskParser.ID:
        case GDTSTaskParser.ARRAY_REF:
        case GDTSTaskParser.MATRIX_REF:
            return varRef(node);
        case GDTSTaskParser.VALUE:
            return Variable.createByValue(node.getText());
        case GDTSTaskParser.NULL:
            return null;
        }
        return null;
    }

    /**
     * @param statement
     */
    private void commandCall(CommonTree statement) {

        String moduleId = null;
        String commandId;
        int commandIdIndex = 0;

        if (((CommonTree) statement.getChild(1)).getToken().getType() == GDTSTaskParser.ID) {
            commandIdIndex = 1;
            moduleId = statement.getChild(0).getText();
        }
        commandId = statement.getChild(commandIdIndex).getText();

        Map<String, Variable> params = commandParams(statement.getChildren().subList(commandIdIndex + 1,
                statement.getChildren().size()));

        helper.commandCall(commandId, moduleId, params);
    }

    /**
     * @param subList
     */
    private Map<String, Variable> commandParams(List<CommonTree> nodeList) {

        Map<String, Variable> params = new LinkedHashMap<String, Variable>();
        for (CommonTree node : nodeList) {
            // System.out.println(node.toStringTree());
            params.put(node.getChild(0).getText(), expr((CommonTree) node.getChild(1)));
        }

        return params;
    }

    /**
     * @param statement
     */
    private void whileLoop(CommonTree statement) {
        while (booleanExpr((CommonTree) statement.getChild(0))) {
            FlowExecutor executor = new FlowExecutor((CommonTree) statement.getChild(1), this.helper);
            executor.execute();
        }
    }

    /**
     * @param statement
     */
    private void forLoop(CommonTree statement) {

        int conditionIndex = 0;

        if (((CommonTree) statement.getChild(0)).getToken().getType() == GDTSTaskParser.FOR_INIT) {
            // kopiemy za ASSIGNMENT w FOR_LOOP -> FOR_INIT
            assignStatement((CommonTree) ((CommonTree) statement.getChild(0)).getChild(0));
            conditionIndex = 1;
        }
        while (booleanExpr((CommonTree) statement.getChild(conditionIndex))) {
            FlowExecutor executor = new FlowExecutor((CommonTree) statement.getChild(conditionIndex + 2), this.helper);
            executor.execute();
            assignStatement((CommonTree) ((CommonTree) statement.getChild(conditionIndex + 1)).getChild(0));
        }
    }

    /**
     * @param child
     * @return
     */
    private boolean booleanExpr(CommonTree node) {
        return helper.evaluateBoolean(expr((CommonTree) node.getChild(0)), expr((CommonTree) node.getChild(2)),
                (CommonTree) node.getChild(1));
    }
}