package com.phpTravel.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phpTravel.utilities.Driver;

public class DashboardPage {
	private WebDriver driver;

	public DashboardPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@class='col-xs-6 col-sm-6 col-md-2'][4]")
	public WebElement createBlog;

	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[4]")
	public WebElement autText;

	public void tabledata() {
		WebElement table = driver.findElement(By.xpath("//table[@class='xcrud-list table table-striped table-hover']"));
         List<WebElement> FirstColumns = table.findElements(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]"));
		for (WebElement e : FirstColumns) {
			System.out.println("content >>   " + e.getText());

		}
	}
	
	@FindBy(xpath="//a[@class='btn btn-danger btn-sm btn-block']")
	public WebElement logOut;
}
