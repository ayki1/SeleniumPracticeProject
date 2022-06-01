package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P15_LocatingRadioBtn {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cydeo.com/radio_buttons");

        WebElement blueRadioBtn=driver.findElement(By.id("blue"));
        System.out.println("blueRadioBtn.isSelected() = "
                + blueRadioBtn.isSelected());
        blueRadioBtn.click();
        System.out.println("After click blueRadioBtn.isSelected() = "
                + blueRadioBtn.isSelected());

        // click on red radio btn
        WebElement redRadioBtn=driver.findElement(By.id("red"));
        System.out.println("Before click redRadioBtn.isSelected() = "
                + redRadioBtn.isSelected());
        redRadioBtn.click();
        System.out.println("After click redRadioBtn.isSelected() = "
                + redRadioBtn.isSelected());

        //check blue radio btn not selected
        System.out.println("After click blueRadioBtn.isSelected() = "
                + blueRadioBtn.isSelected());


        System.out.println("the end");



    }
}
