package com.regulus.step_definitions;

import com.regulus.pages.DashboardPage;
import com.regulus.pages.LogInPage;
import com.regulus.pages.NewNotePage;
import com.regulus.pages.NotesPage;
import com.regulus.utilities.BrowserUtils;
import com.regulus.utilities.ConfigurationReader;
import com.regulus.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UserStory08_Notes {

    NotesPage notesPage = new NotesPage();
    LogInPage logInPage = new LogInPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("User is logged in notes page")
    public void userIsLoggedInNotesPage() {

        logInPage.LogIn();
        notesPage.ClickMenu("Notes");
        BrowserUtils.sleep(2);
    }

    @When("user clicks create button")
    public void user_clicks_create_button() {
        BrowserUtils.sleep(4);
        notesPage.createBtn.click();
        BrowserUtils.sleep(4);
    }

    @Then("user sees {string} in the title")
    public void user_sees_in_the_title(String expectedTitle) {
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

    NewNotePage newNotePage = new NewNotePage();

    @When("user selects from existing tags")
    public void user_selects_from_existing_tags() {
        newNotePage.tagDropdwon.click();
        newNotePage.tag.click();
        BrowserUtils.sleep(4);
    }

    @When("user types in the text box")
    public void user_types_in_the_text_box() {
        newNotePage.textBox.sendKeys("Hello");
    }

    @When("user selects different options from timeline")
    public void user_selects_different_options_from_timeline() {
        newNotePage.timelineNotes.click();
        newNotePage.timelineLater.click();
        BrowserUtils.sleep(3);
        newNotePage.timelineThisWeek.click();
        newNotePage.timelineNew.click();
    }

    @When("user clicks save button")
    public void user_clicks_save_button() {
        newNotePage.saveBtn.click();
    }

    @Then("user sees Note Created message is displayed")
    public void user_sees_note_created_message_is_displayed() {
        Assert.assertTrue(newNotePage.message.isDisplayed());
    }

    @When("user clicks Notes module button")
    public void user_clicks_notes_module_button() {
        dashboardPage.notesPage.click();
    }

    @Then("user is Notes page and sees created note displayed")
    public void userIsNotesPageAndSeesCreatedNoteDisplayed() {
        Assert.assertTrue(notesPage.newNote.isDisplayed());
    }


    @Then("user is able to drag and drop new note under each timeline")
    public void userIsAbleToDragAndDropNewNoteUnderEachTimeline() {
        Actions actions = new Actions(Driver.getDriver());
        for (WebElement timeline : notesPage.timelines) {
            actions.dragAndDrop(notesPage.newNote, timeline).perform();
        }


    }
}
