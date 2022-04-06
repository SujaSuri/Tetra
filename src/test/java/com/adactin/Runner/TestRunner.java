package com.adactin.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.junit.AfterClass;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",glue = "com/adactin/stepdef", dryRun=false, monochrome = true,
plugin={"pretty", "html:target\\suja.html"},tags="@Search")
        //"json:target\\suri.json", "junit:target\\unit.xml","return:target\\failed.txt"}

public class TestRunner {

 /*   @AfterClass
    public static void report()
    {
Reporting.jvmReport("C:\\Users\\selva\\Cucumber\\target\\suri.json");
    }*/
}





