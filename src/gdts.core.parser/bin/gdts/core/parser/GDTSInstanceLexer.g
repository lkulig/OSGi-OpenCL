lexer grammar GDTSInstanceLexer;

@header {
  package gdts.core.parser;
}

D_MINUS
	:	'-'
	;

D_SEMI
	:	';'
	;

D_BEGIN
	:	'BEGIN'
	;

D_END
	:	'END'
	;
	
D_TASK
	:	'TASK'
	;
	
D_ID
	:	'ID'
	;

D_VERSION
	:	'VERSION'
	;
	

D_COLON
	:	':'
	;

fragment
D_TRUE
	:	'TRUE'
	;

fragment
D_FALSE
	:	'FALSE'
	;

D_COMMA
	:	',';

D_EQUAL
	:	'=';

D_DOT
	:	'.';
	
D_DQUOTE
	:	'"';
	
D_UNDERSCORE
	:	'_'
	;
	
D_OPENSB
	:	'['
	;

D_CLOSESB
	:	']'
	;

VSTRING :
   '"' (~('"'|'\n'|'\r'))* '"';

fragment
DIGIT
	:	'0'..'9'
	;
	
VINTEGER
	:	D_MINUS? DIGIT+
	;

VFLOAT
	:	D_MINUS? DIGIT* D_DOT DIGIT+
	;
	
VBOOLEAN
	:	D_TRUE | D_FALSE
	;

VERSION
	:	DIGIT D_DOT DIGIT D_DOT DIGIT;

fragment
LETTER
	:	'a'..'z' | 'A'..'Z';

ID
	:	(LETTER)(LETTER | D_UNDERSCORE | DIGIT)*
	;
	
NEWLINE	
	:	('\r'? '\n') | '\r' {skip();}
	;	
	
WS	:	(' ' | '\t' | NEWLINE)+ {$channel=HIDDEN;}
	;
	