package suiteBuilder;

import tests.SearchResultsLocalizedTest;
import tests.SearchResultsNotLocalizedTest;

import java.util.concurrent.TimeUnit;

public class OlxSearchTestSuite extends SearchFunctionalityTest {
    long executionDuration;

    @Override
    public String name() {
        return "OlxSearchTestSuite";
    }

    @Override
    public String priority() {
        return "High";
    }

    @Override
    public void executeScope() {
        long startTime = System.nanoTime();
        SearchResultsLocalizedTest searchResultsLocalizedTest = new SearchResultsLocalizedTest();
        searchResultsLocalizedTest.searchResultsLocalizedTestNoParameters();

        SearchResultsNotLocalizedTest searchResultsNotLocalizedTest = new SearchResultsNotLocalizedTest();
        searchResultsNotLocalizedTest.searchResultsNotLocalizedTestNoParameters();
        long endTime = System.nanoTime();

        executionDuration = TimeUnit.NANOSECONDS.toSeconds(endTime - startTime);
    }

    @Override
    public long executionTime() {
        return executionDuration;
    }
}