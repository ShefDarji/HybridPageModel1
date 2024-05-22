package org.example;

import org.openqa.selenium.By;

public class PaymentMethodPage extends Utils{
private By creditCard = By.cssSelector("#paymentmethod_1");
private By continueButton = By.cssSelector("button.button-1.payment-method-next-step-button");
    public void clickCreditCard(){
    //click on credit card option
    clickOnElement(creditCard);
    //click on continue
    clickOnElement(continueButton);

    }
}
