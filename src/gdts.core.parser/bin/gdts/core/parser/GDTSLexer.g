lexer grammar GDTSLexer;

@header {
  package gdts.core.parser;
}

OF_OPER
	:	'OF';

SEMI	:	';';

COLON	:	':';

DOT	:	'.';

OPEN_B	:	'(';

CLOSE_B	:	')';

OPEN_S	:	'[';

CLOSE_S
	:		']';
	
COMMA	:	',';

UNDERSCORE
	:	'_';
	
ARROW	:	'->';

OPER_ASSIGN
	:	'=';
	

OPER_L	:	'<';

 
OPER_G	:	'>';


OPER_LE	:	'<=';


OPER_GE	:	'>=';


OPER_EQ	:	'==';

OPER_NEQ	
	:	'!=';
	
OPER_INC:	'++';

OPER_DEC:	'--';

D_BEGIN	:	'BEGIN';

D_END	:	'END';

D_TASK	:	'TASK';

D_END_TASK
	:	D_END WS D_TASK;
	
D_NAME	:	'NAME';

D_VERSION	
	:	'VERSION';

D_MODULES	
	:	'MODULES';
	
D_END_MODULES
	:	D_END D_MODULES;

D_MASTER	
	:	'MASTER';

D_END_MASTER
	:	D_END D_MASTER;
	
D_MODULE	
	:	'MODULE';

D_END_MODULE
	:	D_END D_MODULE;
	
D_ALIAS	:	'ALIAS';

D_SLAVES	
	:	'SLAVES';

D_END_SLAVE
	:	D_END D_SLAVES;
	
D_IN	:	'IN';

D_END_IN	
	:	D_END D_IN;

D_OUT	:	'OUT';

D_INOUT	:	'INOUT';

D_END_OUT	
	:	D_END D_OUT;

D_VARS	:	'VARS';

D_END_VARS
	:	D_END D_VARS;

D_SLAVETASK
	:	'SLAVETASK';
	
D_END_SLAVETASK
	:	D_END D_SLAVETASK;
	
D_FLOW	:	'FLOW';

D_END_FLOW:	D_END D_FLOW;

D_IF	:	'IF';

D_END_IF	
	:	D_END D_IF;

D_FOR	:	'FOR';

D_END_FOR	
	:	D_END D_FOR;

D_ELSE	:	'ELSE';

D_WHILE	:	'WHILE';

D_END_WHILE
	:	D_END D_WHILE;
	
D_CALL	:	'CALL';
	
SIMPLETYPE	
	:	'INTEGER' 
	|	'FLOAT' 
	|	'BOOLEAN' 
	| 	'STRING' 
	| 	'SLAVETASKOBJ' 
	| 	'SLAVEOBJ'
	;

CONTAINERTYPE
	:	'ARRAY' | 'MATRIX';
	
VALUE	
	:	INTEGER
	| 	FLOAT
	|	STRING
	|	BOOLEAN
	|	NULL;

fragment
DIGIT	:	'0'..'9';

fragment
LOWER_CASE
	:	'a'..'z';
	
fragment
UPPER_CASE
	:	'A'..'Z';

fragment	
LETTER	
	:	UPPER_CASE 
	|	LOWER_CASE;

fragment
INTEGER	
	:	DIGIT+;

fragment
FLOAT	:	DIGIT* DOT DIGIT+;

fragment	
STRING :
   '"' (~('"'|'\n'|'\r'))* '"';

fragment
NULL	
	:	'NULL';

fragment
BOOLEAN
	:	'TRUE' | 'FALSE';	

ID	:	LETTER (LETTER | DIGIT | UNDERSCORE)*;
	
VERSION
	:	DIGIT DOT DIGIT DOT DIGIT;

NEWLINE	:	('\r'? '\n') | '\r' {skip();};	
	
WS	:	(' ' | '\t' | NEWLINE)+ {$channel=HIDDEN;};

COMMENT	:
	'//' ( options {greedy = false;} : .* NEWLINE ) {skip();};
	
ML_COMMENT
	:	'/*' ( options {greedy = false;} : .*) '*/' {skip();};

