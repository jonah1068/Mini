package core;

import core.memory.Heap;
import core.memory.Instructions;
import core.memory.MemoryBlock;

import java.util.Scanner;
import java.util.Stack;

public class CPU {

    private static final Stack<MemoryBlock> stack = new Stack<>();
    private static final Heap heap = new Heap();
    private static final Instructions instructions = new Instructions();

    private static void startLive() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (sc.hasNextLine()) {
            System.out.println(i++ + " :" + sc.nextLine());
        }
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("No arguments provided, starting live mode.");
            startLive();
            return;
        }
        if (args[0].equals("-debug")) {

        } else if (args[0].equals("-execute")) {

        }

    }

}
