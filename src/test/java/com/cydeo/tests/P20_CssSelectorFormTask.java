package com.cydeo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P20_CssSelectorFormTask {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cydeo.com/registration_form");

        //locate element
        WebElement firstNameField= driver.findElement(By.cssSelector("input[name='firstname']"));
        firstNameField.sendKeys("Ayhan");

        WebElement lastNameField= driver.findElement(By.cssSelector("input[name='lastname']"));
        lastNameField.sendKeys("Kaykac");





        System.out.println("the end");

    }
}
