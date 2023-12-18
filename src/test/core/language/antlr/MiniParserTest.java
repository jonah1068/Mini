package core.language.antlr;

import core.system.CPU;
import language.antlr.MiniLexer;
import language.antlr.MiniParser;
import language.model.Program;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.junit.jupiter.api.Test;

import java.io.*;

public class MiniParserTest {

    public static String program = """
            Integer main() { 
                System.out("main\\n");
                a();
                a();
                return 0;
            }
                        
            Integer a(Integer i) {
                System.out("a\\n");
                b();
                return 0;
            }
                        
            Integer b() {
                System.out("b\\n");
                return 0;
            }
            """;
    public static boolean muteOutput = false;

    @Test
    public void testBasic() {
        ANTLRInputStream a = new ANTLRInputStream(program);
        MiniParser parser = new MiniParser(new CommonTokenStream(new MiniLexer(a)));
        if (muteOutput) {
            parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
        }

        try {
            Program program = parser.program().p;
            program.execute(new CPU());
            FileOutputStream pw = new FileOutputStream("build/tmp/test/out.ser");
            ObjectOutputStream out = new ObjectOutputStream(pw);
            out.writeObject(program);
            out.close();
            pw.close();

            FileInputStream fileIn = new FileInputStream("build/tmp/test/out.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Program program2 = (Program) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("\n===============================\n");

            System.out.println(program2.prettyPrint());
        }
        catch (Exception e) {
            System.out.println(e.getClass());
            e.printStackTrace(System.err);
        }
    }

}
