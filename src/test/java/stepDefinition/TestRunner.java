package stepDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Login.feature",
        glue = "stepDefinition",
        tags = "@E2E",
        stepNotifications = true,       
        plugin = {"pretty", "html:target/cucumber.html",
                "junit:target/cucumber.xml",
                "json:target/cucumber-report.json"},
        monochrome = true
)
public class TestRunner {

}