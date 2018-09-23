Feature: Create contacts using beans


Scenario: Create contact
#Given I am on the login page
#When I fill in with valid credential
#Then I click on accounts
#Then I click on GuestCustomer
#And I press add new guest customer
Then I save a new contact:
|firstname|lastname | email       | password | country   |
|Steve    |Gates    | jahj@io.com | stevega  | Colombia  |