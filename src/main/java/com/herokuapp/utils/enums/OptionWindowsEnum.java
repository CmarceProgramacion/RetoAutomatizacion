package com.herokuapp.utils.enums;

public enum OptionWindowsEnum {
    OPTIONS_EXAMPLES_MULTIPLE_WINDOWS("Multiple Windows"),
    TITLE_MAIN_WINDOWS("The Internet");
    private String option;

    OptionWindowsEnum(String option) {
        this.option = option;
    }

    public String getOption() {
        return option;
    }
}
