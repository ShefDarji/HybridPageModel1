package org.example;

import org.openqa.selenium.By;

public class ShoppingCartPage extends Utils {

    private By clickOnCondition = By.xpath("//input[@id='termsofservice']");
    private By continueButton = By.xpath("//button[@class='button-1 checkout-button']");


    public void clickOnCheckout(){
        //click on i agree condition
        clickOnElement(clickOnCondition);
        //click on continue
        clickOnElement(continueButton);

    }

}
