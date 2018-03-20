package testResultsRepoting;

public class PrintWriterReportCreator implements PrintWriterReport {
    @Override
    public void txtFileResultsOutput() {
        String fileName = "txtFileResultsOutput.txt";

        System.out.println("Saving results to text format on htmlFileResultsOutput.txt");
        GeneralLogger.createSpecificLogger(fileName);
    }

    @Override
    public void htmlFileResultsOutput() {
        String fileName = "htmlFileResultsOutput.html";

        System.out.println("Saving results to html format on htmlFileResultsOutput.txt");
        GeneralLogger.createSpecificLogger(fileName);
    }

    @Override
    public void rtfFileResultsOutput() {
        String fileName = "rtfFileResultsOutput.rtf";

        System.out.println("Saving results to rtf format on rtfFileResultsOutput.txt");
        GeneralLogger.createSpecificLogger(fileName);
    }
}