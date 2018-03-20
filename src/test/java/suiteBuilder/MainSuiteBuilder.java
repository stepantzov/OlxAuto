package suiteBuilder;

import coreFunctions.TestConditions;
import org.junit.Test;
import testResultsRepoting.PrintReportAdapter;
import testResultsRepoting.PrintWriterReportCreator;

import java.io.FileNotFoundException;

public class MainSuiteBuilder extends TestConditions {
    SuiteBuilder suiteBuilder = new SuiteBuilder();

    @Test
    public void highPriorityTestSuiteBuilder() {
        System.out.println("________________________\nCore functionality test suite (1):\n________________________\n");
        TestSuiteTemplate coreFunctionalitySuite = suiteBuilder.createCoreFunctionalitySuite();
        coreFunctionalitySuite.executeSuiteItemsScope();
        System.out.println("________________________\nCore Functionality Suite Items:");
        coreFunctionalitySuite.showTestItems();
        System.out.println("Total test cases executed count: " + coreFunctionalitySuite.testSuiteTestCasesCount());
        System.out.format("\nCoreFunctionalitySuite execution time: %d seconds \n", coreFunctionalitySuite.getSuiteExecutionTime());
        coreFunctionalitySuite.getSuiteExecutionTime();
        System.out.format("Core Suite execution completed.\n________________________\n");
    }

    @Test
    public void lowPriorityTestSuiteBuilder() {
        System.out.println("________________________\nLow priority test suite (2):\n________________________\n");
        TestSuiteTemplate restFunctionalitySuite = suiteBuilder.createRestFunctionalitySuite();
        restFunctionalitySuite.executeSuiteItemsScope();
        System.out.println("________________________\nLow Functionality Suite Items:");
        restFunctionalitySuite.showTestItems();
        System.out.println("Total Low priority test cases executed count: " +
                restFunctionalitySuite.testSuiteTestCasesCount());
        System.out.format("Low priority suite execution time: %d seconds.\n", restFunctionalitySuite.getSuiteExecutionTime());
        System.out.format("Low priority suite execution completed.\n________________________\n");

        PrintWriterReportCreator printWriterReportCreator = new PrintWriterReportCreator();
        PrintReportAdapter printReportAdapter = new PrintReportAdapter(printWriterReportCreator);
        try {
            printReportAdapter.richTextOutput();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}