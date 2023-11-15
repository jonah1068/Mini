parser grammar MiniParser;
options { tokenVocab=MiniLexer; }

@header {
    package language.antlr;

    import org.antlr.v4.runtime.*;
    import java.io.*;
    import java.util.*;

    import language.model.*;
}

@members {
    public Program program;
}

program returns [Program p]
    : pl=programList EOF {
        $p = new Program($pl.l);
    };

programList returns [ArrayList<ProgramStatement> l]
    : pl=programList ps=programStmt {
        ArrayList<ProgramStatement> list = $pl.l;
        list.add($ps.p);
        $l = list;
    }
    | /* nothing */ {
        $l = new ArrayList<>();
    }
    ;

programStmt returns [ProgramStatement p]
    : fn=fnDecl {
        $p = $fn.f;
    }
    | t=typedef ';' {

    }
    | fd=frameDecl ';' {

    }
    | vd=varDecl ';' {

    }
    | vi=varInitStmt {

    }
    ;

typedef
    : 'typedef' type ID
    | 'typedef' frameDecl ID
    ;

fnDecl returns [FunctionDeclaration f]
    : v=varDecl '(' l=varDeclList ')' '{' s=stmtList '}' {
        $f = new FunctionDeclaration($v.v, $l.l, $s.s);
    };

actualList
    : actualList ',' expr
    | expr
    | /* nothing */
    ;

varDeclList returns [ArrayList<VariableDeclaration> l]
    : varDecl ',' varDeclList
    | varDecl
    | /* nothing */
    ;

varDecl returns [VariableDeclaration v]
    : t=type i=ID {
        $v = new VariableDeclaration($t.t, $i.text);
    };

varInitStmt returns [VariableInitializationStatement v]
    : varDecl '=' expr ';';

type returns [Type t]
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

stmtList returns [ArrayList<Statement> s]
    : stmtList stmt
    | /* nothing */
    ;

stmt returns [Statement s]
    : IF '(' e1=expr ')' '{' sl=stmtList '}' {
        $s = new IfStatement($e1.e, $sl.s);
    }
    | vd=varDecl ';' {
        $s = $vd.v;
    }
    | vi=varInitStmt { // varInitStmt suffixed with ';'
        $s = $vi.v;
    }
    | assignStmt
    | frameDecl ';'
    | RETURN ';'
    | RETURN expr ';'
    | expr ';'
    ;

assignStmt
    : ID '=' expr
    ;

expr returns [Expression e]
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