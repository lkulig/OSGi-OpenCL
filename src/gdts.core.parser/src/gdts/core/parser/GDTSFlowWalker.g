tree grammar GDTSFlowWalker;

options {
  language = Java;
	tokenVocab = GDTSLexer;
	ASTLabelType = CommonTree;
	backtrack = true;
	memoize = true;
}

tokens {
	TASK;
	TASK_DESCR;
	MODULES;
	MODULE;
	MODULE_VERSION;
	MODULE_ALIAS;
	VAR;
	TASK_INPUT;
	TASK_OUTPUT;
	TASK_VARS;
	TASK_FLOW;
	FLOW_BLOCK;
	SLAVETASK;
	FOR_LOOP;
	FOR_INIT;
	FOR_ACTION;
	WHILE_LOOP;
	CONDITION;
	ASSIGNMENT;
	INCREMENT;
	DECREMENT;
	COMMAND_CALL;
	PARAMETERS;
	PARAM;
	ARRAY_REF;
	MATRIX_REF;
	INDEX_BY_VAR;
	INDEX_BY_VALUE;
}


@header {
  package gdts.parser;
  
  import gdts.common.data.type.Variable;
  import java.util.List;
  import java.util.ArrayList;
  import java.util.Map;
  import java.util.HashMap;
}

@members {

  protected TaskParseHelper helper;
}

flow [boolean execute]
@init {if(execute == false) return null;}
	:	^(FLOW_BLOCK statement*)
	;
	
statement
	:	assignStatement
	|	^(COMMAND_CALL module = ID? procId = ID parameterList)
		{
			helper.commandCall($procId.text, $module.text, $parameterList.params);			
		}
	|	 ^(FOR_LOOP (^(FOR_INIT assignStatement))? ^(CONDITION booleanExpr) ^(FOR_ACTION assignStatement) flow[false])
		
		{	
			System.out.println("entering for loop");
			while($booleanExpr.result == true) {
				helper.executeFlow($flow.start);
				System.out.println("executing for loop");
				
			}
			helper.removeChild($FOR_LOOP, $flow.start);
			System.out.println("for loop ended");

		} 
	;
	
parameterList returns [Map params]
@init {$params = new HashMap();}
	:	(
			param = parameter
			{
				$params.put($param.paramId, $param.paramValue);
			}
		)*
	;
	
parameter returns [String paramId, Variable paramValue] 
	:	^(PARAM ID expr)
		{
			$paramId = $ID.text;
			$paramValue = $expr.var; 
		}
	;
	
booleanExpr returns [boolean result]
	:	expr1 = expr OPER_BOOL expr2 = expr
		{
			$result = helper.evaluateBoolean($expr1.var, $expr2.var, $OPER_BOOL);
		}
	;

assignStatement
	:	^(ASSIGNMENT varRef expr) 
		{
			$varRef.var.setValue($expr.var.duplicate());
		}
	| 	^(INCREMENT varRef)
		{
			Map params = new HashMap();
			params.put("var", $varRef.var);
			helper.commandCall("INCREMENT", null, params);
		}
	|	^(DECREMENT varRef)
		{
			Map params = new HashMap();
			params.put("var", $varRef.var);
			helper.commandCall("DECREMENT", null, params);
		}
	;
	
expr returns [Variable var]
	:	ID 
		{
			$var = helper.getVar($ID.text);
		}
	|	VALUE 
		{
			$var = Variable.createByValue($VALUE.text);
			
		}
	| 	ARRAY_REF 
		{
			$var = null;
		}
	;
	
varRef returns [Variable var]
	:	ID 
		{
			$var = helper.getVar($ID.text);
		}
		
	|	ARRAY_REF
	;
