package com.regulus.pages;

import com.regulus.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocPage {
    public DocPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy (tagName = "h1")
    public WebElement message;
}
