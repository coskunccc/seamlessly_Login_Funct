Feature: Seamlessly login functionality
  User Story:
  As a user I should be able to login

  Background:
    Given user is on the login page

  Scenario: Login with valid credentials by hittin Enter key
    When user enters username "Employee101"
  And user enters password "Employee123" and hits Enter key
    Then user should be on the homepage
