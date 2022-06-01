package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P14_LocatingCheckBox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cydeo.com/checkboxes");

        WebElement checkBox1=driver.findElement(By.id("box1"));
        System.out.println("Before click checkBox1.isSelected() = "
                + checkBox1.isSelected());
        checkBox1.click();
        System.out.println("After click checkBox1.isSelected() = "
                + checkBox1.isSelected());

        WebElement checkBox2=driver.findElement(By.id("box2"));
        System.out.println("Before click checkBox2.getAttribute(\"checked\") = "
                + checkBox2.getAttribute("checked"));
        checkBox2.click();
        System.out.println("After click checkBox2.getAttribute(\"checked\") = "
                + checkBox2.getAttribute("checked"));

        // if we want to check the checkbox
        if (!checkBox1.isSelected()) {
            checkBox1.click();
        }else {
            System.out.println("checkbox1 is already selected");
        }


        System.out.println("the end");



    }
}
