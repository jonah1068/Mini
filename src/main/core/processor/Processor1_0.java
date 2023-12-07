package core.processor;

import core.system.CPU;
import core.system.SystemFunction;

import java.util.HashMap;
import java.util.Scanner;

public class Processor1_0 implements Processor {

    private final CPU cpu;
    private final Scanner sc;
    private final HashMap<String, Integer> offsets;
    private int offsetCounter;

    public Processor1_0(CPU cpu) {
        this.cpu = cpu;
        sc = new Scanner(System.in);
        offsets = new HashMap<>();
        offsetCounter = 0;
    }

    public void startLive() {
        int lineNumber = 1;
        String[] line;
        System.out.print("0 $ ");
        loop:
        while (sc.hasNextLine()) {
            try {
                line = sc.nextLine().trim().split("\\s+");
                if (line[0].isEmpty()) {
                    continue;
                }
                if (line[0].equals("out")) {
                    if (line.length != 2) {
                        System.out.println("Syntax Error: out INT_LITERAL/VAR_NAME");
                        continue;
                    }

                    int output;
                    try {
                        output = getValue(line[1]);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }

                    cpu.handleSystemFunction(SystemFunction.OUT, output);
                } else if (line[0].equals("let")) {
                    if (line.length != 4 || !line[2].equals("=")) {
                        System.out.println("Syntax Error: let VAR_NAME = INT_VALUE");
                        continue;
                    }
                    if (offsets.containsKey(line[1])) {
                        System.out.println("Runtime Error: variable " + line[1] + " was already defined.");
                        continue;
                    }

                    offsets.put(line[1], offsetCounter++);
                    cpu.handleSystemFunction(SystemFunction.PUSH, Integer.parseInt(line[3]));
                } else if (line[1].equals("=")) {
                    if (!offsets.containsKey(line[0])) {
                        System.out.println("Runtime Error: variable " + line[1] + " is not defined.");
                        continue;
                    }
                    int[] vals = new int[2];
                    for (int i = 0; i < 2; i++) {
                        try {
                            vals[i] = getValue(line[2 * i + 2]);
                        } catch (RuntimeException e) {
                            System.out.println(e.getMessage());
                            continue loop;
                        }
                    }
                    for (int i = 1; i >= 0; i--) {
                        cpu.handleSystemFunction(SystemFunction.PUSH, vals[i]);
                    }
                    switch (line[3]) {
                        case "+":
                            cpu.handleSystemFunction(SystemFunction.SET_BASE_PLUS, offsets.get(line[0]),
                                    cpu.handleSystemFunction(SystemFunction.ADD, vals[0], vals[1]));
                    }
                }
            } finally {
                System.out.print(lineNumber++ + " $ ");
            }
        }
    }

    private int getValue(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            if (offsets.containsKey(s)) {
                return cpu.handleSystemFunction(SystemFunction.GET_BASE_PLUS, offsets.get(s));
            } else {
                throw new RuntimeException("Runtime Error: variable " + s + " is not defined.");
            }
        }
    }

}
