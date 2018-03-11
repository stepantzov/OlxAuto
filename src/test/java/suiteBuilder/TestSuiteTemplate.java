package suiteBuilder;

import java.util.ArrayList;
import java.util.List;

public class TestSuiteTemplate {
    private List<TestAttributes> items = new ArrayList<TestAttributes>();

    public void addTestArtifact(TestAttributes testAttributes) {
        items.add(testAttributes);
    }

    public void executeSuiteItemsScope(){
        for (TestAttributes testAttributes : items){
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

    public void showTestItems() {
        for (TestAttributes testAttributes : items) {
            System.out.println("Test item: " + testAttributes.name());
            System.out.println("Area: " + testAttributes.testArea().area());
            System.out.println("Priority: " + testAttributes.priority());
            System.out.println("Execution time: " + testAttributes.executionTime());
        }
    }
}