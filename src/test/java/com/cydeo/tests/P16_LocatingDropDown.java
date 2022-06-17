package com.cydeo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P16_LocatingDropDown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cydeo.com/dropdown");

        //identify the select element
        WebElement dropDownElement=driver.findElement(By.id("dropdown"));

        // WRAP THIS ELEMENT INSIDE SELECT OBJECT
        Select selectObj= new Select(dropDownElement);

        // select 3rd item at index 2,
        selectObj.selectByIndex(2);

        //select item with value attribute 1
        selectObj.selectByValue("1");

        //select by visible text
        selectObj.selectByVisibleText("Option 2");


        System.out.println("the end");
    }
}
