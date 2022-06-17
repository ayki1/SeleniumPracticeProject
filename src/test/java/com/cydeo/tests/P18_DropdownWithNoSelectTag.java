package com.cydeo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P18_DropdownWithNoSelectTag {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cydeo.com/dropdown");

        //Click to open "unusual" dropdown without select tag
        WebElement dropDownLink=driver.findElement(By.linkText("Dropdown link"));
        dropDownLink.click();

        //click item with text Google
        WebElement itemGoogle=driver.findElement(By.linkText("Google"));
        itemGoogle.click();


        //click item with text ETSY
        driver.navigate().back();

        dropDownLink.click();
        WebElement itemEtsy=driver.findElement(By.linkText("Etsy"));
        itemEtsy.click();


        System.out.println("the end");

    }
}
