package testRunners;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/com.features"},
        glue = {"stepDefs", "AppHooks"},
        plugin = {"pretty",
        }
)
public class MyTestRunner {
}
//"com.aventstack.extentreports.cucumber.adaptor.ExtentCucumberAdaper:"