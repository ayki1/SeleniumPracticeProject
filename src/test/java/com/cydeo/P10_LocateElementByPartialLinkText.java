package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10_LocateElementByPartialLinkText {
    public static void main(String[] args) {
        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to http://www.google.com
        driver.get("https://www.google.com");

        // identify and save the "Arama nasıl çalışır?" element
        WebElement findText=driver.findElement(By.partialLinkText("Arama nasıl"));
        // print out text
        System.out.println(findText.getText());

        findText.click();

        System.out.println("THE END");





    }
}
