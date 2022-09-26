package com.herokuapp.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JavaScriptAlertsPage extends PageObject {
    public static final Target BUTTON_JS_ALERT = Target.the("Button to access the JS alert").locatedBy("//button[text()='Click for JS Alert']");

    public static final Target BUTTON_JS_CONFIRM = Target.the("Button to access the JS_CONFIRM alert").locatedBy("//button[text()='Click for JS Confirm']");
    public static final Target BUTTON_JS_PROMPT = Target.the("Button to access the JS prompt alert").locatedBy("//button[text()='Click for JS Prompt']");
    public static final Target LABEL_MESSAGE = Target.the("label corresponding to the message").located(By.id("result"));

    public static final Target LABEL_MESSAGE_WINDOW = Target.the("label corresponding to the message of window").locatedBy("//a[text()='Click Here']");
    public static final Target MENU_EDITOR = Target.the("label corresponding to the message of window").locatedBy("//span[text()='{0}']");
    public static final Target LABEL_MESSAGE_NEW_WINDOW = Target.the("label corresponding to the message of new window").locatedBy("//div [@class='example']/child::h3");
    public static final Target TEXT_AREA_EDITOR_INITIAL = Target.the("").locatedBy("//body[@id='tinymce']//child::p");
    public static final Target TEXT_AREA_EDITOR = Target.the("").locatedBy("//body[@id='tinymce']//child::p[@style]");

    public static final Target OPTION_FONT = Target.the("").locatedBy("//div[text()='{0}']");
    public static final Target OPTION_COLOR = Target.the("").locatedBy("//div[@title='{0}']");
    public static final Target OPTION_ALIGN = Target.the("").locatedBy("//button[@title='Align center']");


}
