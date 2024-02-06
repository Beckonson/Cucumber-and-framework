package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//we need runwith option to run with junit
@RunWith(Cucumber.class)
// cucumber option decide what  to execute, where to execute
@CucumberOptions(
        //feature we use to provide the path of the feature file
        //features = "src/test/resources/features/Login.feature",// to execute some
        features = "src/test/resources/features/",// to execute all features
        //glue is the keyword we use in gherkin step definition
        //we provide the path package where we have  all step definitions.
        glue = "steps",
        dryRun = false,
        // dry run stops execution when set to true
        //it will scan all the steps definition and provide if there is any step definition
        tags = "@excel",
        //tags = "@Sprint2 or @Sprint5"  and /or operator condition
        plugin = {"pretty"}

)
public class RunnerClass {

}
