package runners;


import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\Navneet\\IdeaProjects\\Networking\\src\\main\\resources\\Temp\\Login.feature"}, glue={"stepdefinition"},
monochrome = true,plugin ={"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json", "rerun:rerun.txt"}
)
public class Firefoxrunner extends AbstractTestNGCucumberTests {
}
