package com.herokuapp.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class IframeEditorPage extends PageObject {
    public static final Target TEXT_AREA_EDITOR_INITIAL = Target.the("Text area of the editor to enter the value").locatedBy("//body[@id='tinymce']//child::p");
    public static final Target TEXT_AREA_EDITOR = Target.the("Text area of the editor with the entered value").locatedBy("//body[@id='tinymce']//child::p[@style]");
    public static final Target OPTION_FONT = Target.the("text size menu").locatedBy("//div[text()='{0}']");
    public static final Target OPTION_COLOR = Target.the("text color menu").locatedBy("//div[@title='{0}']");
    public static final Target OPTION_ALIGN = Target.the("Content alignment menu").locatedBy("//button[@title='Align center']");
    public static final Target MENU_EDITOR = Target.the("label corresponding to the message of window").locatedBy("//span[text()='{0}']");

}
