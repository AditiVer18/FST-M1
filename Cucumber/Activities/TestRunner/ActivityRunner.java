package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	@RunWith(Cucumber.class)
	@CucumberOptions(
	    features = "src/test/java/Feature",
	    glue = {"StepDefinition"},
	    tags = "@SimpleAlert",
	    publish = true,
	    monochrome = true,
	    plugin = {
	    		"pretty",
	    		"html:src/report/HTML_Report.html",
	    		"json:src/report/Jason_Report.json",
	    		"junit:src/report/XML_Report.xml"
	    }
	)
	public class ActivityRunner {
}
