package language.model;

import core.system.CPU;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class PrimitiveType implements Type {

    @Override
    public void execute(CPU cpu) {

    }

    @Override
    public String prettyPrint(int tabs) {
        return type.getType() + " ";
    }

    @AllArgsConstructor
    @Getter
    public enum Type {
        INTEGER("Integer"),
        DECIMAL("Decimal"),
        CHARACTER("Character"),
        STRING("String"),
        ANY("Any");

        private String type;
    }

    private static final Map<String, Type> types;

    static {
        types = new HashMap<>();
        for (Type t : Type.values()) {
            types.put(t.getType(), t);
        }
    }

    private final Type type;

    public PrimitiveType(String stringType) {
        this.type = types.get(stringType);
        if (this.type == null) {
            throw new RuntimeException("Invalid type definition: " + stringType);
        }
    }

    @Override
    public String prettyPrint() {
        return type.getType();
    }
}
