Feature: This feature file is for FreeCRM Login feature

  @Sanity @Regression
  Scenario: Verify FreeCRM customer login
    Given Customer in FreeCRM login page
    When Customer gives E-mail address input "saddy.sadmna@gmail.com"
    And Customer gives password input "Qwerty6217"
    And Customer clicks the Login button
    Then Customer should be able to login

  @Sanity @Regression
  Scenario Outline: Verify FreeCRM customer login using wrong userid and wrong password
    Given Customer in FreeCRM login page
    When Customer gives  input "<emailAddress>"
    And Customer gives password input "<password>"
    And Customer clicks the Login button
    Then Customer should NOT be able to login

    Examples: 
      | emailAddress         | password    |
      | leocaprio@gmail.com  | titanic     |
      | brucelee@hotmail.com | belikewater |
