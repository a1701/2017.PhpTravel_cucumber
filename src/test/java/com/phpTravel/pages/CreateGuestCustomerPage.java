package com.phpTravel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phpTravel.utilities.Driver;

public class CreateGuestCustomerPage {
	private WebDriver driver=Driver.getDriver();

	public CreateGuestCustomerPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id=\"social-sidebar-menu\"]/li[5]/a")
	public WebElement accountsLink; 
	
	@FindBy(xpath="//*[@id=\"ACCOUNTS\"]/li[4]")
	public WebElement guestCustomersLink;
	
	@FindBy(xpath="//div[@class='panel-heading']")
	public WebElement guestMngMsg;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement addButton;
	
	@FindBy(xpath="//input[@placeholder='First name']")
	public WebElement firstNameBox;
	
	@FindBy(xpath="//input[@placeholder='Last name']")
	public WebElement lastNameBox;
	
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	public WebElement emailBox;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	public WebElement passwordBox;
	
	@FindBy(xpath="//div[@id='s2id_autogen1']")
	public WebElement countryBox;

	@FindBy(xpath="//button[@class='btn btn-primary']")
	public WebElement submitButton;
	
	@FindBy(xpath="//*[@id='content']/div/div[2]/div/div/div[1]/div[2]/table/tbody/tr/td[3]")
	public WebElement name;
	
//	@FindBy()
//	public WebElement g;

	
}
