parser grammar GDTSTaskParser;

options {
    language = Java;
    tokenVocab = GDTSLexer;
    output = AST;
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

task	:	D_TASK ID (COLON VERSION)? D_BEGIN
		modulesDescr?
		inputDataDescr?
		outputDataDescr?
		variables?
		flow
		slavetask*
		D_END SEMI
		-> ^(TASK 
			^(TASK_DESCR ID VERSION?) 
			modulesDescr?
			inputDataDescr?
			outputDataDescr?
			variables?
			flow
			slavetask*)
		;				
		
modulesDescr
	:	D_MODULES D_BEGIN
		singleModuleDescr*
		D_END SEMI
		-> ^(MODULES singleModuleDescr*)
		;
	
singleModuleDescr
	:	(moduleAlias = ID ARROW)? moduleName = ID (COLON VERSION)? SEMI
		
		-> ^(MODULE $moduleName ^(MODULE_VERSION VERSION?) ^(MODULE_ALIAS $moduleAlias?))
	;
		
inputDataDescr
	:	D_IN D_BEGIN
		varDeclaration*
		D_END SEMI
		-> ^(TASK_INPUT varDeclaration*)
	;
	
outputDataDescr
	:	D_OUT D_BEGIN
		varDeclaration*
		D_END SEMI
		-> ^(TASK_OUTPUT varDeclaration*)
	;
	
variables
	:	D_VARS D_BEGIN
		varDeclaration*		
		D_END SEMI
		-> ^(TASK_VARS varDeclaration*)
	;
		
inoutDataDescr
	:	D_INOUT D_BEGIN
		varDeclaration*
		D_END SEMI
	;
	
varDeclaration
	:	ids += ID (COMMA ids += ID)* COLON type SEMI
		-> ^(VAR type $ids)*
	;
	
type	
	:	SIMPLETYPE
		-> SIMPLETYPE
	|	containerType
		-> containerType
	;
	
containerType
	:	CONTAINERTYPE OF_OPER SIMPLETYPE
		-> ^(CONTAINERTYPE SIMPLETYPE)
	|	CONTAINERTYPE OF_OPER containerType
		-> ^(CONTAINERTYPE containerType)
	;
		
slavetask
	:	D_SLAVETASK ID D_BEGIN
		modulesDescr?
		inputDataDescr?
		outputDataDescr?
		variables?
		flow
		D_END SEMI
		-> ^(SLAVETASK 
			^(TASK_DESCR ID) 
			modulesDescr?
			inputDataDescr?
			outputDataDescr?
			variables?
			flow)
		;		
		
flow	:	D_FLOW flowBlock
		-> flowBlock
	;

flowBlock
	:	D_BEGIN statement* D_END SEMI
		-> ^(FLOW_BLOCK statement*)
	;
	
statement
	:	forLoop
		-> forLoop
	|	whileLoop 
		-> whileLoop
	|	assignStatement SEMI
		-> assignStatement
	| 	commandCall SEMI
		-> commandCall
	;
		
forLoop
	:	D_FOR initAssign = assignStatement? SEMI booleanExpr SEMI actionAssign = assignStatement flowBlock
		-> ^(FOR_LOOP ^(FOR_INIT $initAssign)? ^(CONDITION booleanExpr) ^(FOR_ACTION $actionAssign) flowBlock)
	;
	
whileLoop
	:	D_WHILE booleanExpr flowBlock
		-> ^(WHILE_LOOP ^(CONDITION booleanExpr) flowBlock)
	;
	
assignStatement
	:	varRef 
		(OPER_ASSIGN expr
		-> ^(ASSIGNMENT varRef expr)	
	| 	OPER_INC 
		-> ^(ASSIGNMENT varRef INCREMENT)
	|	OPER_DEC
		-> ^(ASSIGNMENT varRef DECREMENT))
	;
	
booleanExpr
	:	expr operBool expr
	;
	
commandCall
	:	D_CALL (alias = ID DOT)? procName = ID parameterList?
		-> ^(COMMAND_CALL $alias? $procName parameterList?)
	;
	
parameterList
	:	ids += ID ARROW exprs += expr (COMMA ids += ID ARROW exprs += expr)*
		-> ^(PARAM $ids $exprs)*
	;

expr	:	ID | VALUE | arrayRef | matrixRef
	;

varRef	:	ID | arrayRef
	;
	
arrayRef
	:	ID (OPEN_S arrayIndex CLOSE_S)+ -> ^(ARRAY_REF ID arrayIndex+)
	;
	
matrixRef
	:	ID OPEN_S indexY = arrayIndex COMMA indexX = arrayIndex CLOSE_S
		-> ^(MATRIX_REF ID $indexY $indexX)
	;
	
arrayIndex
	:	ID		-> ^(INDEX_BY_VAR ID)
	| 	VALUE	-> ^(INDEX_BY_VALUE VALUE)
	;
	
operBool
	:	OPER_L
	|	OPER_G
	|	OPER_LE
	|	OPER_GE
	|	OPER_EQ
	| 	OPER_NEQ
	;
		