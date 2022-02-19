package runners;

import Utilities.Variables;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features"
        ,glue={"steps"},
        publish = false,
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-html",
                "json:target/cucumber-reports/cucumber-json.json",
                "rerun:target/cucumber-reports/rerun.txt"
        }
)
public class AndroidRunner extends AbstractTestNGCucumberTests {
    @BeforeClass
    public static void beforeClass() {
        Variables.Running_Platform = "android";
    }
}
