package com.regulus.pages;

import com.regulus.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NewNotePage extends DashboardPage {
    public NewNotePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(name = "tag_ids")
    public WebElement tagDropdwon;

    @FindBy(linkText = "Test Tag")
    public WebElement tag;

    @FindBy(xpath = "//div[@class='note-editable panel-body']")
    public WebElement textBox;

    @FindBy (xpath = "//div[@name='stage_id']/button[@data-value='997']")
    public WebElement timelineNotes;
    @FindBy (xpath = "//div[@name='stage_id']/button[@data-value='996']")
    public WebElement timelineLater;

    @FindBy (xpath = "//div[@name='stage_id']/button[@data-value='995']")
    public WebElement timelineThisWeek;

    @FindBy (xpath = "//div[@name='stage_id']/button[@data-value='994']")
    public WebElement timelineToday;

    @FindBy (xpath = "//div[@name='stage_id']/button[@data-value='993']")
    public WebElement timelineNew;

    @FindBy (xpath = "//button[@accesskey='s']")
    public WebElement saveBtn;

    @FindBy (xpath = "//div[@class='o_thread_message_core o_mail_note']")
    public WebElement message;

}
