package com.regulus.pages;

import com.regulus.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotesPage extends DashboardPage{

    public NotesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createBtn;



}
