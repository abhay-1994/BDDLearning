package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"./src/test/java/features"}, glue= {"stepDefinitions"},
plugin= {"html:Reports/CucumberReports.html","json:Reports/CucumberJSONReports.json"}
		)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
