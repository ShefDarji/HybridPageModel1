package org.example;

import org.openqa.selenium.By;

public class PaymentInfoPage extends Utils{
LoadProp loadProp = new LoadProp();
    private By cardholderName = By.cssSelector("#CardholderName");
    private By cardNo = By.cssSelector("#CardNumber");
    private By expMonth = By.cssSelector("#ExpireMonth");
    private By expYear = By.cssSelector("#ExpireYear");
    private By cardCode = By.cssSelector("#CardCode");
    private By continueButton = By.cssSelector("button.button-1.payment-info-next-step-button");


    public void fillCardDetails(){
        //type cardholders name
        typeText(cardholderName, loadProp.getProperty("firstname")+loadProp.getProperty("lastname"));
        //type card number
        typeText(cardNo, loadProp.getProperty("cardNumber"));
        //select month of expiry
        selectByText(expMonth,"08");
        //select the year of expiry
        selectByText(expYear,"2030");
        //type card code
        typeText(cardCode, loadProp.getProperty("cardCode"));
        //click on continue
        clickOnElement(continueButton);



    }
}
