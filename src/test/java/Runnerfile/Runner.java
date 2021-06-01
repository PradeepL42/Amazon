package Runnerfile;


import io.cucumber.testng.AbstractTestNGCucumberTests;


import io.cucumber.testng.CucumberOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

import java.io.File;


@CucumberOptions(
        features ="/Users/pradeep/Wipro-Amazon/src/Features/setting.feature",
        glue ={"stepdefinition"},
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber"}
)
public class Runner extends AbstractTestNGCucumberTests {







    }









