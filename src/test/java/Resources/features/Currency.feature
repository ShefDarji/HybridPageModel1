Feature: Currency


  @currency
  Scenario Outline: As i User, I should be able to change currency and see currency changes in products on HOmepage
    Given I am on homepage
    When I select the "<currency>" on home page
    Then All the products on homepage should have this "<currencySymbol>"
    Examples:
      | currency  | currencySymbol |
      | US Dollar | $              |
      | Euro      | €              |
