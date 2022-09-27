package com.herokuapp.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("page:webdriver.base.url")
public class HomePage extends PageObject {
    public static final Target LABEL_MENU_OPTIONS_EXAMPLES = Target.the("Option example herokuapp").locatedBy("//a[text()='{0}']");
}
