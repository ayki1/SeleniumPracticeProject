package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P05_LocateElementById {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com");

        // identify element and save the element
        //WebElement lucyText= driver.findElement(By.id("ybar-sbq"));
        WebElement inputBox= driver.findElement(By.id("ybar-sbq"));

        // find value of attribute
        //String text= lucyText.getAttribute("value");
        inputBox.sendKeys("Hello");

        WebElement searchButon=driver.findElement(By.id("ybar-search"));
        searchButon.click();

        Thread.sleep(2000);

        String pageTitle=driver.getTitle();
        System.out.println("pageTitle = " + pageTitle);

 /*       // verify if value is "I am feeling lucky"
        if (text.equals("Kendimi Şanslı Hissediyorum")) {
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }*/


    }
}
