package suiteBuilder;

import tests.LoginTest;

import java.util.concurrent.TimeUnit;

public class OlxLoginTestSuite extends LoginFunctionalityTest {
    long executionDuration;

    @Override
    public String name() {
        return "OlxLoginTestSuite";
    }

    @Override
    public String priority() {
        return "High";
    }

    @Override
    public void executeScope() {
        long startTime = System.nanoTime();
        LoginTest loginTest = new LoginTest();
        loginTest.myProfileValidationVerification();
        loginTest.myProfileFacebookButtonPresent();
        loginTest.myProfileLoginSuccessfulTest();
        long endTime = System.nanoTime();

        executionDuration = TimeUnit.NANOSECONDS.toSeconds(endTime - startTime);
    }

    @Override
    public long executionTime() {

        return executionDuration;
    }
}