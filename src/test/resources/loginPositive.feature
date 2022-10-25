@SEAMLES-2386
Feature: Seamlessly login functionality
  User Story:
  As a user I should be able to login

  Background:
    Given user is on the login page

 @SEAMLES-2399
  Scenario: Login with valid credentials and hitting Enter key
    When user enters username "Employee101"
    And user enters password "Employee123" and hits Enter key
    Then user should be on the homepage

 @SEAMLES-2400
  Scenario Outline: Login with valid credentials and clicking Login button
    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks Login button
    Then user should be on the homepage

    Examples:
      | username    | password    |
      | Employee100 | Employee123 |
      | Employee102 | Employee123 |
      | Employee103 | Employee123 |
      | Employee104 | Employee123 |
      | Employee105 | Employee123 |

