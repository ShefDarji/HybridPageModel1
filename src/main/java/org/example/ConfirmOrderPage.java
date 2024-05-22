package org.example;

import org.openqa.selenium.By;

public class ConfirmOrderPage extends Utils{

    private By confirm = By.cssSelector("button.button-1.confirm-order-next-step-button");
    public void confirmOrder(){
        //click on continue to confirm the order
        clickOnElement(confirm);

    }
}
