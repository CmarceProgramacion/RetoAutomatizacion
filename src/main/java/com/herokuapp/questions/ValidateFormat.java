package com.herokuapp.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.herokuapp.userinterfaces.JavaScriptAlertsPage.TEXT_AREA_EDITOR;

public class ValidateFormat implements Question<Boolean> {
    private String alignment;

    public ValidateFormat(String alignment) {
        this.alignment = alignment;
    }

    public static ValidateFormat verifyAlignment(String alignment) {
        return new ValidateFormat(alignment);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Switch.toFrame(0)
        );
        return TEXT_AREA_EDITOR.resolveFor(actor).getAttribute("style").contains(alignment.substring(6));
    }
}
