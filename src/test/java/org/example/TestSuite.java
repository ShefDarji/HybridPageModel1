package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutAsGuestPage checkoutAsGuestPage = new CheckoutAsGuestPage();
    BillingAddressPage billingAddressPage = new BillingAddressPage();
    ShippingMethodPage shippingMethodPage = new ShippingMethodPage();
    PaymentMethodPage paymentMethodPage = new PaymentMethodPage();
    PaymentInfoPage paymentInfoPage = new PaymentInfoPage();
    ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage();
    OrderSuccessfullyProcessedPage orderSuccessfullyProcessedPage = new OrderSuccessfullyProcessedPage();
    SearchProductPage searchProductPage = new SearchProductPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();
    CameraCartPage cameraCartPage = new CameraCartPage();
    EmailFriendPage emailFriendPage = new EmailFriendPage();

    @Test
    public void toVerifyUserShouldCheckoutAsGuest() {
        //Add to cart HTC Lollipop product from home page
        homePage.clickOnHTCOneAndroid();
        //click on shopping cart
        homePage.shoppingCart();
        //Tick I agree and checkout on Shopping cart page
        shoppingCartPage.clickOnCheckout();
        //Click on checkout as guest option
        checkoutAsGuestPage.clickOnCheckoutAsGuest();
        //Add billing address details
        billingAddressPage.BillingAddressDetails();
        //Select shipping method
        shippingMethodPage.selectShippingMethod();
        //Click on credit card option
        paymentMethodPage.clickCreditCard();
        //enter card details
        paymentInfoPage.fillCardDetails();
        //Click on confirm on confirm order page
        confirmOrderPage.confirmOrder();
        //Assert order number pop up and Order successfully processed msg
        orderSuccessfullyProcessedPage.orderSuccessfullyProcessedMsg();
        orderSuccessfullyProcessedPage.successfullyProcessedOrderNumberMsg();
    }


    @Test
    public void verifyUserShouldSuccessfullyRegister() {
        //click on register on homepage
        homePage.clickOnRegisterButton();
        //fill details on registration page
        registerPage.fillRegistrationDetails();
        //check registration is done correctly or not
        registerResultPage.registrationDone();
    }


    @Test
    public void toVerifySearchAndProductDisplayedShouldBeSame(){
    //type the product name and click on search
    homePage.searchAProductInSearchBox("nike");
    //verify same product is displayed on search page
    searchProductPage.searchedProductIsCorrectProduct("Nike");
    }


    @Test
    public void verifyRegisteredUserShouldLoginAndReferAFriend() {
        //click on register on homepage
        homePage.clickOnRegisterButton();
        //fill details on registration page
        registerPage.fillRegistrationDetails();
        //check registration is done correctly or not
        registerResultPage.registrationDone();
        //once registered User should log in from homepage
        //homePage.clickOnLogIn();
        //enter login details on login page
        // logInPage.logIn();
        //click on electronics on homepage
        homePage.clickOnGivenButton("Electronics");
        //click on camera category
        electronicsPage.clickOnCameraCategory();
        //click on the product to refer from camera page
        cameraAndPhotoPage.clickOnCameraProduct();
        //Add the product in cart
        cameraCartPage.selectEmailAFriend();
        //send email to friend
        emailFriendPage.enterFriendDetailsAndSendEmail();

    }


}

