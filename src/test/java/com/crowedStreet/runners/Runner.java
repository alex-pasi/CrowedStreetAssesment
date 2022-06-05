package com.crowedStreet.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-reports.html",
        features = "src/test/resources/featureFiles",
        glue = "com/crowedStreet/stepImplementation",
        dryRun = false,
        tags = ""
)
public class Runner {
}
