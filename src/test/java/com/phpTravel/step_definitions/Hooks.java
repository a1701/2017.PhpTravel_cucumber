package com.phpTravel.step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.phpTravel.utilities.ConfigurationReader;
import com.phpTravel.utilities.Driver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void setUp(Scenario scenario) {
		WebDriver driver = Driver.getDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(ConfigurationReader.getProperty("url"));

	}

	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
		// taking a screenshot
		final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
		// adding the screenshot to the report
		scenario.embed(screenshot, "image/png");
		}
		Driver.closeDriver();
	}
}
