package com.cydeo.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_ChromeDriverSetUp_withoutWebDriverManager {
    public static void main(String[] args) {
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        // navigate.to(url)
        driver.navigate().to("https://www.google.com");
        driver.manage().window().maximize();

        // driver.get(url)
//        driver.get("https://www.google.com");

        System.out.println("the end");


    }
}

