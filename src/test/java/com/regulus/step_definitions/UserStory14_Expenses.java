package com.regulus.step_definitions;

import com.regulus.pages.ExpensesPage;
import com.regulus.pages.LogInPage;
import com.regulus.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserStory14_Expenses {
    ExpensesPage expensesPage = new ExpensesPage();
    LogInPage logInPage = new LogInPage();

    @Given("User is logged in")
    public void user_is_logged_in() {
        logInPage.LogIn();
        BrowserUtils.sleep(3);

    }

    @When("user selects expenses option")
    public void user_selects_expenses_option() {
        expensesPage.ClickMenu("Expenses");
    }

    @When("user clicks Create button")
    public void user_clicks_create_button() {
        expensesPage.createBtn.click();
    }

    @Then("user should see expenses description page")
    public void user_should_see_expenses_description_page() {
        Assert.assertTrue(expensesPage.expensesWindow.isDisplayed());
    }

    @When("user fill out all fields")
    public void user_fill_out_all_fields() {
        expensesPage.nameInput.sendKeys("Cydeo");
        expensesPage.productDropdown.click();
        expensesPage.iphone.click();
        expensesPage.employeeDropdown.click();
        expensesPage.employeeopt.click();
        expensesPage.SaleorderDropdown.click();
        expensesPage.saleOrderopt.click();
        expensesPage.billRef.sendKeys("Hello");
    }

    @When("clicks save button")
    public void clicks_save_button() {
        expensesPage.saveBtn.click();

    }

    @Then("user should see confirmation info")
    public void user_should_see_confirmation_info() {
        Assert.assertTrue(expensesPage.message.isDisplayed());
    }

    @Then("expenses info")
    public void expenses_info() {
        Assert.assertTrue(expensesPage.form.isDisplayed());
    }

}
