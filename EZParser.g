parser grammar EZParser;

options {
	tokenVocab = EZLexer;
}

// Regra inicial da gramática.
program: PROGRAM ID SEMI vars_sect stmt_sect EOF;

vars_sect: VAR var_decl*;

var_decl: type_spec ID SEMI;

type_spec: BOOL | INT | REAL | STRING;

stmt_sect: BEGIN stmt+ END;

stmt:
	assign_stmt
	| if_stmt
	| read_stmt
	| repeat_stmt
	| write_stmt;

assign_stmt: ID ASSIGN expr SEMI;

if_stmt: IF expr THEN stmt+ (ELSE stmt+)? END;

read_stmt: READ ID SEMI;

repeat_stmt: REPEAT stmt+ UNTIL expr;

write_stmt: WRITE expr SEMI;

expr:
	expr (TIMES | OVER) expr	# timesOver
	| expr (PLUS | MINUS) expr	# plusMinus
	| expr (EQ | LT) expr		# eqLt
	| LPAR expr RPAR			# exprPar
	| TRUE						# exprTrue
	| FALSE						# exprFalse
	| INT_VAL					# exprIntVal
	| REAL_VAL					# exprRealVal
	| STR_VAL					# exprStrVal
	| ID						# exprId;