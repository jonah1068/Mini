package language.model;

import core.system.CPU;
import core.system.SystemFunction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LiteralExpression extends Expression {

    final PrimitiveType.Type type;
    final String literalValue;

    public LiteralExpression(final PrimitiveType.Type type, final String value) {
        super(null, null);
        this.type = type;
        this.literalValue = value;
    }

    public static String escape(String s) {
        switch (s) {
            case "\\":
                return "\\\\";
            case "\"":
                return "\\\"";
            case "t":
                return "\t";
            case "n":
                return "\n";
        }
        throw new RuntimeException("Invalid escape character " + s);
    }

    public void execute(CPU cpu) {
        switch (type) {
            case STRING -> handleString(cpu);
            case INTEGER -> handleInteger(cpu);
        }
    }

    private void handleInteger(CPU cpu) {
        cpu.handleSystemFunction(SystemFunction.PUSH, Integer.parseInt(literalValue));
    }

    private void handleString(CPU cpu) {
        Pattern pattern = Pattern.compile("\\\\(.)");
        Matcher matcher = pattern.matcher(literalValue);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, escape(matcher.group(1)));
        }
        matcher.appendTail(sb);
        String actualValue = sb.toString();

        int addr = cpu.handleSystemFunction(SystemFunction.ALLOC, actualValue.length() + 1);
        if (addr < 0) {
            throw new RuntimeException("Heap is full");
        }
        char[] chars = actualValue.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            cpu.handleSystemFunction(SystemFunction.SET_HEAP, addr + i, chars[i]);
        }
        cpu.handleSystemFunction(SystemFunction.SET_HEAP, addr + chars.length, '\0');

        cpu.handleSystemFunction(SystemFunction.PUSH, addr);
    }

    @Override
    public String prettyPrint(int tabs) {
        switch (type) {
            case STRING:
                return '"' + literalValue + '"';
            default:
                return literalValue;
        }
    }

}
