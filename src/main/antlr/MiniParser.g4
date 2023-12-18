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
}

program returns [Program p]
    : pl=programList EOF {
        $p = new Program($pl.l);
    };

programList returns [ArrayList<ProgramStatement> l]
    : pl=programList ps=programStmt {
        $pl.l.add($ps.p);
        $l = $pl.l;
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
        $f = new FunctionDeclaration($v.v.getType(), $v.v.getId(), $l.l, $s.s);
    };

actualList returns [ArrayList<Expression> l]
    : a=actualList ',' e=expr {
        $a.l.add($e.e);
    }
    | e=expr {
        $l = new ArrayList<>();
        $l.add($e.e);
    }
    | { /* nothing */
        $l = new ArrayList<>();
    }
    ;

varDeclList returns [ArrayList<VariableDeclaration> l]
    : v1=varDecl ',' vl=varDeclList {
        $l = $vl.l;
        $l.add($v1.v);
    }
    | v2=varDecl {
        $l = new ArrayList<VariableDeclaration>();
        $l.add($v2.v);
    }
    | { /* nothing */
        $l = new ArrayList<VariableDeclaration>();
    }
    ;

varDecl returns [VariableDeclaration v]
    : t=type i=ID {
        $v = new VariableDeclaration($t.t, $i.text);
    };

varInitStmt returns [VariableInitializationStatement v]
    : varDecl '=' expr ';';

type returns [Type t]
    : p=primitiveType {
        $t = $p.t;
    }
    | genericType
    | frameType
    | type '[' ']' // arrayType
    ;

genericType: primitiveGenericType '<' type '>' ;
frameType: 'frame' ID;

frameDecl
    : frameType '{' ( varDecl ';')+ '}'
    ;

primitiveType returns [Type t]
    : s=INTEGER {
        $t = new PrimitiveType($s.text);
    }
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
    : sl=stmtList st1=stmt {
        $s = $sl.s;
        $s.add($st1.s);
    }
    | st2=stmt {
        $s = new ArrayList<Statement>();
        $s.add($st2.s);
    }
    | { /* nothing */
        $s = new ArrayList<Statement>();
    }
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
//    | RETURN ';' // TODO: cannot return void?
    | RETURN e=expr ';' {
        $s = new ReturnStatement($e.e);
    }
    | e=expr ';' {
        $s = new ExpressionStatement($e.e);
    }
    ;

assignStmt
    : ID '=' expr
    ;

expr returns [Expression e]
    : '(' expr ')'
    | expr '[' expr ']'
    | expr '.' ID
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
    | i=INT_LIT {
        String text = $i.text;
        $e = new LiteralExpression(PrimitiveType.Type.INTEGER, text);
    }
    | s=STR_LIT {
        String text = $s.text;
        $e = new LiteralExpression(PrimitiveType.Type.STRING, text.substring(1, text.length() - 1));
    }
    | SYSTEM i=ID '(' a=actualList ')' {
        $e = new FunctionCall($i.text, true, $a.l);
    }
    | i=ID '(' a=actualList ')' {
        $e = new FunctionCall($i.text, false, $a.l);
    }
    ;