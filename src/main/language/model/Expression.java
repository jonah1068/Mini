package language.model;

import lombok.AllArgsConstructor;

public abstract class Expression implements Node {

    Expression e1;
    Expression e2;

    public Expression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public Expression(Expression e) {
        this(e, null);
    }

    public Expression() {
        this(null);
    }

}
