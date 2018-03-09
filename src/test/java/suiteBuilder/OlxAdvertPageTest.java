package suiteBuilder;

import tests.AdvertPageTest;

public class OlxAdvertPageTest extends LoginFunctionalityTest {
    @Override
    public String name() {
        return "OlxAdvertPageTest";
    }

    @Override
    public String priority() {
        return "medium";
    }

    @Override
    public void Scope() {
        AdvertPageTest advertPageTest = new AdvertPageTest();
        advertPageTest.getAdvertPageTest();
    }

    @Override
    public long executionTime() {
        return 0;
    }
}