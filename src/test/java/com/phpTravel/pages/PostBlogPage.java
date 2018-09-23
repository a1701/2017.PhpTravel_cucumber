package com.phpTravel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.phpTravel.utilities.BrowserUtils;
import com.phpTravel.utilities.Driver;

public class PostBlogPage {
	private WebDriver driver;

	public PostBlogPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@class='form-control posttitle']")
	public WebElement subjectName;

	@FindBy(xpath = "//*[@id=\"GENERAL\"]/div[3]/div/div/div[2]/div[1]/div/select")
	public WebElement status;

	@FindBy(xpath = "//div[@id='cke_1_contents']")
	public WebElement typeBoard;

	public void statusSelect() {
		Select status1 = new Select(status);
		status1.selectByValue("Yes");
		//driver.findElement(By.name("status"))
	}

    public void typeMsg(String t) {
    	Actions actions = new Actions(driver);
   	 actions.moveToElement(typeBoard);
   	 actions.click();
   	 actions.sendKeys(t);
   	 actions.build().perform();
    }
    
    @FindBy(xpath = "//*[@id=\"GENERAL\"]/div[3]/div/div/div[2]/div[2]/div/select")
	public WebElement categoryPath;

    public void categorySelect(String w) {
    	Select category = new Select(categoryPath);
    	category.selectByValue("16");
    	
    }
    
  @FindBy(xpath="//input[@name='metadesc']")
  public WebElement description;
  
  @FindBy(xpath="//button[@type='submit']")
  public WebElement submit;
    

}
