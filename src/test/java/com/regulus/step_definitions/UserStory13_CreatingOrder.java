package com.regulus.step_definitions;

import com.regulus.pages.LogInPage;
import com.regulus.pages.ManufacturingPage;
import com.regulus.utilities.ConfigurationReader;
import com.regulus.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserStory13_CreatingOrder {
    LogInPage logInPage = new LogInPage();
    ManufacturingPage manufacturingPage = new ManufacturingPage();

    @Given("user is logged in on Manufacturing page")
    public void user_is_logged_in_on_manufacturing_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        logInPage.LogIn();
        manufacturingPage.manufacturingBtn.click();
    }

    @When("user clicks create")
    public void user_clicks_create() {
        manufacturingPage.createBtn.click();
    }

    @Then("user sees New order page")
    public void user_sees_new_order_page() {
        Assert.assertTrue(manufacturingPage.newOrder.isDisplayed());
    }

    @When("user fills in all fields")
    public void user_fills_in_all_fields() {
        manufacturingPage.producDropDown.click();
        manufacturingPage.producOption.click();
        // manufacturingPage.BillDropDown.click();
        //manufacturingPage.billOption.click();
        manufacturingPage.SourceDropDown.sendKeys("Olena");
    }

    @When("user clicks Save button")
    public void user_clicks_save_button() {
        manufacturingPage.SaveBtn.click();
    }

    @Then("user sees order confirmation message displayed")
    public void user_sees_order_confirmation_message_displayed() {
        Assert.assertTrue(manufacturingPage.message.isDisplayed());
    }
}
