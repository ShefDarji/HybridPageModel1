package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



//annotation wont have; only statement has that so we dont write ;
//we want to run multiple tags we need to use operator but google it

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = "@currency",  plugin = { "pretty", "html:target/cucumber-reports.html" }, publish = true)

//press play button here as we will write tag names here for diff scenarios from feature file
public class RunCuke {


}
