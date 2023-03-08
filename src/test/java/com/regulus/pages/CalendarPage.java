package com.regulus.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CalendarPage extends DashboardPage{

@FindBy (xpath = "//tbody/tr[@data-time]//span")
    public List<WebElement> timeList;

@FindBy (xpath = "//li[contains(.,'Week 10')]")
    public WebElement header;
}
