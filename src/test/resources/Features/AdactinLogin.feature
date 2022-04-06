Feature: Validate the Login Functionality of Hotel Adactin

  Background: open the Hotel Adactin

  Scenario: Validate the Login Functionality of Hotel Adactin with valid credentials

    When enter the "Sujasuri" and "suja@suri"
    And click the login button
    Then validate the outcomes

  Scenario: Validate the Login Functionality of Hotel Adactin with valid credentials

    When enter the "Sujasuri" and "sujasuri"
    And click the login button
    Then validate the outcomes


  Scenario: Validate the Login Functionality of Hotel Adactin with valid credentials

    When enter the "Sjasuri" and "sujasuri"
    And click the login button
    Then validate the outcomes

