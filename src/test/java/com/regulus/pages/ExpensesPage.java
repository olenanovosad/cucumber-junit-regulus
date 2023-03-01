package com.regulus.pages;

import com.regulus.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpensesPage extends DashboardPage {

    public ExpensesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[contains(.,'Create')]")
    public WebElement createBtn;

    @FindBy(xpath = "//div[@class='o_form_sheet']")
    public WebElement expensesWindow;

    @FindBy(xpath = "//h1/input")
    public WebElement nameInput;

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[1]")
    public WebElement productDropdown;
    @FindBy(partialLinkText = "iphone")
    public WebElement iphone;

    @FindBy(partialLinkText = "Adelaida")
    public WebElement employeeopt;

    @FindBy(partialLinkText = "SO811 - Al banana")
    public WebElement saleOrderopt;


    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[4]")
    public WebElement employeeDropdown;


    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[5]")
    public WebElement SaleorderDropdown;

    @FindBy(xpath = "//td/input")
    public WebElement billRef;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveBtn;
    @FindBy(xpath = "//div[@class='o_thread_message_core o_mail_note']")
    public WebElement message;

    @FindBy(xpath = "//div[@class='o_form_sheet_bg']")
    public WebElement form;
}
