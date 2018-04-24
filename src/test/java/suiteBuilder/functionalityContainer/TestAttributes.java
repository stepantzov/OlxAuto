package suiteBuilder.functionalityContainer;

import suiteBuilder.testAreaContainer.TestArea;

public interface TestAttributes {
    String name();

    TestArea testArea();

    String priority();

    void executeScope();

    long executionTime();

    int testCasesCount();
}