Feature: Login Interface for phpTravel

Scenario: login with valid credentials
  Given I am on the login page
  When I fill in with valid credential
  Then I should be on the admin home page
