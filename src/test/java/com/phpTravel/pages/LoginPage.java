package com.phpTravel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phpTravel.utilities.Driver;

	public class LoginPage {
		 private WebDriver driver;
		 
		 public LoginPage() {
			 this.driver=Driver.getDriver();
			 PageFactory.initElements(driver,this);
		 }

	@FindBy(xpath = "/html/body/div/form[1]/div[1]/h2")
	public WebElement loginPanelMsg;

	@FindBy(xpath = "//input[@type='text']")
	public WebElement loginEmail;

	@FindBy(xpath = "//input[@type='password']")
	public WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement submit;

	@FindBy(xpath ="/html/body/div[2]/aside/div/div[5]")
	public WebElement adminMsg;
	
	public void login(String userName, String pwd) {
		 loginEmail.sendKeys(userName);
		 password.sendKeys(pwd);
		 submit.click();
		 
	 }
	
}
