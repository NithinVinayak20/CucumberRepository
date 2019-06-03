Feature: login Feature

  Scenario: User enters Username and Password
    Given the login page is openend
    When user enters lalitha as username
    And user enters password123 as password
    Then user will find a testmeapp homepage
