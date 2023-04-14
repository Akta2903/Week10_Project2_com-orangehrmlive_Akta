package com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest
{
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;
    static String browser = "Edge";

    public static void main(String[] args)
    {
        if(browser.equalsIgnoreCase("Chrome"))
        {
            driver = new ChromeDriver(); // Launch the Chrome Browser
        }
        else if (browser.equalsIgnoreCase("Firefox"))
        {
            driver = new FirefoxDriver(); //Launch the Firefox Browser
        }
        else if (browser.equalsIgnoreCase("Edge"))
        {
            driver = new EdgeDriver(); // Launch the Edge browser
        }
        else
            System.out.println("Give the browser name between Chrome , FireFox or Edge");

        driver.get(baseUrl); // Open the Url
        driver.manage().window().maximize(); // maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // giving the implicit wait
        System.out.println("Page Title : " + driver.getTitle()); // Print the Page Title
        System.out.println("Current Url : " + driver.getCurrentUrl()); //Print the Current Url
        System.out.println("Page Source : " + driver.getPageSource()); // Print the Page source
        driver.findElement(By.name("username")).sendKeys("Admin"); // Enter the Username into Username Field
        driver.findElement(By.name("password")).sendKeys("Admin123"); // Enter the Password into Password field

        driver.close(); // closing the browser

    }

}
