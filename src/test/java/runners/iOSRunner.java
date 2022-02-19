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
        publish = false
)
public class iOSRunner extends AbstractTestNGCucumberTests {

    @BeforeClass
    public static void beforeClass() {
        Variables.Running_Platform = "ios";
    }

}
