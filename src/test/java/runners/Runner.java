package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports3.html",
                "json:target/json-report/cucumber3.json",
                "junit:target/xml-report/cucumber3.xml"
        },
        features = "./src/test/resources/features",
        glue = "stepdefinitions",
        dryRun = false
)

public class Runner {
}
