package org.example;

import org.openqa.selenium.By;

public class CommonPage extends Utils{

    //parameter locator for any product on electronics & camera page


    public void clickOnProductCategory(String productName) {
        clickOnElement(By.xpath("//div[@class='picture']//a[contains(@title,'"+productName+"')]"));
    }


}
