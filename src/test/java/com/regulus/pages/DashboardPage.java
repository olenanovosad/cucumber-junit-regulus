package com.regulus.pages;

import com.regulus.utilities.ConfigurationReader;
import com.regulus.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath="//a[@href='/web#menu_id=194&action=220']")
    public WebElement notesPage;


public void ClickMenu(String linkText){
    WebElement element = Driver.getDriver().findElement(By.partialLinkText(linkText));
element.click();
}

    @FindBy(id = "login")
    public WebElement emailInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement logInBtn;

public void LogIn() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        emailInput.sendKeys(ConfigurationReader.getProperty("email"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        logInBtn.click();
    }

    public void LogIn(String username, String password) {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        emailInput.sendKeys(username);
        passwordInput.sendKeys(password);
        logInBtn.click();
    }
}
