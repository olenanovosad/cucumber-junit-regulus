package com.regulus.pages;

import com.regulus.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class POSpage extends DashboardPage {
    public POSpage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(partialLinkText = "Orders")
    public WebElement ordersOption;

    @FindBy(xpath = "//th[contains(.,'Order Ref')]")
    public WebElement OrderRef;

    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    public WebElement OrderRefCheckbox;
    @FindBy(xpath = "//tr//input[@type='checkbox']")
    public List<WebElement> allOrders;

    @FindBy(xpath = "(//div[@class='btn-group o_dropdown'])[2]")
    public WebElement actionDropDown;

}