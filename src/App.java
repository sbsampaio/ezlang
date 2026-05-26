import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import checker.SemanticChecker;
import parser.*;

public class App {

    public static void main(String[] args) throws IOException {
        CharStream input = CharStreams.fromFileName(args[0]);
        EZLexer lexer = new EZLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EZParser parser = new EZParser(tokens);
        ParseTree tree = parser.program();

        if (parser.getNumberOfSyntaxErrors() != 0) {
            return;
        }

        SemanticChecker sc = new SemanticChecker();
        sc.visit(tree);

        System.out.println("PARSE SUCCESSFUL!\n\n");
        sc.printStrings();
        System.out.println("\n");
        sc.printSymbols();
        System.out.println("\n");
    }
}
