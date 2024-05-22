package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;

public class MyStepsDef {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    BillingAddressPage billingAddressPage = new BillingAddressPage();
    ShippingMethodPage shippingMethodPage = new ShippingMethodPage();
    PaymentMethodPage paymentMethodPage = new PaymentMethodPage();
    PaymentInfoPage paymentInfoPage = new PaymentInfoPage();
    ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage();
    OrderSuccessfullyProcessedPage orderSuccessfullyProcessedPage = new OrderSuccessfullyProcessedPage();
    CheckoutAsGuestPage checkoutAsGuestPage = new CheckoutAsGuestPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    CommonPage commonPage = new CommonPage();
    CameraCartPage cameraCartPage = new CameraCartPage();
    EmailFriendPage emailFriendPage = new EmailFriendPage();
    SearchProductPage searchProductPage = new SearchProductPage();



    @Given("I am on homepage")
    public void i_am_on_homepage() {
        //already on home page so nothing in this
    }


    @Given("I click on register button on homepage")
    public void i_click_on_register_button_on_homepage() {
        homePage.clickOnRegisterButton();

    }


    @When("I fill details on registration page")
    public void i_fill_details_on_registration_page() {
        registerPage.fillRegistrationDetails();
    }


    @Then("I should be registered successfully")
    public void i_should_be_registered_successfully() {
        registerResultPage.registrationDone();
    }


    @When("I click on {string} button")
    public void iClickOnButton(String categoryName) {
        homePage.clickOnGivenButton(categoryName);

    }

    @Then("I should be able to verify that user is navigated to {string}page")
    public void iShouldBeAbleToVerifyThatUserIsNavigatedToPage(String categoryUrl)
    {
    homePage.checkUrl(categoryUrl);
    }


    @When("I click on HTC Lollipop product from home page and click on add to cart button")
    public void i_click_on_htc_lollipop_product_from_home_page_and_click_on_add_to_cart_button() {
       homePage.clickOnHTCOneAndroid();
    }

    @When("click on shopping cart button on homepage")
    public void click_on_shopping_cart_button_on_homepage() {
    homePage.shoppingCart();
    }

    @When("click on agree the terms and click on checkout as guest on checkout page")
    public void click_on_agree_the_terms_and_click_on_checkout_as_guest_on_checkout_page() {
    shoppingCartPage.clickOnCheckout();

    }

    @When("I fill billing address details on billing address page")
    public void i_fill_billing_address_details_on_billing_address_page() {
    billingAddressPage.BillingAddressDetails();

    }

    @When("I click on next day button on shipping method page")
    public void i_click_on_next_day_button_on_shipping_method_page() {
       shippingMethodPage.selectShippingMethod();
    }

    @When("I click on credit card button on payment method page")
    public void i_click_on_credit_card_button_on_payment_method_page() {
     paymentMethodPage.clickCreditCard();
    }

    @When("I fill credit card details on payment info page")
    public void i_fill_credit_card_details_on_payment_info_page() {
        paymentInfoPage.fillCardDetails();
    }

    @When("I click on confirm button on confirm order page")
    public void i_click_on_confirm_button_on_confirm_order_page() {
      confirmOrderPage.confirmOrder();
    }

    @Then("I should be able to verify that user is able to checkout as guest")
    public void i_should_be_able_to_verify_that_user_is_able_to_checkout_as_guest() {
   orderSuccessfullyProcessedPage.orderSuccessfullyProcessedMsg();
   orderSuccessfullyProcessedPage.successfullyProcessedOrderNumberMsg();
    }

    @And("click on checkout as guest button")
    public void clickOnCheckoutAsGuestButton() {
        checkoutAsGuestPage.clickOnCheckoutAsGuest();
    }


    @And("I select {string} category from {string} page")
    public void iSelectCategoryFromPage(String productCategory, String Page) {
        commonPage.clickOnProductCategory(productCategory);
    }

    @And("I select Email a Friend option")
    public void iSelectEmailAFriendOption() {
    cameraCartPage.selectEmailAFriend();
    }


    @Then("I should be able to fill details and email a friend")
    public void iShouldBeAbleToFillDetailsAndEmailAFriend() {

        emailFriendPage.enterFriendDetailsAndSendEmail();
    }


    @When("I type a product name in seach box on home page")
    public void i_type_a_product_name_in_seach_box_on_home_page() {
    homePage.searchAProductInSearchBox("Nike");
    }

    @Then("I should be able to see the product")
    public void i_should_be_able_to_see_the_product() {
    searchProductPage.searchedProductIsCorrectProduct("Nike");
    }

    @When("I select the {string} on home page")
    public void i_select_the_on_home_page(String currency) {
    homePage.selectCurrencySymbol(currency);

    }


    @Then("All the products on homepage should have this {string}")
    public void allTheProductsOnHomepageShouldHaveThis(String currencySymbol) {
    homePage.checkTheProductsAreInSelectedCurrency(currencySymbol);

    }
}
