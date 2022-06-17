package com.cydeo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P08_LocateElementByTagName {
    public static void main(String[] args) {
        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to http://www.cydeo.com
        //driver.get("http://www.practice.cydeo.com/");
        driver.get("https://htmlg.com/html-editor/");

        // identify and save the "Test Auto Practice" element
        WebElement text=driver.findElement(By.tagName("h1"));

        // print out the text
        System.out.println(text.getText());

    }
}
