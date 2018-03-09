package suiteBuilder;

import tests.LoginTest;

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
    public void Scope() {
        long startTime = System.nanoTime();
        LoginTest loginTest = new LoginTest();
        loginTest.myProfileFacebookButtonPresent();
        loginTest.myProfileLoginSuccessfulTest();
        loginTest.myProfileValidationVerification();
        long endTime = System.nanoTime();
        executionDuration = (endTime - startTime);
    }

    @Override
    public long executionTime() {
        return executionDuration;
    }
}