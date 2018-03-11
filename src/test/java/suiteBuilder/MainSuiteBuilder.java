package suiteBuilder;

import coreFunctions.TestConditions;
import org.junit.Test;

public class MainSuiteBuilder extends TestConditions {
    SuiteBuilder suiteBuilder = new SuiteBuilder();

    @Test
    public void highPriorityTestSuiteBuilder() {
        TestSuiteTemplate coreFunctionalitySuite = suiteBuilder.createCoreFunctionalitySuite();
        coreFunctionalitySuite.executeSuiteItemsScope();
        System.out.println("Core Functionality Suite:");
        coreFunctionalitySuite.showTestItems();
        System.out.println("CoreFunctionalitySuite execution time:");
        coreFunctionalitySuite.getSuiteExecutionTime();
    }

    @Test
    public void lowPriorityTestSuiteBuilder() {
        TestSuiteTemplate lowPrioritySuite = suiteBuilder.createRestFunctionalitySuite();
        System.out.println("restFunctionalitySuite");
        lowPrioritySuite.showTestItems();
        System.out.println("restFunctionalitySuite execution time:");
        lowPrioritySuite.getSuiteExecutionTime();
    }
}