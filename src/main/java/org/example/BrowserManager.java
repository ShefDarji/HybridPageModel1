package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Utils {
    LoadProp loadProp = new LoadProp();
    String browser = loadProp.getProperty("browser");
    public void openBrowser(){

        if (browser.equalsIgnoreCase("Chrome"))
        {
            driver = new ChromeDriver();
            System.out.println("browser is chrome");
        }
        else if (browser.equalsIgnoreCase("Edge"))
        {
            driver = new EdgeDriver();
            System.out.println("Browser is Edge");
        }
        else if (browser.equalsIgnoreCase("Firefox"))
        {
            driver = new FirefoxDriver();
            System.out.println("Broswer is Firefox");
        }
        else if (browser.equalsIgnoreCase("Safari"))
        {
            driver = new SafariDriver();
            System.out.println("Browser is safari");
        }
        else
        {
            System.out.println("Your browser is " + browser);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
    }


public void closeBrowser(){

        driver.quit();

}





}
