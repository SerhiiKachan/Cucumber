package com.epam.lab;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/serhii/IdeaProjects/Cucumber/src/test/resources/features/logging_in.feature",
                 glue = {"StepDefinitions"},
                 format = {"pretty", "html:target/cucumber1"})
public class Runner {
}
