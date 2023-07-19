package runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin={"html:target/cucumber_html_report.html"},
	    features="src/test/java/features",
	    glue="stepdefinitions",
	    tags="@ninja")

      public class TestRunner extends AbstractTestNGCucumberTests {

}
