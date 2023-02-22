package com.regulus.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {
    public static void sleep(int seconds) {
        seconds *= 1000;
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {

        }
    }


    public static void switchWindowAndVerify(String expectedInUrl, String expectedTitle) {


        Set<String> allWindows = Driver.getDriver().getWindowHandles();

        for (String each : allWindows) {
            Driver.getDriver().switchTo().window(each);
            System.out.println("Current url: " + Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    public static void verifyTitle(WebDriver driver, String expectedTitle) {
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }

    public static void verifyTitle(String expectedTitle) {
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

    public static void verifyTitleContains(String expectedInURL) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInURL));
    }

    public static void waitFor_invesibility(WebElement target) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.invisibilityOf(target));
    }

    public static List<String> dropdownOptions_asString(WebElement element) {
        Select select = new Select(element);

        List<WebElement> elements = select.getOptions();
        List<String> list_of_String = new ArrayList<>();
        for (WebElement each : elements) {
            list_of_String.add(each.getText());
        }
        return list_of_String;
    }

    public static List<String> listElements_asString(List<WebElement> elements) {
        List<String> string = new ArrayList<>();
        for (WebElement element : elements) {
            string.add(element.getText());
        }
        return string;
    }

    public static void clickRadiobtn(List<WebElement> radioButtons, String attributeValue) {
        for (WebElement each : radioButtons) {
            if (each.getAttribute("value").equals(attributeValue)) {
                each.click();
            }
        }
    }
}
