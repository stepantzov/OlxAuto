package olxCucumber.definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import olxCucumber.steps.LoginSteps;
import org.junit.Assert;

public class LoginStepsDefinition {
    LoginSteps loginSteps = new LoginSteps();

    @Given("^Customer is on the Olx site main page$")
    public void customer_is_on_the_Olx_site_main_page() {
        Assert.assertTrue("Main page is not opened.", loginSteps.verifyOlxMainPage());
    }

    @When("^Customer want to log in Olx site by using 'My Profile' link$")
    public void pressMyProfileLink() {
        loginSteps.clickMyProfileLink();
    }

    @Then("^Customer has been redirected to Login Page$")
    public void verifyIfLoginPageOpened() {
        Assert.assertTrue("Facebook button is missing.", loginSteps.verifyFacebookButtonPresent());
    }

    @Then("^He is able lo log to Olx by using correct credentials$")
    public void logToOlxWithCorrectCredentials() {
        loginSteps.pressFacebookLoginButton();
        loginSteps.logInOlxWithCorrectCredentials();

        Assert.assertTrue("Customer is not logged to Olx.", loginSteps.verifyIfCustomerLoggedSuccessfully());
    }
}