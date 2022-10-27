@SEAMLES-2386
Feature: Seamlessly login functionality (username-password issues)
  User Story:
  As a user I should be able to login

  Background:
    Given user is on the login page

 @SEAMLES-2416
  Scenario: Password is hidden when typed
    When user enters password "something"
    Then verify that password is masked by dots

 @SEAMLES-2417
  Scenario: User can see the password explicitly if needed
    When user enters password "something"
    And user clicks password box eye
    Then verify that password seen explicitly