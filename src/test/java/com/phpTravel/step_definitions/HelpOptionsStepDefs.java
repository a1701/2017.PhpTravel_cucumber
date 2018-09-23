package com.phpTravel.step_definitions;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.phpTravel.pages.HelpPage;
import com.phpTravel.utilities.BrowserUtils;
import com.phpTravel.utilities.Driver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HelpOptionsStepDefs {

	private WebDriver driver = Driver.getDriver();

	HelpPage helpPage= new HelpPage();
	
	@When("I click on help button")
	public void i_click_on_help_button() {
	 helpPage.helpBtn.click();   
	}

	@Then("I hover over the Store menu")
	public void i_hover_over_the_Store_menu() throws InterruptedException {
		Thread.sleep(2000);
		switchToNewWindow();
		helpPage.storeBtn.click();
	   
	}

	@Then("following menu options should be visible for Store:")
	public void following_menu_options_should_be_visible_for_Store(List<String> options) {
		// capture list of webElements
		List<WebElement> topMenuOptions = helpPage.topMenuOptions("Store");
		// get their text in a list
		List<String> topMenuOptionsString = BrowserUtils.getElementsText2(topMenuOptions);
		// compare the list with options
		assertEquals(topMenuOptionsString.size(), options.size(),
				"Number of expected elemenets did not match");
		for (int i = 0; i <options.size(); i++) {
			assertEquals(topMenuOptionsString.get(i), options.get(i) );
		}
		
		}
	@Then("I hover over the account menu")
	public void i_hover_over_the_account_menu() throws InterruptedException {
		Thread.sleep(2);
		switchToNewWindow();
	    helpPage.accountBtn.click();
	}
    // we changed from dataTable to List of Strings 
	@Then("following menu options should be visible for account:")
	public void following_menu_options_should_be_visible_for_account(List<String> options) {
		List<WebElement> topMenuOptions = helpPage.topMenuOptions("Account");
		// get their text in a list
		List<String> topMenuOptionsString = BrowserUtils.getElementsText2(topMenuOptions); 
		assertEquals(topMenuOptionsString.size(), options.size(),
				"Number of expected elemenets did not match");
		for (int i = 0; i <options.size(); i++) {
			assertEquals(topMenuOptionsString.get(i), options.get(i) );
		}
		
	}
	
	@Then("I hover over the (Home|Store|Announcements|Knowladgebase|Network Status|Contact Us) menu")
	public void i_hover_over_the_account_menu(String menu) throws InterruptedException  {
		Thread.sleep(2);
		switchToNewWindow();
		switch (menu) {
		case "Home":
			helpPage.homeBtn.click();
			Thread.sleep(2000);
			break;
		case "Store":
			helpPage.storeBtn.click();
			Thread.sleep(2000);
			break;
		case "Announcements":
			helpPage.announceBtn.click();
			Thread.sleep(2000);
			break;
		case "Knowledgebase":
			helpPage.knowledgeBtn.click();
			Thread.sleep(2000);
			break;
		case "Network Status":
			helpPage.networkBtn.click();
			Thread.sleep(2000);
			break;
		case "Contact Us":
			helpPage.contactUsBtn.click();
			Thread.sleep(2000);
			break;	
		
		}
	}

	
	public void switchToNewWindow() {
		for(String each : driver.getWindowHandles()){
		    driver.switchTo().window(each);
		}
	}
}
