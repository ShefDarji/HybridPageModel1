package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage extends Utils {
    private By _registerButton = By.className("ico-register");
    private By HTCProduct = By.xpath("//div[@class='product-item']//img[@title='Show details for HTC One M8 Android L 5.0 Lollipop']");
    private By addToCart = By.xpath("//button[@id='add-to-cart-button-18']");
    private By shoppingCart = By.xpath("//a[.='shopping cart']");
    private By searchButton = By.cssSelector(".button-1.search-box-button");
    private By _currencyDropDown = By.name("customerCurrency");
    private By _nopCommNewReleaseButton = By.xpath("//div[@class='news-items']//div[2]//div[@class='buttons']");


    public void clickOnHTCOneAndroid() {

        //click on the product
        clickOnElement(HTCProduct);
        //click on add to cart
        clickOnElement(addToCart);
        //wait for element to be clicked so wait for that line
        elementToBeClickable(10, (By.xpath("//div[@class='bar-notification success']")));
        //click on shopping cart
    }
    public void shoppingCart() {
    clickOnElement(shoppingCart);

    }

    //method to click on register button
    public void clickOnRegisterButton() {

        clickOnElement(_registerButton);
    }

    //method to click on search button
    public void searchAProductInSearchBox(String name) {

        //type product name in search box
        typeText(By.cssSelector(".search-box-text.ui-autocomplete-input"), name);
        //click on search button
        clickOnElement(searchButton);

    }

    //Method to click on categories on home page
    public void clickOnGivenButton(String name){

        //there is space at the end of locators so space after you type the parameter(string concatenation )
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[.='"+name+" ']"));

    }

    //method to verify url
    public void checkUrl(String name){
        String URL = driver.getCurrentUrl();
        Assert.assertTrue(URL.contains(name));
        System.out.println(URL);

    }
    //method to select Currency of products
    public void selectCurrencySymbol(String currency) {

        //select the currency from dropdown by value
        selectByText(_currencyDropDown, currency);
    }

    //method to verify products are in selected currency
    public void checkTheProductsAreInSelectedCurrency(String currencySymbol){

        List<WebElement> currencyOfProduct = driver.findElements(By.cssSelector(".prices"));

        for (WebElement products : currencyOfProduct){

        Assert.assertNotNull(products.getText().contains(currencySymbol),"Product has wrong currency ");

        }
    }

    //method to select nopCommerce new release button
    public void nopCommerceNewReleaseButton(){

    clickOnElement(_nopCommNewReleaseButton);
    }

}
