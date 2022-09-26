package com.herokuapp.stepdefinitions;

import com.herokuapp.questions.ValidatePhraseWindows;
import com.herokuapp.tasks.SelectMultipleWindowsTask;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class SelectMultipleWindowsStepDefinitions {

    @When("I enter the multiple windows option and interact with their content {string}")
    public void iEnterTheMultipleWindowsOptionAndInteractWithTheirContent(String phrase) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectMultipleWindowsTask.switchWindows(phrase)
        );
    }

    @Then("I verify the content of the window that contain the phrase {string}")
    public void iVerifyTheContentOfTheWindowThatContainThePhrase(String phrase) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidatePhraseWindows.verify(phrase))
        );
    }
}
