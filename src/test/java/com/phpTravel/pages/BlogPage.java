package com.phpTravel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phpTravel.utilities.Driver;

public class BlogPage {

	private WebDriver driver;

	public BlogPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//form[@class='add_button']")
	public WebElement addBlogBtn;
	

	@FindBy(xpath="//*[@id=\"content\"]/div/div[1]")
    public WebElement BlogMngtText;
}
