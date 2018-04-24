package testsFacade;

import coreFunctions.TestConditions;
import org.junit.Test;

public class TestFacade extends TestConditions {
    @Test
    public void runTestMaker(){
        TestMaker testMaker = new TestMaker();
        testMaker.testMyProfileSettingsPage();
    }
}