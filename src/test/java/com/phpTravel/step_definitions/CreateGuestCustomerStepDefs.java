package com.phpTravel.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.phpTravel.pages.CreateGuestCustomerPage;
import com.phpTravel.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateGuestCustomerStepDefs {

	private WebDriver driver = Driver.getDriver();

	CreateGuestCustomerPage createGCPage = new CreateGuestCustomerPage();

	@Then("I click on accounts")
	public void i_click_on_accounts() throws InterruptedException {
		createGCPage.accountsLink.click();
		Thread.sleep(1000);
	}

	@Then("I click on GuestCustomer")
	public void i_click_on_GuestCustomer() throws InterruptedException {
		createGCPage.guestCustomersLink.click();
		Thread.sleep(1000);
	}

	@Then("I press add new guest customer")
	public void i_press_add_new_guest_customer() throws InterruptedException {
		assertTrue(createGCPage.guestMngMsg.isDisplayed());
		createGCPage.addButton.click();
		Thread.sleep(1000);
	}

	@Then("I enter the first name {string} and the last name {string}")
	public void i_enter_the_first_name_and_the_last_name(String firstName, String lastName) {
		createGCPage.firstNameBox.sendKeys(firstName);
		createGCPage.lastNameBox.sendKeys(lastName);
	}

	@Then("I enter the email {string}")
	public void i_enter_the_email(String email) {
		createGCPage.emailBox.sendKeys(email);
	}

	@Then("I enter password {string}")
	public void i_enter_password(String password) {
		createGCPage.passwordBox.sendKeys(password);
	}

	@Then("I enter country {string}")
	public void i_enter_country(String country) throws InterruptedException {
		createGCPage.countryBox.click();
		Thread.sleep(1000);
		Select dropdown = new Select(
				driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[6]/div/select")));
		dropdown.selectByVisibleText(country);
		Thread.sleep(2000);
	}

	@When("I click submit button")
	public void i_click_submit_button() {
		createGCPage.submitButton.click();
	}

	@Then("I should see contact information for {string}")
	public void i_should_see_contact_information_for(String string) {
		assertTrue(createGCPage.name.isDisplayed());
	}

	@Then("I create a new customer:")
	public void i_create_a_new_customer(Map<String, String> contact) throws InterruptedException {
		if (contact.get("first_name") != null) {
			createGCPage.firstNameBox.sendKeys(contact.get("first_name"));
		}
		if (contact.get("last_name") != null) {
			createGCPage.lastNameBox.sendKeys(contact.get("last_name"));
		}
		if (contact.get("email") != null) {
			createGCPage.emailBox.sendKeys(contact.get("email"));
		}
		if (contact.get("password") != null) {
			createGCPage.passwordBox.sendKeys(contact.get("password"));
		}
		if (contact.get("country") != null) {
			Select dropdown = new Select(
			driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[6]/div/select")));
			dropdown.selectByVisibleText(contact.get("country"));
			Thread.sleep(2000);
		}
		createGCPage.submitButton.click();
		Thread.sleep(1000);
		
	}
	
	@Then("I should see {string}")
	public void i_should_see(String first_name) {
		assertEquals(first_name, createGCPage.name.getText());   
	}
	
	
}
