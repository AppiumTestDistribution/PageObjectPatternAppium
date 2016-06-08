@smoke
Feature: As a user i should be able to write post and delete the post published

  Scenario: As a user i should be able to write post
    Given i'm on landing page
    When i login with valid credentials
    And i write post and publish
    Then i should see the post published successfully

  Scenario: As a user i should be able to delete post
    Given i'm on landing page
    When i login with valid credentials
    And i delete the post published
    Then i should not see the published post anymore