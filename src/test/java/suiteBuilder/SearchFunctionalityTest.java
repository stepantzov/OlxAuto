package suiteBuilder;

public abstract class SearchFunctionalityTest implements TestAttributes {
    @Override
    public TestArea testArea() {
        return new SearchTestArea();
    }

    @Override
    public abstract String priority();
}