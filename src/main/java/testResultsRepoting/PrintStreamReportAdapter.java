package testResultsRepoting;

import java.io.FileNotFoundException;
import java.io.IOException;

public class PrintStreamReportAdapter implements PrintStreamReport {
    LoggerReport loggerReport;

    public PrintStreamReportAdapter(LoggerReport newLoggerReport) {
        loggerReport = newLoggerReport;
    }

    @Override
    public void textOutput() throws IOException {
        loggerReport.txtFileResultsOutput();
    }

    @Override
    public void webOutput() throws FileNotFoundException {
        loggerReport.htmlFileResultsOutput();
    }

    @Override
    public void richTextOutput() throws FileNotFoundException {
        loggerReport.rtfFileResultsOutput();
    }
}