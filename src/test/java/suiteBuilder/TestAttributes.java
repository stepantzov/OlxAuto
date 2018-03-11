package suiteBuilder;

public interface TestAttributes {
    String name();

    TestArea testArea();

    String priority();

    void executeScope();

    long executionTime();
}