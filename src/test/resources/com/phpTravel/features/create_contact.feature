Feature: Creating guest customer contact

Scenario: Create a contact using GuestCustomer
Given I am on the login page
When I fill in with valid credential
Then I click on accounts
Then I click on GuestCustomer
And I press add new guest customer
And I enter the first name "Peter" and the last name "Pan"
And I enter the email "petersmak@gmail.com"
And I enter password "123456"
And I enter country "Albania"
When I click submit button
Then I should see contact information for "Peter Pan"


Scenario Outline: Create a multiple contacts 
Given I am on the login page
When I fill in with valid credential
Then I click on accounts
Then I click on GuestCustomer
And I press add new guest customer
And I enter the first name "<firstname>" and the last name "<lastname>"
And I enter the email "<email>"
And I enter password "<password>"
And I enter country "<country>"
When I click submit button
Then I should see contact information for "<firstname>"

Examples: 
		|firstname|lastname  |email            |password  |country |
		|Jessika  |Lee       |leeahdt@mail.com | lee123   |Bolivia |
		|Satoshi  |Nakamuro  |dklajfda@mk.com  | parker3  |Japan   |

