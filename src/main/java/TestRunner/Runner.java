package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\LENOVO\\eclipse-workspace\\Gensis2E2ENW\\src\\main\\java\\Features\\Login.feature",
glue={"Stepdefinitions"},
monochrome=true,
tags="@Regression",

dryRun=true
)



public class Runner {

}
