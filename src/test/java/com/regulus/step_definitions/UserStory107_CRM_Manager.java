package com.regulus.step_definitions;

import com.regulus.pages.DashboardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserStory107_CRM_Manager {
    DashboardPage dashboardPage = new DashboardPage();

    @When("user enters valid email {string} enters password {string}")
    public void userEntersValidEmailEntersPassword(String arg0, String arg1) {
        dashboardPage.LogIn(arg0, arg1);
    }

    @Then("user is should be able to access to main page")
    public void user_is_should_be_able_to_access_to_main_page() {
        Assert.assertTrue(dashboardPage.headerInbox.getText().contains("Inbox"));
    }

    @Then("see {string} as account holder name")
    public void see_as_account_holder_name(String string) {
        Assert.assertEquals(dashboardPage.userNameCRM.getText(), string);
    }


}
