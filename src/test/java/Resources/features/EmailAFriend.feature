Feature: Email a Friend


@emailAFriend
  Scenario: As a user, i should register and email a product to a friend
    Given I am on homepage
    And I click on register button on homepage
    When I fill details on registration page
    Then I should be registered successfully
    And I click on "Electronics" button
    And I select "Camera" category from "Electronics" page
    And I select "Nikon" category from "Camera" page
    And I select Email a Friend option
    Then I should be able to fill details and email a friend