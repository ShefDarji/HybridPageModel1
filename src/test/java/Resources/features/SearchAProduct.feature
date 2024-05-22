Feature: Search any product

  @searchAProduct
  Scenario: As a user, I should be able to search any product through search box

    Given I am on homepage
    When I type a product name in seach box on home page
    Then I should be able to see the product