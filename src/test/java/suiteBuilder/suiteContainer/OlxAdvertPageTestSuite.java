package suiteBuilder.suiteContainer;

import suiteBuilder.functionalityContainer.LoginFunctionalityTest;
import tests.AdvertPageTest;

import java.util.concurrent.TimeUnit;

public class OlxAdvertPageTestSuite extends LoginFunctionalityTest {
    long executionDuration;
    int testCasesCount = 1;

    @Override
    public String name() {
        return "OlxAdvertPageTestSuite";
    }

    @Override
    public String priority() {
        return "medium";
    }

    @Override
    public void executeScope() {
        long startTime = System.nanoTime();
        AdvertPageTest advertPageTest = new AdvertPageTest();
        advertPageTest.getAdvertPageTest();
        long endTime = System.nanoTime();

        executionDuration = TimeUnit.NANOSECONDS.toSeconds(endTime - startTime);
    }

    @Override
    public long executionTime() {
        return executionDuration;
    }

    @Override
    public int testCasesCount() {
        return testCasesCount;
    }
}