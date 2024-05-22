package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SearchProductPage extends Utils{
    private By _searchedProduct = By.xpath("//div[@class='item-grid']//div/h2");


    public void searchedProductIsCorrectProduct(String name) {

        List<WebElement> product = driver.findElements(_searchedProduct);

        for (WebElement element : product) {
            String actProduct = element.getText();
            System.out.println(actProduct.equalsIgnoreCase(name));

            Assert.assertTrue(actProduct.contains(name), "not found");
        }

    }
//    public void searchProductResult(){
//    List<WebElement> product = driver.findElements(By.cssSelector("//div[@class='product-item']"));
//
//    for (WebElement element : product ) {
//        String productName = element.getText();
//        Assert.assertTrue(productName.contains("nike"),"Product not found");
//    }
//
//    }


}
