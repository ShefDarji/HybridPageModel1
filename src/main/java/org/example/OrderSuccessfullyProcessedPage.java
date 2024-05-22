package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class OrderSuccessfullyProcessedPage extends Utils{
String expMsgOrderProcessed = "Your order has been successfully processed!";

    public void orderSuccessfullyProcessedMsg(){

   String actMsg = getText(By.xpath("//div[@class='section order-completed']//strong[.='Your order has been successfully processed!']"));
        Assert.assertEquals(actMsg,expMsgOrderProcessed,"Order not processed");


    }
    public void successfullyProcessedOrderNumberMsg(){

        List<WebElement> element =driver.findElements(By.xpath("//div[@class='section order-completed']//div[@class='order-number']"));

        for (WebElement order : element)
        {
       String actMsg = order.getText();
        Assert.assertTrue(actMsg.contains("ORDER NUMBER"), "order not processed");
        }
    }

}
