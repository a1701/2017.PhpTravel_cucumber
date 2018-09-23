Feature: Creating blog
@Dev
Scenario: Create a blog
Given I am on the login page
When I fill in with valid credential
Then I click on create blog
And add new blog
And set subject as "Automate Scenarios"
And set status as Enable
And write some post as "Hello World!"
And click on category "Adventure"
And set description as "Automate test cases using Cucumber and Selenium" 
And submit the blog 
Then Automate Scenarios name should be displayed
And data should match with created task data