package com.regulus.pages;

import com.regulus.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath="//a[@data-menu='194']")
    public WebElement notesPage;
}
