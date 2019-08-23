package Varma;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Myfeature",glue="Varma",tags= {"@Sanity"},plugin = {"json:target/cucumber.json"})
public class MyRunner {

}
