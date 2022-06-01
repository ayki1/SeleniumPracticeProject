package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class P11_LocateElementByTagName {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cydeo.com");

        // identify first element with <a> tag
        WebElement firstLnk= driver.findElement(By.tagName("a"));

        // Print out text
        System.out.println("firstLnk.getText() = "
                + firstLnk.getText());

        // identify all the element with <a> tag
            //findElements method will return List<WebElement>
        List<WebElement> allLinks= driver.findElements(By.tagName("a"));
        System.out.println("allLinks.size() = " + allLinks.size());

        // iterate over this list and get the text of all link WebElement
        for (WebElement eachLink: allLinks) {
            System.out.println("Link text is " + eachLink.getText());
        }

        // click on Home link
        firstLnk.click();

        //driver.quit();
        System.out.println("THE END");


    }
}
