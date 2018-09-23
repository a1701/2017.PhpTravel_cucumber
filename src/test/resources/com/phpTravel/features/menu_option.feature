Feature: phpTravel menu options

Scenario: help options
Given I am on the login page
When I fill in with valid credential
When I click on help button
Then I hover over the Store menu
Then following menu options should be visible for Store:
 |Browse All               |
 |-----                    |
 |Order PHPTRAVELS         |
 |Installation             |
 |Desktop Application      |
 |License                  |
 |Mobile                   |
 |Register a New Domain    |
 |Transfer Domains to Us   |
 

Scenario: account options
Given I am on the login page
When I fill in with valid credential
When I click on help button
Then I hover over the account menu
Then following menu options should be visible for account:
|Login            |
|Register         | 
|-----            |
|Forgot Password? |


Scenario: menu options
Given I am on the login page
When I fill in with valid credential
When I click on help button
#Then I hover over the account menu
#Then I hover over the store menu
#Then I hover over the announcement menu
#Then I hover over the network status menu
#Then I hover over the contact us menu


