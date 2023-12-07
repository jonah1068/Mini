package core.system;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Getter
public enum SystemFunction {
    ADD("add"),
    SUBTRACT("subtract"),
    MULTIPLY("multiply"),
    DIVIDE("divide"),
    MOD("mod"),
    PUSH("push"),
    POP("pop"),
    ALLOC("alloc"),
    FREE("free"),
    GET_BASE_PLUS("getBasePlus"),
    SET_BASE_PLUS("setBasePlus"),
    GET_HEAP("getHeap"),
    SET_HEAP("setHeap"),
    OUT("out");

    private String functionName;

    private static Map<String, SystemFunction> systemFunctions;

    static {
        systemFunctions = new HashMap<>();
        for (SystemFunction s : SystemFunction.values()) {
            systemFunctions.put(s.getFunctionName(), s);
        }
    }

    public static SystemFunction getSystemFunction(String functionName) {
        return systemFunctions.get(functionName);
    }

}
