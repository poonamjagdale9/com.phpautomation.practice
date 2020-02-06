import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        dryRun = false ,
        strict = true
        //monochrome = true // display the consol output in a proper readable format
)
public class RunCukes {

}
