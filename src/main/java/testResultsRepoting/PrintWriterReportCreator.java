package testResultsRepoting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PrintWriterReportCreator implements PrintWriterReport {
    @Override
    public void txtFileResultsOutput() {
        String fileName = "txtFileResultsOutput.txt";
        try {
            PrintWriter printWriter = new PrintWriter(fileName);
            printWriter.print(new FileOutputStream(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void htmlFileResultsOutput() {
        String fileName = "htmlFileResultsOutput.txt";
        try {
            PrintWriter printWriter = new PrintWriter(fileName);
            printWriter.print(new FileOutputStream(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rtfFileResultsOutput() {
        String fileName = "rtfFileResultsOutput.txt";
        try {
            PrintWriter printWriter = new PrintWriter(fileName);
            printWriter.print(new FileOutputStream(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}