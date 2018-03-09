package suiteBuilder;

public class MainSuiteBuilder {
    public static void main(String[] args) {
        SuiteBuilder suiteBuilder = new SuiteBuilder();

        TestSuiteTemplate coreFunctionalitySuite = suiteBuilder.createCoreFunctionalitySuite();
        System.out.println("coreFunctionalitySuite");
        coreFunctionalitySuite.showTestItems();
        System.out.println("coreFunctionalitySuite execution time:");
        coreFunctionalitySuite.getSuiteExecutionTime();

        TestSuiteTemplate lowPrioritySuite = suiteBuilder.createRestFunctionalitySuite();
        System.out.println("restFunctionalitySuite");
        lowPrioritySuite.showTestItems();
        System.out.println("restFunctionalitySuite execution time:");
        lowPrioritySuite.getSuiteExecutionTime();
    }
}