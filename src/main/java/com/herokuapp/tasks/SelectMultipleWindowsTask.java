package com.herokuapp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.herokuapp.userinterfaces.HomePage.LABEL_MENU_OPTIONS_EXAMPLES;
import static com.herokuapp.userinterfaces.MultipleWindowsPage.LABEL_MESSAGE_NEW_WINDOW;
import static com.herokuapp.userinterfaces.MultipleWindowsPage.LABEL_MESSAGE_WINDOW;
import static com.herokuapp.utils.enums.OptionWindowsEnum.OPTIONS_EXAMPLES_MULTIPLE_WINDOWS;
import static com.herokuapp.utils.enums.OptionWindowsEnum.TITLE_MAIN_WINDOWS;

public class SelectMultipleWindowsTask implements Task {
    private String phrase;

    public SelectMultipleWindowsTask(String phrase) {
        this.phrase = phrase;
    }

    public static Performable switchWindows(String phrase) {
        return Tasks.instrumented(SelectMultipleWindowsTask.class, phrase);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LABEL_MENU_OPTIONS_EXAMPLES.of(OPTIONS_EXAMPLES_MULTIPLE_WINDOWS.getOption())),
                Click.on(LABEL_MESSAGE_WINDOW),
                Switch.toNewWindow(),
                Ensure.that(LABEL_MESSAGE_NEW_WINDOW).text().contains(phrase),
                Switch.toWindowTitled(TITLE_MAIN_WINDOWS.getOption()),
                Click.on(LABEL_MESSAGE_WINDOW),
                Switch.toNewWindow()
        );
    }
}
