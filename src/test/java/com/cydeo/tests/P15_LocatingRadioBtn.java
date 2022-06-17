package com.cydeo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

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

        //identify green radio btn
        WebElement greenRadioBtn=driver.findElement(By.id("green"));
        greenRadioBtn.click();

        System.out.println("greenRadioBtn.isSelected() = "
                + greenRadioBtn.isSelected());

        System.out.println("greenRadioBtn.isEnabled() = "
                + greenRadioBtn.isEnabled());

        //list radios
        List<WebElement> allColorRadios=driver.findElements(By.name("color"));
        System.out.println("allColorRadios.size() = "
                + allColorRadios.size());

        // check radio for enable or disable
        for (WebElement eachColorRadio : allColorRadios) {
            System.out.println("Current radio button is "
                    + eachColorRadio.getAttribute("id"));
            System.out.println("is it Enabled = "
                    + eachColorRadio.isEnabled());
            System.out.println("is it Selected = "
                    + eachColorRadio.isSelected());
        }
                
        System.out.println("the end");

    }
}
