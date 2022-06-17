package com.cydeo.tests;

import com.cydeo.test_util.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P25_JavaScAlertTest extends TestBase {

    @Test
    public void testAlert(){

        driver.get("http://practice.cydeo.com/javascript_alerts");
        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();

        driver.switchTo().alert().accept(); // click ok button
        //Alert alertObj=driver.switchTo().alert();
        //alertObj.accept();  // click ok button (another method)

        WebElement confirmAlertBtn= driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        confirmAlertBtn.click();
        driver.switchTo().alert().accept(); // click ok button
        confirmAlertBtn.click();
        driver.switchTo().alert().dismiss(); // click cancel button


        WebElement promptAlertBtn = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        promptAlertBtn.click();
        System.out.println("pop up test is : " + driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("Hello there");
        driver.switchTo().alert().accept();



        System.out.println("the end");
    }


}
