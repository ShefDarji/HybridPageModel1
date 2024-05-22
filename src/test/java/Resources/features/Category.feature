Feature: Category

  @category
  Scenario Outline: As a user, I should be able to navigate to each category page
    Given I am on homepage
    When I click on "<category_name>" button
    Then I should be able to verify that user is navigated to "<url>"page


    Examples:
      | category_name     | url                |
      | Computers         | /computers         |
      | Electronics       | /electronics       |
      | Apparel           | /apparel           |
      | Digital downloads | /digital-downloads |
      | Books             | /books             |
      | Jewelry           | /jewelry           |
      | Gift Cards        | /gift-cards        |
