parser grammar MiniParser;
options { tokenVocab=MiniLexer; }

program
    : fnDecl* EOF
    ;

fnDecl
    : varDecl '(' paramList ')' '{' stmt* '}';

actualList
    : expr
    | expr ( COMMA expr )*
    | /* nothing */
    ;

paramList
    : varDecl
    | varDecl ( COMMA varDecl )*
    | /* nothing */
    ;

varDecl: type ID
    ;

type
    : genericType LANGLE type RANGLE
    | nonGenericType
    | type LBRACK RBRACK
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
    : IF LPAREN expr RPAREN LCURLY stmt* RCURLY
    | varDecl SEMI
    | varDecl EQ expr SEMI
    | RETURN SEMI
    | RETURN expr SEMI
    | expr SEMI
    ;

expr
    : LPAREN expr RPAREN
    | ID LBRACK expr RBRACK
    | expr DOT ID
    | expr DOT expr
    | expr INCR
    | expr DECR
    | NOT expr
    | INCR expr
    | DECR expr
    | LPAREN type RPAREN expr
    | expr MULT expr
    | expr DIV expr
    | expr MOD expr
    | expr ADD expr
    | expr SUB expr
    | expr LANGLE expr
    | expr RANGLE expr
    | expr LEQ expr
    | expr GEQ expr
    | expr DBLEQ expr
    | expr NEQ expr
    | expr AND expr
    | expr '||' expr
    | expr '?' expr ':' expr
    | ID
    | INT_LIT
    | ID LPAREN actualList RPAREN
    ;