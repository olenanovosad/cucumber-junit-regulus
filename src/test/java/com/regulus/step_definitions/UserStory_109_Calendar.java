package com.regulus.step_definitions;

import com.regulus.pages.CalendarPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class UserStory_109_Calendar {
    CalendarPage calendarPage = new CalendarPage();

    @When("user click {string} menu option")
    public void user_click_menu_option(String linkText) {
        calendarPage.ClickMenu(linkText);
    }

    @Then("user is on calendar page")
    public void user_is_on_calendar_page() {
        Assert.assertTrue(calendarPage.header.getText().contains("Meetings"));
    }

    @Then("user sees following time list by default")
    public void user_sees_following_time_list_by_default(List<String> timeList) {
        List<String> timeText = new ArrayList<>();

        for (WebElement time : calendarPage.timeList) {
            timeText.add(time.getText());
        }
    Assert.assertEquals(timeList,timeText);

    }

}
