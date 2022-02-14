import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\puipatip\\eclipse-workspace\\SDET\\src\\test\\java\\Features\\OrangeHRM.Feature",
		glue="step_definitions",
		dryRun=false, 
		strict=true, 
		monochrome=true,
		plugin= {"pretty", "html:test-output"},
		tags= {"@Smoke"}
		)

public class Cucumberun{

	

}
