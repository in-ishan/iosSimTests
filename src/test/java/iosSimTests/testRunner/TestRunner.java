package iosSimTests.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(
features = "src/test/java/iosSimTests/features",
glue="iosSimTests/glueCode",
dryRun = false,
strict = true,
monochrome = true,
plugin = {"pretty", "html:target/testResults/html/result.html"}
)

public class TestRunner extends AbstractTestNGCucumberTests
{
   
}
