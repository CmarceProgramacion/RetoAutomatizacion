package com.herokuapp.tasks;

import com.herokuapp.interactions.EnterValueToAlertAction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;

import static com.herokuapp.userinterfaces.HomePage.LABEL_MENU_OPTIONS_EXAMPLES;
import static com.herokuapp.userinterfaces.JavaScriptAlertsPage.BUTTON_JS_PROMPT;

public class SelectAlertPromptTask implements Task {
    private String message;

    public SelectAlertPromptTask(String message) {
        this.message = message;
    }

    public static Performable inputAlert(String message) {
        return Tasks.instrumented(SelectAlertPromptTask.class, message);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LABEL_MENU_OPTIONS_EXAMPLES.of("JavaScript Alerts")),
                Click.on(BUTTON_JS_PROMPT),
                EnterValueToAlertAction.withThedata(message),
                Switch.toAlert().andAccept()
        );
    }
}
