package com.regulus.step_definitions;

import com.regulus.pages.LogInPage;
import com.regulus.pages.NotesPage;
import com.regulus.utilities.ConfigurationReader;
import com.regulus.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStory08_Notes {

    NotesPage notesPage = new NotesPage();
    LogInPage logInPage = new LogInPage();

    @Given("User is logged in notes page")
    public void userIsLoggedInNotesPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        logInPage.LogIn();
        notesPage.notesPage.click();

    }

    @When("user clicks create button")
    public void user_clicks_create_button() {
        notesPage.createBtn.click();
    }

    @Then("user sees {string} in the title")
    public void user_sees_in_the_title(String string) {

    }

    @When("user selects from existing tags")
    public void user_selects_from_existing_tags() {

    }

    @When("user types in the text box")
    public void user_types_in_the_text_box() {

    }

    @When("user selects different options from timeline")
    public void user_selects_different_options_from_timeline() {

    }

    @When("user clicks save button")
    public void user_clicks_save_button() {

    }

    @Then("user sees Note Created message is displayed")
    public void user_sees_note_created_message_is_displayed() {

    }

    @When("user clicks Notes module button")
    public void user_clicks_notes_module_button() {

    }

    @Then("user is Notes page and sees created note displayed")
    public void userIsNotesPageAndSeesCreatedNoteDisplayed() {
    }


}
