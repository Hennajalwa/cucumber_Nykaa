package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;



@CucumberOptions(features ="src/test/resources/features",
        glue = "steps",publish = true, tags = "@smoke")
public class TestRunner extends AbstractTestNGCucumberTests {
    @DataProvider(parallel = true)
    public Object[][] scenarios(){

        return super.scenarios();
    }
}