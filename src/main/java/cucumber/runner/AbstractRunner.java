package cucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:Features"},
        glue = {"cucumber.steps"},
        plugin = {"json:build/cucumber-report.json", "pretty",
                "de.monochromata.cucumber.report.PrettyReports:build/cucumber"
        }
)


public abstract class AbstractRunner {
	
	

}
