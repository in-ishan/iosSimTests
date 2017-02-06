package iosSimTests.testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
features = "src/test/java/iosSimTests/features",
glue="iosSimTests/glueCode",
dryRun = false,
strict = true,
monochrome = true,
plugin={"pretty","html:reports/html/result.html","json:reports/json/result.json","junit:reports/xml/result.xml"}
)

public class TestRunner 
{
   
}
