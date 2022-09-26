package com.herokuapp.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

public class EnterAlertValue implements Interaction {
    private String message;

    public EnterAlertValue(String message) {
        this.message = message;
    }

    public static Performable withThedata(String message){
        return Tasks.instrumented(EnterAlertValue.class, message);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Serenity.getDriver().switchTo().alert().sendKeys(message);

    }
}