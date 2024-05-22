package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils {


   // click on camera page
    public void clickOnCameraCategory() {
        clickOnElement(By.xpath("//div[@class='picture']//a[@title='Show products in category Camera & photo']"));
    }

    //parameter locator for any product on electronics page
    public void clickOnProductCategory(String productName) {
        clickOnElement(By.xpath("//div[@class='picture']//a[contains(@title,'"+productName+"')]"));
    }


}
