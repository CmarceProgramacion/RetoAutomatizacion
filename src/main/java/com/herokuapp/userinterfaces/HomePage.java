package com.herokuapp.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("page:webdriver.HomePage.url")
public class HomePage extends PageObject {
    public static final Target LABEL_MENU_OPTIONS_EXAMPLES = Target.the("").locatedBy("//a[text()='JavaScript Alerts']");
}
