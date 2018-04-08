package suiteBuilder.abstractFunctionalityContainer;

import suiteBuilder.testAreaContainer.LoginTestArea;
import suiteBuilder.testAreaContainer.TestArea;
import suiteBuilder.testSuiteBuilder.TestAttributes;

public abstract class LoginFunctionalityTest implements TestAttributes {
    @Override
    public TestArea testArea() {
        return new LoginTestArea();
    }

    @Override
    public abstract String priority();
}