package com.herokuapp.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JavaScriptAlertsPage extends PageObject {
    public static final Target BUTTON_JS_ALERT = Target.the("Button to access the JS alert").locatedBy("//button[text()='Click for JS Alert']");
    public static final Target BUTTON_JS_CONFIRM = Target.the("Button to access the JS_CONFIRM alert").locatedBy("//button[text()='Click for JS Confirm']");
    public static final Target BUTTON_JS_PROMPT = Target.the("Button to access the JS prompt alert").locatedBy("//button[text()='Click for JS Prompt']");
    public static final Target LABEL_MESSAGE = Target.the("label corresponding to the message").located(By.id("result"));


}
