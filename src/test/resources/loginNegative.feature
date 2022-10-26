@EAMLES-2386
Feature: Seamlessly login functionality (negative scenarios)
  User Story:
  As a user I should be able to login

  Background:
    Given user is on the login page

 @SEAMLES-2404
  Scenario Outline: User cannot login with any invalid credentials
    When user enters invalid "<username>" or "<password>"
    And user clicks Login button
    Then user should see "Wrong username or password." message

    Examples:
    # user enters in order
        # "wrong (similar) username-correct password"
        #"wrong username-correct password"
        # "wrong username-wrong password",
        # "correct username-wrong (similar) password"
        # "Correct username-wrong(similar)password"

      | username    | password    |
      | employee100 | Employee123 |
      | Abckdemp20  |Employee123  |
      | xyzoyee>*   | mzAz9%      |
      | Employee102 | employee123 |
      | Employee103 | Employee100 |






