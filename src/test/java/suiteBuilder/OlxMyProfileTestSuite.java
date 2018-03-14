package suiteBuilder;

import tests.MyProfileSettingsPageTest;

import java.util.concurrent.TimeUnit;

public class OlxMyProfileTestSuite extends LoginFunctionalityTest {
    long executionDuration;
    int testCasesCount = 1;

    @Override
    public String name() {
        return "MyProfileTestSuite";
    }

    @Override
    public String priority() {
        return "medium";
    }

    @Override
    public void executeScope() {
        long startTime = System.nanoTime();
        MyProfileSettingsPageTest myProfileSettingsPageTest = new MyProfileSettingsPageTest();
        myProfileSettingsPageTest.MyProfileSettingsPageHeaderVerification();
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