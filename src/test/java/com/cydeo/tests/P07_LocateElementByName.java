package com.cydeo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P07_LocateElementByName {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        //identy and save the search bow element
        WebElement searchBox =driver.findElement(By.name("q"));

        //enter text "selemium" and search for it
        searchBox.sendKeys("selenium");

        // click on the search button
        WebElement searhBtn=driver.findElement(By.name("btnK"));
        searhBtn.submit();

        //close the browser
        //driver.close();


    }
}
