package testResultsRepoting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class GeneralPrintStream {
    public static void createSpecificPrintStream(String outputFileType) {
        PrintStream out = null;
        try {
            out = new PrintStream(new FileOutputStream(outputFileType));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.setOut(out);
    }
}