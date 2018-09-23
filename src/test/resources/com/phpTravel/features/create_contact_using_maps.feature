Feature: Creating customers

Scenario: Create Customer using a map 
Given I am on the login page
When I fill in with valid credential
Then I click on accounts
Then I click on GuestCustomer
And I press add new guest customer
Then I create a new customer:
		|first_name|John        |
		|last_name |Smith       |
		|email     |jkaf@bk.com |
		|password  | 4566782    |
		|country   |China       |
Then I should see "John"


Scenario Outline: Create Customer using a map 
Given I am on the login page
When I fill in with valid credential
Then I click on accounts
Then I click on GuestCustomer
And I press add new guest customer
Then I create a new customer:
	|first_name|<first_name>  |
	|last_name |<lname>       |
	|email     |<email>       |
	|password  |<password>    |
	|country   |<country>     |
Then I should see "<first_name>"	
Examples: 	
    |first_name|lname     | email              | password | country|
    |Michael   |Simpson   |jhdjd@i.com         | pass123  | Ukraine|
    |Tina      |Kandelaki |jdhjdjs@mail.co     | fail356  | Russia |
    
    
    
    
