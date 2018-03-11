package suiteBuilder;

public class SuiteBuilder {
    public TestSuiteTemplate createCoreFunctionalitySuite() {
        TestSuiteTemplate coreSuite = new TestSuiteTemplate();
        coreSuite.addTestArtifact(new OlxLoginTestSuite());
        coreSuite.addTestArtifact(new OlxSearchTestSuite());

        return coreSuite;
    }

    public TestSuiteTemplate createRestFunctionalitySuite() {
        TestSuiteTemplate lowPrioritySuite = new TestSuiteTemplate();
        lowPrioritySuite.addTestArtifact(new OlxMyProfileTestSuite());
        lowPrioritySuite.addTestArtifact(new OlxAdvertPageTestSuite());

        return lowPrioritySuite;
    }
}