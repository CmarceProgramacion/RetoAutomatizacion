package com.herokuapp.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.herokuapp.userinterfaces.JavaScriptAlertsPage.LABEL_MESSAGE;

public class ValidatePhrase implements Question<Boolean> {
    private String phrase;

    public ValidatePhrase(String phrase) {
        this.phrase = phrase;
    }

    public static ValidatePhrase verify(String phrase) {
        return new ValidatePhrase(phrase);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return phrase.contentEquals(LABEL_MESSAGE.resolveFor(actor).getTextContent().substring(13));
    }
}
