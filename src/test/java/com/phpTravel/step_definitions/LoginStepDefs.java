package com.phpTravel.step_definitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.phpTravel.pages.LoginPage;
import com.phpTravel.utilities.BrowserUtils;
import com.phpTravel.utilities.ConfigurationReader;
import com.phpTravel.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefs {
    
	private WebDriver driver = Driver.getDriver();
	LoginPage loginPage = new LoginPage();

	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		BrowserUtils.waitForVisibility(loginPage.loginPanelMsg, 5);
		assertTrue(loginPage.loginPanelMsg.isDisplayed());
	}

	@When("I fill in with valid credential")
	public void i_fill_in_with_valid_credential() {
		loginPage.login((ConfigurationReader.getProperty("username")),
		ConfigurationReader.getProperty("password"));
	}

	@Then("I should be on the admin home page")
	public void i_should_be_on_the_admin_home_page() {
		assertTrue(loginPage.adminMsg.isDisplayed());
	}
	
	

}
