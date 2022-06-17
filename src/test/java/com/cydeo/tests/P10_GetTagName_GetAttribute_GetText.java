package com.cydeo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10_GetTagName_GetAttribute_GetText {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("ModaLife");

        // Get tag name of element
        System.out.println("searchBox.getTagName() = "
                + searchBox.getTagName());

        // Get value attribute of element
        System.out.println("searchBox.getAttribute(\"value\") = "
                + searchBox.getAttribute("value"));

        // identify search button
        WebElement searchBtn= driver.findElement(By.name("btnK"));

        //Get tag name
        System.out.println("searchBtn.getTagName() = "
                + searchBtn.getTagName());
        System.out.println("searchBtn.getAttribute(\"class\") = "
                + searchBtn.getAttribute("class"));

        // Click Button
        searchBtn.click();

        // identify element that hold search result number
        WebElement searchResult=driver.findElement(By.id("result-stats"));

        // Get text of element
        String resultText=searchResult.getText();
        System.out.println("resultText = " + resultText);

        System.out.println("THE END");


    }
}
