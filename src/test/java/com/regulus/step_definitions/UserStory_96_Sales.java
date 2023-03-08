package com.regulus.step_definitions;

import com.regulus.pages.SalesPage;
import com.regulus.utilities.BrowserUtils;
import com.regulus.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class UserStory_96_Sales {
    SalesPage salesPage = new SalesPage();

    @Given("User is logged in as Sales Manager")
    public void user_is_logged_in_as_sales_manager() {
        salesPage.LogIn("salesmanager10@info.com", "salesmanager");
    }

    @When("User clicks Sales menu option")
    public void user_clicks_sales_menu_option() {
        salesPage.salesOption.click();
        BrowserUtils.sleep(1);
    }

    @Then("User is on quotations page")
    public void user_is_on_quotations_page() {
        Assert.assertTrue(salesPage.header.getText().contains("Quotations"));
    }

    @Then("user should see")
    public void user_should_see(List<String> columnsNames) {
        List<String> columnsText = new ArrayList<>();
        for (WebElement column : salesPage.columns) {
            columnsText.add(column.getText());
        }
        Assert.assertEquals(columnsNames, columnsText);
    }

    @Given("User is logged in as POS manager")
    public void userIsLoggedInAsPOSManager() {
        salesPage.LogIn();
    }
}
