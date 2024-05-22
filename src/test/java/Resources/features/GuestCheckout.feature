Feature: Checkout

@guestCheckout
Scenario: As a user, I should checkout as a guest
  Given I am on homepage
  When I click on HTC Lollipop product from home page and click on add to cart button
  And click on shopping cart button on homepage
  And click on agree the terms and click on checkout as guest on checkout page
  And click on checkout as guest button
  And I fill billing address details on billing address page
  And I click on next day button on shipping method page
  And I click on credit card button on payment method page
  And I fill credit card details on payment info page
  And I click on confirm button on confirm order page
  Then I should be able to verify that user is able to checkout as guest