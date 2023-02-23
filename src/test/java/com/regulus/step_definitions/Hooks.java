package com.regulus.step_definitions;

import com.regulus.utilities.Driver;
import com.regulus.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
pre and post conditions for all of the scenarios/steps
 */
public class Hooks {
    //use one form io cucumber
    @Before
    public void setupMethod() {
        System.out.println("---> @Before : RUNNING BEFORE EACH SCENARIO");
    }

    @After
    public void teardownMethod(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenShot, "image/png", scenario.getName());
        }
        System.out.println("---> @After : RUNNING BEFORE EACH SCENARIO");
        // Driver.closeDriver();
    }

    //@BeforeStep
    public void setupStep() {
        System.out.println("---> @BeforeStep : RUNNING BEFORE EACH STEP");
    }

    // @AfterStep
    public void teardownStep() {
        System.out.println("---> @AfterStep : RUNNING After EACH STEP");
    }
}
