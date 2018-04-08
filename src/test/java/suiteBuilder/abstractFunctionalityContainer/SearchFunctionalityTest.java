package suiteBuilder.abstractFunctionalityContainer;

import suiteBuilder.testAreaContainer.SearchTestArea;
import suiteBuilder.testAreaContainer.TestArea;
import suiteBuilder.testSuiteBuilder.TestAttributes;

public abstract class SearchFunctionalityTest implements TestAttributes {
    @Override
    public TestArea testArea() {
        return new SearchTestArea();
    }

    @Override
    public abstract String priority();
}