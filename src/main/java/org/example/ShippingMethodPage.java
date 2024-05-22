package org.example;

import org.openqa.selenium.By;

public class ShippingMethodPage extends Utils{
private By nextDayOptn = By.cssSelector("#shippingoption_1");
private By continueButton =  By.xpath("//button[@class='button-1 shipping-method-next-step-button']");

    public void selectShippingMethod(){

        //select next day air optn
        clickOnElement(nextDayOptn);
        //click on continue
        clickOnElement(continueButton);
    }
}
