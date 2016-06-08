@smoke
Feature: As a user i should be able to Add comments

  Scenario: As a valid user i should be able to add comments to the published post
    Given i'm on landing page
    When i login with valid credentials
    And i add comments to the published post
    Then i should see the comment saved