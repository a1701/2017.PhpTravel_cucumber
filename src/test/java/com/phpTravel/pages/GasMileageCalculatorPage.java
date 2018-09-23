package com.phpTravel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phpTravel.utilities.Driver;

public class GasMileageCalculatorPage {
 
	private WebDriver driver;
	
	public GasMileageCalculatorPage() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="uscodreading")
	public WebElement currentOdometer;
	
	@FindBy(id="uspodreading")
	public WebElement previousOdometer;
	
	
	@FindBy(id="usgasputin")
	public WebElement gas;
	
	@FindBy(xpath="//*[@id=\"standard\"]/tbody/tr[5]/td/input")
	public WebElement calculateBtn;
	
	
	@FindBy(xpath="//b[contains(text(), 'miles per gallon')]")
	public WebElement result;
	
}
