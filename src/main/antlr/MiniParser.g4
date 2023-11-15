parser grammar MiniParser;
options { tokenVocab=MiniLexer; }

program: programList EOF ;

programList
    : programList programStmt
    | /* nothing */
    ;

programStmt
    : fnDecl
    | typedef ';'
    | frameDecl ';'
    | varDecl ';'
    | varInit
    ;

typedef
    : 'typedef' type ID
    | 'typedef' frameDecl ID
    ;

fnDecl
    : varDecl '(' paramList ')' '{' stmt* '}';

actualList
    : expr ( ',' expr )*
    | /* nothing */
    ;

paramList
    : varDecl ( ',' varDecl )*
    | /* nothing */
    ;

varDecl: type ID;

varInit: varDecl EQ expr ';';

type
    : primitiveType
    | genericType
    | frameType
    | type '[' ']' // arrayType
    ;

genericType: primitiveGenericType '<' type '>' ;
frameType: 'frame' ID;

frameDecl
    : frameType '{' ( varDecl ';')+ '}'
    ;

primitiveType
    : INTEGER
    | DECIMAL
    | CHARACTER
    | STRING
    | ANY
    ;

primitiveGenericType:
    | ARRAYLIST
    | LINKEDLIST
    | POINTER
    ;

stmt
    : IF '(' expr ')' '{' stmt* '}'
    | varDecl ';'
    | varInit // varInit suffixed with ';'
    | frameDecl ';'
    | RETURN ';'
    | RETURN expr ';'
    | expr ';'
    ;

expr
    : '(' expr ')'
    | expr '[' expr ']'
    | expr '.' ID
    | expr '.' expr
    | expr '++'
    | expr '--'
    | '!' expr
    | '++' expr
    | '--' expr
    | '(' type ')' expr
    | expr '*' expr
    | expr '/' expr
    | expr '%' expr
    | expr '+' expr
    | expr '-' expr
    | expr '<' expr
    | expr '>' expr
    | expr '<=' expr
    | expr '>=' expr
    | expr '==' expr
    | expr '!=' expr
    | expr '&&' expr
    | expr '||' expr
    | expr '?' expr ':' expr
    | ID
    | INT_LIT
    | ID '(' actualList ')'
    ;