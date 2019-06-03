package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,plugin= {"pretty","html:cucumber-html-report"}, tags= {"@SmokeTest","@RegressionTest"},features="Features\\tagsdemo.feature")
public class Runner {
 
}
