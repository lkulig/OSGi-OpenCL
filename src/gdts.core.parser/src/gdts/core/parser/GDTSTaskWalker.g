tree grammar GDTSTaskWalker;

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
	INDEX_BY_VAR;
	INDEX_BY_VALUE;
}


@header {
  package gdts.parser;
}

@members {

  protected TaskParseHelper helper;
}

task	
@init{System.out.println("Tree: matched");}
  : ^(TASK 
      ^(TASK_DESCR ID VERSION?) 
      modulesDescr?
			inputDataDescr?
			outputDataDescr?
			variables?
			flow
    )
  ;				
		
modulesDescr
	:  ^(MODULES masterModulesDescr? slaveModulesDescr?)  

	;
		
masterModulesDescr
  : ^(MASTER_MODULES singleModuleDescr[false]*)
	;
	
slaveModulesDescr
  :	^(SLAVE_MODULES singleModuleDescr[true]*)
	;
	
singleModuleDescr[boolean slave]
	:	^(MODULE moduleId = ID ^(MODULE_VERSION VERSION?) ^(MODULE_ALIAS ID))

	;
		
inputDataDescr
	:	^(TASK_INPUT varDeclaration*)
	;
	
outputDataDescr
	:	^(TASK_OUTPUT varDeclaration*)
	;

variables
  : 
    ^(TASK_VARS varDeclaration*)
  ;
	
//inoutDataDescr
//	:	^(TASK_VARS varDeclaration*)
//    {Executor.getInstance().execute("inoutDataDescr");}
//	;
		
varDeclaration
	:  ^(VAR ID type) 
	;
	
type 
  :	SIMPLETYPE 
	|	containerType 
	;
	
containerType 
	:	^(CONTAINERTYPE type)
	;
		
//todo slavetask

		
flow  
  :	^(TASK_FLOW flowBlock)
	;

flowBlock
	:	statement*
	;
	
statement
	:	forLoop 
	|	whileLoop 
	|	assignStatement 
	| 	commandCall 
	;
		
forLoop
	:	^(FOR_LOOP forInit? ^(CONDITION booleanExpr) ^(FOR_ACTION assignStatement) flowBlock)
	;
	
forInit	
  :	^(FOR_INIT assignStatement)
  ;
	
whileLoop
	:	^(WHILE_LOOP ^(CONDITION booleanExpr) flowBlock)
	;
	
assignStatement
	: 	^(ASSIGNMENT varRef expr)	
	| 	^(INCREMENT varRef) 
	|	^(DECREMENT varRef) 
	;
	
booleanExpr
	:	expr OPER_BOOL expr
	;
	
commandCall
	:	^(COMMAND_CALL ID? ID param*)
	;
	
param	
  :	^(PARAM ID expr)
  ;

expr	
  :	ID 
  | VALUE 
  | ARRAY_REF 
  ;

varRef	
  :	ID 
  | ARRAY_REF 
  ;
