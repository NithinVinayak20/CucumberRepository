Feature: Login Action Test

  Scenario Outline: Successful Login with Valid Credentials
    Given user opens the application
    When user clicks on sign in link
    When user enter "<username>" and "<password>" as a password
    Then message displayed login successful
    
    Examples:
    		| username | password |
    		| lalitha | password123 |
    		| admin | password456 |
    		
