package com.regulus.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SalesPage extends DashboardPage{

    @FindBy (xpath = "//tr//th[@class='o_column_sortable']")
    public List<WebElement> columns;

@FindBy (xpath = "(//ul//span[contains(.,'Sales')])[1]")
    public WebElement salesOption;

@FindBy (linkText = "Quotations")
    public WebElement header;
}
