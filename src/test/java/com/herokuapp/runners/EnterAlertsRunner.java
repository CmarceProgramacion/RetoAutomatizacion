package com.herokuapp.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/enter_alerts.feature",
        glue = "com.herokuapp",
        tags = "@CaseThree",
        plugin = {"pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class EnterAlertsRunner {
}
