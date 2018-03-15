package testResultsRepoting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamReportCreator implements PrintStreamReport {
    @Override
    public void textOutput() throws FileNotFoundException {
        System.out.println("Saving results to text format.");
        PrintStream out = new PrintStream(new FileOutputStream("textOutput.txt"));
        System.setOut(out);
    }

    @Override
    public void webOutput() throws FileNotFoundException {
        System.out.println("Saving results to web format.");
        PrintStream out = new PrintStream(new FileOutputStream("webOutput.html"));
        System.setOut(out);
    }

    @Override
    public void richTextOutput() throws FileNotFoundException {
        System.out.println("Saving results to rich text format.");
        PrintStream out = new PrintStream(new FileOutputStream("richTextOutput.rtf"));
        System.setOut(out);
    }
}