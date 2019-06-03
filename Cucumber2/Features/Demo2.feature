Feature: Login Action Test

  Scenario: Successful Login with Valid Credentials
    Given user login page is openend
    When user enter "lalitha" as a username and "password123" as a password
    When user clicks on login button
    Then will Finds a testmeapp homepage
