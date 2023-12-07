lexer grammar MiniLexer;

@header {
    package language.antlr;
}

    NOT : '!' ;
    EQ : '=' ;
    NEQ : '!=' ;
    LEQ : '<=' ;
    GEQ: '>=' ;
    DBLEQ : '==' ;
    COMMA : ',' ;
    SEMI : ';' ;
    LPAREN : '(' ;
    RPAREN : ')' ;
    LCURLY : '{' ;
    RCURLY : '}' ;
    LBRACK : '[' ;
    RBRACK : ']' ;
    RANGLE : '>' ;
    LANGLE : '<' ;
    AND : '&&';
    OR : '||';
    INCR : '++' ;
    DECR : '--' ;
    INTEGER: 'Integer';
    DECIMAL: 'Decimal';
    CHARACTER: 'Character';
    ARRAYLIST: 'ArrayList';
    LINKEDLIST: 'LinkedList';
    POINTER: 'Pointer';
    STRING: 'String';
    ANY: 'Any';
    IF : 'if' ;
    RETURN : 'return' ;
    TYPEDEF : 'typedef' ;
    FRAME: 'frame' ;
    ADD : '+' ;
    SUB : '-' ;
    MULT : '*' ;
    DIV : '/' ;
    MOD : '%' ;
    DOT : '.' ;
    QMARK: '?';
    COLON: ':';
    SYSTEM: 'System.';

    INT_LIT : [0-9]+ ;
    STR_LIT: '"' .*? ~'\\' '"';
    ID: [a-z][a-zA-Z_0-9]*;
    WS: [ \t\n\r\f]+ -> channel(HIDDEN) ;
    BLOCK_COMMENT: '/*' .*? '*/'  -> skip;
    LINE_COMMENT: '//' ~[\r\n]* -> skip;