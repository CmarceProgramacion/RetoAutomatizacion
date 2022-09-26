package com.herokuapp.stepdefinitions;

import com.herokuapp.questions.ValidatePhrase;
import com.herokuapp.tasks.SelectClickJsPrompt;
import com.herokuapp.userinterfaces.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EnterAlertStepdefinitions {

    @Before
    public void initialConfing() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("Lucia");
    }

    @Given("that I access the herokuapp platform")
    public void thatIAccessTheHerokuappPlatform() {
        theActorInTheSpotlight().wasAbleTo(
                Open.browserOn().the(HomePage.class)
        );
    }

    @When("I select JS alert and interact with the alert")
    public void iSelectJSAlertAndInteractWithTheAlert() {
//        theActorInTheSpotlight().attemptsTo(
//                SelectJsaAlertTask.selectAlert()//
//        );
    }

    @Then("I verify that {string} appears")
    public void iVerifyThatAppears(String string) {

    }

    @When("I select JS Prompt, interact with the alert and enter the phrase {string}.")
    public void iSelectJSPromptInteractWithTheAlertAndEnterThePhrase(String phrase) {
        theActorInTheSpotlight().attemptsTo(
                SelectClickJsPrompt.selectAlert(phrase)
        );
    }

    @Then("verify that Result appears with the phrase {string}")
    public void verifyThatAppearsWithThePhrase(String phrase) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidatePhrase.verify(phrase))
        );
    }
}
