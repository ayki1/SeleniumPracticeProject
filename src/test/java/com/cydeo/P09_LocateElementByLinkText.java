package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P09_LocateElementByLinkText {
    public static void main(String[] args) throws InterruptedException {
        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to http://www.google.com
        driver.get("http://www.google.com");

        // identify and save the "About" element
        WebElement aboutLink=driver.findElement(By.linkText("Hakkında"));
        // click on the text
        aboutLink.click();

        Thread.sleep(2000);
        // identify and save the "ÜRÜNLER" element
        WebElement productsLink=driver.findElement(By.linkText("Ürünler"));
        productsLink.click();

        System.out.println("THE END");

    }
}
