Feature: Seamlessly login functionality
  User Story:
  As a user I should be able to login

  Background:
    Given user is on the login page

  Scenario: Login with valid credentials
    When user enters username "Employee101" and password "Employee123"
    Then user should be on the homepage
