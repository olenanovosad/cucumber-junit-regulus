package com.regulus.step_definitions;

import com.regulus.pages.DashboardPage;
import com.regulus.pages.LogInPage;
import com.regulus.pages.POSpage;
import com.regulus.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class UserStory12_POS {
    LogInPage logInPage = new LogInPage();
    POSpage poSpage = new POSpage();

    @Given("user is logged in POS page")
    public void user_is_logged_in_pos_page() {
        logInPage.LogIn();
        BrowserUtils.sleep(2);
        poSpage.ClickMenu("Point of Sale");

    }

    @When("user clicks Orders option")
    public void user_clicks_orders_option() {
        poSpage.ordersOption.click();
    }

    @When("user selects Order Ref checkbox")
    public void user_selects_order_ref_checkbox() {
        poSpage.OrderRefCheckbox.click();
        BrowserUtils.sleep(2);
    }

    @Then("all orders should be selected")
    public void all_orders_should_be_selected() {
        for (WebElement order : poSpage.allOrders) {
            Assert.assertTrue(order.isSelected());
        }
        BrowserUtils.sleep(5);
    }

    @Then("Action dropdown should be displayed")
    public void action_dropdown_should_be_displayed() {
        Assert.assertTrue(poSpage.actionDropDown.isDisplayed());
    }


    @When("user click action dropdown")
    public void userClickActionDropdown() {
        poSpage.actionDropDown.click();
    }

    @Then("user sees {int} options")
    public void userSeesOptions(int options) {
        Assert.assertTrue(options == poSpage.dropdwonOptions.size());
    }
}
