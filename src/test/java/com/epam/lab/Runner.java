package com.epam.lab;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/",
                 glue = {"StepDefinitions"},
                 format = {"pretty", "html:target/cucumber"})
public class Runner {
}
