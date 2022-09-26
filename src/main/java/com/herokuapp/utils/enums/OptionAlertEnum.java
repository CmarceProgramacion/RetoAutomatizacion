package com.herokuapp.utils.enums;

public enum OptionAlertEnum {
    OPTIONS_EXAMPLES_ALERTS("JavaScript Alerts"),
    OPTION_TEXT_COLOR("Text color");
    private String option;

    private OptionAlertEnum(String option) {
        this.option = option;
    }

    public String getOption() {
        return option;
    }
}
