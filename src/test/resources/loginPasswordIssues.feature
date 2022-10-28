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

  @SEAMLES-2419
  Scenario: User can see valid placeholders on Username and Password fields
    Then verify that placeholders like "Username" and "Password" are on input boxes

  @SEAMLES-2420
  Scenario:
    When user sees "Forgot password?" link
    And clicks Forgot password link
    Then user gets new page and sees "Reset password" button