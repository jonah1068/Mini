package core.language.antlr;

import core.system.CPU;
import language.antlr.MiniLexer;
import language.antlr.MiniParser;
import language.model.Program;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MiniParserTest {

    public static String program = "Integer main() { System.out(\"Hello, World! \"); }";
    public static boolean muteOutput = false;

    @Test
    public void testBasic() {
        ANTLRInputStream a = new ANTLRInputStream(program);
        MiniLexer m = new MiniLexer(a);
        CommonTokenStream c = new CommonTokenStream(m);
        MiniParser p = new MiniParser(c);
        if (muteOutput) {
            p.removeErrorListener(ConsoleErrorListener.INSTANCE);
        }

        try {
            Program program = p.program().p;
            program.execute(new CPU());
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getClass());
            e.printStackTrace(System.err);
        }
    }

}
