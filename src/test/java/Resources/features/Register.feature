Feature: Registration

  @register
  Scenario: As a user, I should be registered successfully
    Given I am on homepage
    And I click on register button on homepage
    When I fill details on registration page
    Then I should be registered successfully



