package com.phpTravel.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phpTravel.utilities.Driver;

public class HelpPage {

	private WebDriver driver = Driver.getDriver();
	
	public HelpPage() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath="//*[@id=\"social-sidebar-menu\"]/li[2]/a")
	public WebElement helpBtn;
	
	@FindBy(xpath="//*[@id=\"Primary_Navbar-Store\"]/a")
	public WebElement storeBtn;
	
	
	@FindBy(xpath="")
	public WebElement f;
	
	public List<WebElement> topMenuOptions(String name){
		String xpath= "//li[@menuitemname='" + name + "']/ul/li";
		return driver.findElements(By.xpath(xpath));
	}
	
	@FindBy(xpath="//*[@id=\"primary-nav\"]/ul[2]")
	public WebElement accountBtn;
	
	@FindBy(xpath="//*[@id=\"Primary_Navbar-Home\"]")
	public WebElement homeBtn;
	
	@FindBy(xpath="//*[@id=\"Primary_Navbar-Announcements\"]")
	public WebElement announceBtn;
	
	@FindBy(xpath="//*[@id=\"Primary_Navbar-Knowledgebase\"]")
	public WebElement knowledgeBtn;
	
	@FindBy(xpath="//*[@id=\"Primary_Navbar-Network_Status\"]")
	public WebElement networkBtn;
	
	@FindBy(xpath="//*[@id=\"Primary_Navbar-Contact_Us\"]")
	public WebElement contactUsBtn;
	


	
}
