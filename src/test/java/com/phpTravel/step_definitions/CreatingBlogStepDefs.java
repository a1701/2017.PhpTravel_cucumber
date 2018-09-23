package com.phpTravel.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.phpTravel.pages.BlogPage;
import com.phpTravel.pages.DashboardPage;
import com.phpTravel.pages.LoginPage;
import com.phpTravel.pages.PostBlogPage;
import com.phpTravel.utilities.Driver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreatingBlogStepDefs {
	
	private WebDriver driver = Driver.getDriver();
	
	LoginPage loginPage= new LoginPage();
	DashboardPage dashboardPage = new DashboardPage();
	BlogPage blogPage = new BlogPage();
	PostBlogPage postBlogPage = new PostBlogPage();
	

	
	@When("I click on create blog")
	public void i_click_on_create_blog() throws InterruptedException {
	Thread.sleep(3000);
	  dashboardPage.createBlog.click();
	  
	}

	@When("add new blog")
	public void add_new_blog() throws InterruptedException {
		assertTrue(blogPage.BlogMngtText.isDisplayed());
	    blogPage.addBlogBtn.click();
	    Thread.sleep(2000); 
	   
	}

	@When("set subject as {string}")
	public void set_subject_as(String taskSubject) {
	  postBlogPage.subjectName.sendKeys(taskSubject);
	  
	}

	@Then("set status as Enable")
	public void set_status_as_Enable() {
	    postBlogPage.statusSelect();
	}

	@Then("write some post as {string}")
	public void write_some_post_as(String postMsg) {
	postBlogPage.typeMsg(postMsg);
	}


	@When("click on category {string}")
	public void click_on_category(String adv) {
		postBlogPage.categorySelect(adv);
	}

	@When("set description as {string}")
	public void set_description_as(String text) {
		postBlogPage.description.sendKeys(text);
	}

	@When("submit the blog")
	public void submit_the_blog() {
		postBlogPage.submit.click();
		}

	@Then("Automate Scenarios name should be displayed")
	public void automate_Scenarios_name_should_be_displayed() {
	  dashboardPage.autText.isDisplayed();
	  assertEquals(dashboardPage.autText.getText(), "Automate Scenarios");
	  
	}

	@Then("data should match with created task data")
	public void data_should_match_with_created_task_data() {
	 dashboardPage.tabledata();
	 dashboardPage.logOut.click();
		
		
	}
}
