package suiteBuilder;

import coreFunctions.TestConditions;
import org.junit.Test;

public class MainSuiteBuilder extends TestConditions {
    SuiteBuilder suiteBuilder = new SuiteBuilder();

    @Test
    public void lowPriorityTestSuiteBuilder() {
        TestSuiteTemplate restFunctionalitySuite = suiteBuilder.createRestFunctionalitySuite();
        restFunctionalitySuite.executeSuiteItemsScope();
        System.out.println("\nRest Functionality Suite Items:");
        restFunctionalitySuite.showTestItems();
        System.out.format("restFunctionalitySuite execution time: %d\n", restFunctionalitySuite.getSuiteExecutionTime());
    }


    @Test
    public void highPriorityTestSuiteBuilder() {
        TestSuiteTemplate coreFunctionalitySuite = suiteBuilder.createCoreFunctionalitySuite();
        coreFunctionalitySuite.executeSuiteItemsScope();
        System.out.println("\nCore Functionality Suite Items:");
        coreFunctionalitySuite.showTestItems();
        System.out.format("\nCoreFunctionalitySuite execution time: %d\n", coreFunctionalitySuite.getSuiteExecutionTime());
        coreFunctionalitySuite.getSuiteExecutionTime();
    }
}