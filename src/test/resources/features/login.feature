@smoke
Feature: Login Test

  Scenario: As user i should be able to login in with valid credentials

    Given i'm on landing page
    When i login with valid credentials
    Then i should see the welcome page


  Scenario: As user i should be able see error validation for invalid credentials
    Given i'm on landing page
    When i login with invalid credentials
    Then i should see validation message