package com.regulus.step_definitions;

import com.regulus.pages.LogInPage;
import com.regulus.utilities.ConfigurationReader;
import com.regulus.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class UserStory02_LogIn {

    LogInPage logInPage = new LogInPage();

    @Given("User is on log in page")
    public void user_is_on_log_in_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user enters valid {string}")
    public void userEntersValid(String emails) {
        logInPage.emailInput.sendKeys(emails);

    }

    @When("user enters valid password {string}")
    public void user_enters_valid_password(String password) {
        logInPage.passwordInput.sendKeys(password);
        logInPage.logInBtn.click();
    }

    @Then("user should see the dashboard and see title {string}")
    public void user_should_see_the_dashboard_and_see_title(String expectedTitle) {
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }


    @When("user enters invalid email {string}")
    public void userEntersInvalid(String emails) {
        logInPage.emailInput.sendKeys(emails);
    }
    @And("user enters invalid password {string}")
    public void userEntersInvalidPassword(String password) {
        logInPage.passwordInput.sendKeys(password);
        logInPage.logInBtn.click();
    }

    @Then("user should see message {string}")
    public void userShouldSeeMessage(String expectedMessage) {
        Assert.assertTrue(expectedMessage.contains(logInPage.invalidMsg.getText()));

    }


}
