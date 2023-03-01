package com.regulus.pages;

import com.regulus.utilities.ConfigurationReader;
import com.regulus.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
    public LogInPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement emailInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement logInBtn;

    @FindBy(xpath = "//p[@class='alert alert-danger'] ")
    public WebElement invalidMsg;

    public void LogIn() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        emailInput.sendKeys(ConfigurationReader.getProperty("email"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        logInBtn.click();
    }

}
