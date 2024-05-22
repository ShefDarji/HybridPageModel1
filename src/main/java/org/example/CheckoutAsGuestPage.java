package org.example;

import org.openqa.selenium.By;

public class CheckoutAsGuestPage extends Utils{

    private By guestButton = By.xpath("//button[contains(@class,'as-guest-button')]");
    public void clickOnCheckoutAsGuest(){
    clickOnElement(guestButton);

    }
}
