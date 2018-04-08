package testResultsRepoting;

import java.io.IOException;

public interface LoggerReport {
    void txtFileResultsOutput() throws IOException;

    void htmlFileResultsOutput();

    void rtfFileResultsOutput();
}