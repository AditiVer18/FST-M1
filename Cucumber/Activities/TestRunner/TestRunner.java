package TestRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/Feature",
    glue = {"StepDefinition"},
   // tags = "@Activity1",
   // tags = "@Activity2",
   // tags = "@Activity3",
   // tags = "@Activity4",
    	tags = "@Activity5",
    publish = true,
    monochrome = true,
    plugin = {
    		"pretty",
    		"html:src/report/HTML_Report.html",
    		"json:src/report/Jason_Report.json",
    		"junit:src/report/XML_Report.xml"
    }
)

public class TestRunner {

	
}
