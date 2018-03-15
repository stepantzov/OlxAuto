package testResultsRepoting;

import java.io.FileNotFoundException;

public interface PrintStreamReport {
    void textOutput() throws FileNotFoundException;

    void webOutput() throws FileNotFoundException;

    void richTextOutput() throws FileNotFoundException;
}