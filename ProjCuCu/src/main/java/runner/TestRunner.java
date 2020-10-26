package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\New Ecl\\ProjCuCu\\src\\main\\java\\feature\\login.feature",
		glue= {"stepdef"},
		format = {"pretty","html:test-output"}
		)

public class TestRunner 
{

}
