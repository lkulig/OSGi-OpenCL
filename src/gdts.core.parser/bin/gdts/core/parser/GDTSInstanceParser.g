parser grammar GDTSInstanceParser;

options {
  language = Java;
  output = AST;
  ASTLabelType = CommonTree;
  tokenVocab = GDTSInstanceLexer;
}

tokens {
	TASK;
	DESCRIPTION;
	DATA;
	VAR;
	VALUE;
	TINTEGER;
	TBOOLEAN;
	TFLOAT;
	TSTRING;
	TARRAY;
	TMATRIX;
}

@header {
  package gdts.core.parser;
}

instance
	:	taskDescription
		data
		-> ^(TASK taskDescription ^(DATA data))
	;
	
taskDescription
	:	D_TASK D_BEGIN 
		D_ID D_COLON ID D_SEMI
		D_VERSION D_COLON VERSION D_SEMI
		D_END
		-> ^(DESCRIPTION ID VERSION)
	;

data
	:	variable*
	;
	
variable 
	:	ID D_EQUAL value D_SEMI
		-> ^(VAR ID value)
	;
	
value
	:	simple
	|	container
	;
	
simple
	:	VINTEGER
		-> ^(TINTEGER VINTEGER)
	|	VFLOAT
		-> ^(TFLOAT VFLOAT)
	|	VSTRING
		-> ^(TSTRING VSTRING)
	| 	VBOOLEAN
		-> ^(TBOOLEAN VBOOLEAN)
	;
	
container
	:	array
	|	matrix
	;
	
array
	:	D_OPENSB values += simple (D_COMMA values += simple )* D_CLOSESB
		-> ^(TARRAY $values+)
	;
	
matrix
	:	D_OPENSB array (D_COMMA array)* D_CLOSESB
		-> ^(TMATRIX array*)
	;
