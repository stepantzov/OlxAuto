package testResultsRepoting;

public class PrintStreamReportCreator implements PrintStreamReport {
    @Override
    public void textOutput() {
        System.out.println("Saving results to text format.");
        String outputType = "textOutput.txt";

        GeneralPrintStream.createSpecificPrintStream(outputType);
    }

    @Override
    public void webOutput() {
        System.out.println("Saving results to web format.");
        String outputType = "webOutput.html";

        GeneralPrintStream.createSpecificPrintStream(outputType);
    }

    @Override
    public void richTextOutput() {
        System.out.println("Saving results to rich text format.");
        String outputType = "webOutput.html";

        GeneralPrintStream.createSpecificPrintStream(outputType);
    }
}