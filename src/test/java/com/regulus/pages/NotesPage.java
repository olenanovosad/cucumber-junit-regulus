package com.regulus.pages;

import com.regulus.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NotesPage extends DashboardPage{

    public NotesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new']")
    public WebElement createBtn;

@FindBy(xpath="//div[@modifiers='{}'][1]")
    public WebElement newNote;

@FindBy(xpath = "//div[@data-id='994']")
    public WebElement todayTimeLine;

    @FindBy(xpath = "//div[@data-id='993']")
    public WebElement newTimeLine;


    @FindBy(xpath = "//div[@data-id='995']")
    public WebElement thisWeekTimeLine;

    @FindBy(xpath = "//div[@data-id='996']")
    public WebElement LaterTimeLine;

    @FindBy(xpath = "//div[@data-id='997']")
    public WebElement notesTimeLine;
}
