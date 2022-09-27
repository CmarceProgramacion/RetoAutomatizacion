package com.herokuapp.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.herokuapp.userinterfaces.IframeEditorPage.TEXT_AREA_EDITOR;
import static com.herokuapp.utils.enums.OptionEditorEnum.OPTION_STYLE;

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
        return TEXT_AREA_EDITOR.resolveFor(actor).getAttribute(OPTION_STYLE.getOption()).contains(alignment.substring(6));
    }
}
