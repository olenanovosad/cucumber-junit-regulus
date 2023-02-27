package com.regulus.step_definitions;

import com.regulus.pages.DashboardPage;
import com.regulus.pages.DocPage;
import com.regulus.pages.LogInPage;
import com.regulus.utilities.BrowserUtils;
import com.regulus.utilities.ConfigurationReader;
import com.regulus.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class UserStory16_Documentation {

    @Given("user is logged in")
    public void user_is_logged_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        LogInPage logInPage = new LogInPage();
        logInPage.LogIn();
    }

    DashboardPage dashboardPage = new DashboardPage();

    @When("user clicks {string} button")
    public void user_clicks_button(String text) {

        dashboardPage.ClickMenu(text);

    }

    @And("user clicks {string} option")
    public void userClicksOption(String option) {
        String mainHandle = Driver.getDriver().getWindowHandle();
        BrowserUtils.sleep(4);
        dashboardPage.ClickMenu(option);
        BrowserUtils.sleep(3);
        Set<String> windows = Driver.getDriver().getWindowHandles();


        for (String window : windows) {
            Driver.getDriver().switchTo().window(window);

        }
    }


    @Then("user sees  {string} in the url")
    public void user_sees_in_the_title(String string) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("documentation"));
    }

    DocPage docPage = new DocPage();

    @And("user sees {string} message is displayed")
    public void userSeesMessageIsDisplayed(String message) {

        Assert.assertTrue(docPage.message.isDisplayed());
    }

    @And("there are {int} main documents topics are listed")
    public void thereAreMainDocumentsTopicsAreListed(int arg0) {
        Assert.assertTrue(docPage.headers.size() == arg0);

    }
}
