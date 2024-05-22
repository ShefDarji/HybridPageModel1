package org.example;

import org.openqa.selenium.By;

public class BillingAddressPage extends Utils {

    LoadProp loadProp = new LoadProp();
    private By firstname = By.cssSelector("#BillingNewAddress_FirstName");
    private By lastname = By.cssSelector("#BillingNewAddress_LastName");
    private By emailId = By.cssSelector("#BillingNewAddress_Email");
    private By country = By.cssSelector("#BillingNewAddress_CountryId");
    private By state = By.xpath("//select[@data-trigger='state-select']");
    private By city = By.cssSelector("#BillingNewAddress_City");
    private By address = By.cssSelector("#BillingNewAddress_Address1");
    private By zip = By.cssSelector("#BillingNewAddress_ZipPostalCode");
    private By phoneNumber = By.cssSelector("#BillingNewAddress_PhoneNumber");
    private By enterButton = By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; Billing.save()']");


    //method to fill the details for billing address

    public void BillingAddressDetails() {
        //type first name
        typeText(firstname, loadProp.getProperty("firstname"));
        //type last name
        typeText(lastname, loadProp.getProperty("lastname"));
        //type email
        typeText(emailId, loadProp.getProperty("emailPart1") + randomDate() + loadProp.getProperty("emailPart2"));
        //select country by drop down
        selectByText(country, "Canada");
        //select state from drop down
        selectByText(state, loadProp.getProperty("state"));
        //type city name
        typeText(city, loadProp.getProperty("city"));
        //type address
        typeText(address, loadProp.getProperty("address"));
        //type Zip code
        typeText(zip, loadProp.getProperty("postcode"));
        //type phone number
        typeText(phoneNumber, loadProp.getProperty("phonenumber"));
        //click enter
        clickOnElement(enterButton);

    }
}
