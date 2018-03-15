package testResultsRepoting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamReportCreator implements PrintStreamReport {
    @Override
    public void textOutput() throws FileNotFoundException {
        PrintStream out = new PrintStream(new FileOutputStream("textOutput.txt"));
        System.setOut(out);
    }

    @Override
    public void webOutput() throws FileNotFoundException {
        PrintStream out = new PrintStream(new FileOutputStream("webOutput.html"));
        System.setOut(out);
    }

    @Override
    public void richTextFormat() throws FileNotFoundException {
        PrintStream out = new PrintStream(new FileOutputStream("richTextFormat.rtf"));
        System.setOut(out);
    }
}