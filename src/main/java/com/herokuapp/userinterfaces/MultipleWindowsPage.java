package com.herokuapp.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MultipleWindowsPage extends PageObject {

    public static final Target LABEL_MESSAGE_WINDOW = Target.the("label corresponding to the message of window").locatedBy("//a[text()='Click Here']");
    public static final Target LABEL_MESSAGE_NEW_WINDOW = Target.the("label corresponding to the message of new window").locatedBy("//div [@class='example']/child::h3");


}
