package testsFacade;

import tests.AdvertPageTest;
import tests.LoginTest;
import tests.MyProfileSettingsPageTest;

public class TestMaker {
    private AdvertPageTest advertPageTest;
    private LoginTest loginTest;
    private MyProfileSettingsPageTest myProfileSettingsPageTest;

    public TestMaker() {
        advertPageTest = new AdvertPageTest();
        loginTest = new LoginTest();
        myProfileSettingsPageTest = new MyProfileSettingsPageTest();
    }

    public void testAdvertPage() {
        advertPageTest.getAdvertPageTest();
    }

    public void testLogin() {
        loginTest.myProfileValidationVerification();
        loginTest.myProfileLoginSuccessfulTest();
        loginTest.myProfileFacebookButtonPresent();
    }

    public void testMyProfileSettingsPage() {
        myProfileSettingsPageTest.MyProfileSettingsPageHeaderVerification();
    }
}