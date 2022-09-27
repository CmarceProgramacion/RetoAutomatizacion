package com.herokuapp.utils.enums;

public enum OptionEditorEnum {
    MENU_FRAMES("Frames"),
    MENU_IFRAME("iFrame"),
    MENU_EDIT("Edit"),
    MENU_FORMAT("Format"),
    OPTION_SELECT_ALL("Select all"),
    OPTION_FONT_SIZES("Font sizes"),
    OPTION_FONTS("Fonts"),
    OPTION_STYLE("style"),
    OPTION_TEXT_COLOR("Text color");

    private String option;

    OptionEditorEnum(String option) {
        this.option = option;
    }

    public String getOption() {
        return option;
    }
}
