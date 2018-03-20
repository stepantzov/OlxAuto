package testResultsRepoting;

import java.io.IOException;

public interface PrintWriterReport {
    void txtFileResultsOutput() throws IOException;

    void htmlFileResultsOutput();

    void rtfFileResultsOutput();
}