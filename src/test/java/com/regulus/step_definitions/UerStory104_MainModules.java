package com.regulus.step_definitions;

import com.regulus.pages.DashboardPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class UerStory104_MainModules {
    DashboardPage dashboardPage = new DashboardPage();
    @Then("User should see {int} modules")
    public void user_should_see_modules(Integer modules) {
        Assert.assertTrue(dashboardPage.menuOptions.size()==modules);
    }
    @Then("see {string} as a user")
    public void see_as_a_user(String string) {
        Assert.assertEquals(dashboardPage.userName.getText(),string);
    }
}
