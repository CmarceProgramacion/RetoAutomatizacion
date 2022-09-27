package com.herokuapp.stepdefinitions;

import com.herokuapp.questions.ValidatePhraseAlerts;
import com.herokuapp.tasks.SelectAlertAcceptTask;
import com.herokuapp.tasks.SelectAlertConfirmTask;
import com.herokuapp.tasks.SelectAlertPromptTask;
import com.herokuapp.userinterfaces.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SelectAlertStepDefinitions {

    @Given("that I access the herokuapp platform")
    public void thatIAccessTheHerokuappPlatform() {
        theActorInTheSpotlight().wasAbleTo(
                Open.browserOn().the(HomePage.class)
        );
    }

    @When("I select JS alert and interact with the alert")
    public void iSelectJSAlertAndInteractWithTheAlert() {
        theActorInTheSpotlight().attemptsTo(
                SelectAlertAcceptTask.acceptAlert()
        );
    }

    @When("I select JS Prompt interact with the alert and enter the phrase {string}")
    public void iSelectJSPromptInteractWithTheAlertAndEnterThePhrase(String phrase) {
        theActorInTheSpotlight().attemptsTo(
                SelectAlertPromptTask.writeInAlert(phrase)
        );
    }

    @When("I select JS Confirm and interact with the alert")
    public void iSelectJSConfirmAndInteractWithTheAlert() {
        theActorInTheSpotlight().attemptsTo(
                SelectAlertConfirmTask.confirmAlert()
        );
    }

    @Then("verify that Result appears with the phrase {string}")
    public void verifyThatAppearsWithThePhrase(String phrase) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidatePhraseAlerts.verify(phrase))
        );
    }
}
