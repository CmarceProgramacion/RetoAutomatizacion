package com.herokuapp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;

import static com.herokuapp.userinterfaces.HomePage.LABEL_MENU_OPTIONS_EXAMPLES;
import static com.herokuapp.userinterfaces.JavaScriptAlertsPage.BUTTON_JS_ALERT;
import static com.herokuapp.utils.enums.OptionAlertEnum.OPTIONS_EXAMPLES_ALERTS;

public class SelectAlertAcceptTask implements Task {

    public static Performable acceptAlert() {
        return Tasks.instrumented(SelectAlertAcceptTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LABEL_MENU_OPTIONS_EXAMPLES.of(OPTIONS_EXAMPLES_ALERTS.getOption())),
                Click.on(BUTTON_JS_ALERT),
                Switch.toAlert().andAccept()
        );
    }
}
