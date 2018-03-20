package testResultsRepoting;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface PrintStreamReport {
    void textOutput() throws IOException;

    void webOutput() throws FileNotFoundException;

    void richTextOutput() throws FileNotFoundException;
}