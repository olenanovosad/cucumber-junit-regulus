package com.regulus.pages;

import com.regulus.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManufacturingPage {
    public ManufacturingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/web#menu_id=415&action=']")
    public WebElement manufacturingBtn;
    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createBtn;
    @FindBy(xpath = "//a[@data-menu='431']")
    public WebElement manuOrders;

    @FindBy(xpath = "//div[@class='o_form_sheet']")
    public WebElement newOrder;

    @FindBy(xpath = "//div[@name='product_id']")
    public WebElement producDropDown;
    @FindBy(partialLinkText = "iphone 8")
    public WebElement producOption;

   @FindBy(xpath = "//div[@name='bom_id']")
    public WebElement BillDropDown;

    @FindBy(xpath = "//td[@style='width: 100%;']/input")
    public WebElement SourceDropDown;

    @FindBy(linkText = "PoloBrito")
    public WebElement billOption;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement SaveBtn;

    @FindBy(xpath = "//div[@class='o_mail_thread']")
    public WebElement message;
}
