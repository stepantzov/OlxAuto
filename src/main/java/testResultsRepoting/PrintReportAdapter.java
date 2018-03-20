package testResultsRepoting;

import java.io.FileNotFoundException;
import java.io.IOException;

public class PrintReportAdapter implements PrintStreamReport {

    PrintWriterReport printWriterReport;

    public PrintReportAdapter(PrintWriterReport newPrintWriterReport) {
        printWriterReport = newPrintWriterReport;
    }

    @Override
    public void textOutput() throws IOException {
        printWriterReport.txtFileResultsOutput();
    }

    @Override
    public void webOutput() throws FileNotFoundException {
        printWriterReport.htmlFileResultsOutput();
    }

    @Override
    public void richTextOutput() throws FileNotFoundException {
        printWriterReport.rtfFileResultsOutput();
    }
}