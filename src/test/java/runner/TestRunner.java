package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(features = "src/test/resources/features",
            glue = "tests" ,
            publish = true,
            dryRun = false ,
            plugin = {"html:target/cucumber_report.html",
                    "pretty",
                    "me.jvt.cucumber.report.PrettyReports:target"
            }

    )
    public class TestRunner {



    }


