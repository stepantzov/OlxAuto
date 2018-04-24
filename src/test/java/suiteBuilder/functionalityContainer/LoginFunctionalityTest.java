package suiteBuilder.functionalityContainer;

import suiteBuilder.testAreaContainer.LoginTestArea;
import suiteBuilder.testAreaContainer.TestArea;

public abstract class LoginFunctionalityTest implements TestAttributes {
    @Override
    public TestArea testArea() {
        return new LoginTestArea();
    }

    @Override
    public abstract String priority();
}