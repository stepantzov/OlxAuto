package suiteBuilder.functionalityContainer;

import suiteBuilder.testAreaContainer.SearchTestArea;
import suiteBuilder.testAreaContainer.TestArea;

public abstract class SearchFunctionalityTest implements TestAttributes {
    @Override
    public TestArea testArea() {
        return new SearchTestArea();
    }

    @Override
    public abstract String priority();
}