package suiteBuilder.testSuiteBuilder;

import java.util.ArrayList;
import java.util.List;

public class TestSuiteTemplate {
    private List<TestAttributes> items = new ArrayList<>();

    public void addTestArtifact(TestAttributes testAttributes) {
        items.add(testAttributes);
    }

    public void executeSuiteItemsScope() {
        for (TestAttributes testAttributes : items) {
            testAttributes.executeScope();
        }
    }

    public long getSuiteExecutionTime() {
        long executionTime = 0;

        for (TestAttributes testAttributes : items) {
            executionTime += testAttributes.executionTime();
        }

        return executionTime;
    }

    public long testSuiteTestCasesCount() {
        int testSuiteTestCasesCount = 0;
        for (TestAttributes testAttributes : items) {
            testSuiteTestCasesCount += testAttributes.testCasesCount();
        }

        return testSuiteTestCasesCount;
    }

    public void showTestItems() {
        for (TestAttributes testAttributes : items) {
            System.out.println("\nTest item: " + testAttributes.name());
            System.out.println("Area: " + testAttributes.testArea().area());
            System.out.println("Priority: " + testAttributes.priority());
            System.out.println("Execution time, sec: " + testAttributes.executionTime());
            System.out.println("Test Cases executed: "+testAttributes.testCasesCount());
        }
    }
}