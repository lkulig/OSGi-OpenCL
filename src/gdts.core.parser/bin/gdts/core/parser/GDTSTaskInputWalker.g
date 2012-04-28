tree grammar GDTSTaskInputWalker;

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
}

@members {

  protected TaskParseHelper helper;
}

vars
	:	(^(TASK_INPUT (varDeclaration["input"])*)
	|	^(TASK_OUTPUT (varDeclaration["output"])*)
	|	^(TASK_VARS (varDeclaration["vars"])*))*
	;
varDeclaration[String role]
	:	^(VAR ID SIMPLETYPE)
		{
			if($role.equals("input")) {
				helper.inputVars.put($ID.text, helper.getVarInstance($SIMPLETYPE.text));
			} else if($role.equals("output")) {
				helper.outputVars.put($ID.text, helper.getVarInstance($SIMPLETYPE.text));
			} else if($role.equals("vars")) {
				helper.vars.put($ID.text, helper.getVarInstance($SIMPLETYPE.text));
			}
		}
	;

containerType
	:	^(VAR ID ^(CONTAINERTYPE ^(containerType)))
	;
	