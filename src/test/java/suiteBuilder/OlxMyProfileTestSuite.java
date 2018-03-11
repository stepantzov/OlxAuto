package suiteBuilder;

import tests.MyProfileSettingsPageTest;

public class OlxMyProfileTestSuite extends LoginFunctionalityTest {
    long executionDuration;

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

        executionDuration = (endTime - startTime);
    }

    @Override
    public long executionTime() {
        return executionDuration;
    }
}
