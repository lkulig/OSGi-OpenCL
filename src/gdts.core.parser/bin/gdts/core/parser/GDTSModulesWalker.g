tree grammar GDTSModulesWalker;

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
  package gdts.core.parser;
}

@members {

  protected TaskParseHelper helper;
}

modules
	:	^(MODULES moduleDeclaration*)
	;

moduleDeclaration
	:	^(MODULE moduleId = ID ^(MODULE_VERSION VERSION?) ^(MODULE_ALIAS alias = ID?))
		{
			helper.addModule($moduleId, $VERSION, $alias);
		}
	;
