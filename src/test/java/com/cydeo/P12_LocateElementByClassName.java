package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class P12_LocateElementByClassName {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cydeo.com");

        // identify span element with class name "h1y"
        WebElement headTxt= driver.findElement(By.className("h1y"));
        System.out.println("headTxt.getText() = "
                + headTxt.getText());

        // identify first item in unordered list using classname
        WebElement firstElm1=driver.findElement(By.className("list-group-item"));
        System.out.println("firstElm1.getText() = "
                + firstElm1.getText());

        //verify the "first item" text appear correctly
        if (firstElm1.getText().equals("A/B Testing")) {
            System.out.println("Text appears correctly");
        }else {
            System.out.print("Text does not appear correctly");
        }

        List<WebElement> allItems=driver.findElements
                (By.className("list-group-item"));
        System.out.println("allItems.size() = " + allItems.size());


        //driver.quit();
        System.out.println("THE END");


    }
}
