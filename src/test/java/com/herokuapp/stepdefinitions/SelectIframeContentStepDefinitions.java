package com.herokuapp.stepdefinitions;

import com.herokuapp.models.EditorOptionModel;
import com.herokuapp.questions.ValidateFormat;
import com.herokuapp.tasks.SelectIframeModifyFormat;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SelectIframeContentStepDefinitions {
    @When("I enter the content to the text editor with these formats")
    public void iEnterTheContentToTheTextEditorWithTheseFormats(List<List<String>> dataEditor) {
        EditorOptionModel editor = new EditorOptionModel(dataEditor.get(0));
        theActorInTheSpotlight().attemptsTo(
                SelectIframeModifyFormat.modifyFormat(editor)
        );
    }

    @Then("I check the content with the format {string}")
    public void iCheckTheContentWithTheFormat(String alignment) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateFormat.verifyAlignment(alignment))
        );
    }
}
