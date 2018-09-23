package com.phpTravel.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {"pretty",
				"html:target/cucumber-report",
				"json:target/cucumber.json"
				
		},
	    tags="@contact", 
		features="src/test/resources/com/phpTravel/features",
		glue="com/phpTravel/step_definitions"
		//,dryRun = true
		)

public class CukesRunner extends AbstractTestNGCucumberTests {}
