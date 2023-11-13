parser grammar MiniParser;
options { tokenVocab=MiniLexer; }

program
    : (fnDecl | typedef | frame /* ';' */ | (varDecl ';') | varInit /* ';' */)* EOF
    ;

typedef
    : 'typedef' type ID
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
    : genericType '<' type '>'
    | nonGenericType
    | type '[' ']'
    | frame
    ;

frame
    : 'frame' ID '{' ( varDecl ';')+ '}' ';'
    ;

nonGenericType
    : INTEGER
    | DECIMAL
    | CHARACTER
    | STRING
    | ANY
    ;

genericType:
    | ARRAYLIST
    | LINKEDLIST
    | POINTER
    ;

stmt
    : IF '(' expr ')' '{' stmt* '}'
    | varDecl ';'
    | varInit // varInit suffixed with ';'
    | frame // frame suffixed with ';'
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