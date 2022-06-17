package com.cydeo.tests;

import com.cydeo.test_util.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class ForgetPasswordPage extends TestBase {

    @Test
    public void testForgetPassword(){

        driver.get("http://practice.cydeo.com/forgot_password");
        driver.findElement(By.name("email")).
                sendKeys("elorsoft@gmail.com"+ Keys.ENTER);

        String currentURl= driver.getCurrentUrl();

        //assertion
        assertTrue(currentURl.endsWith("email_sent"));

        System.out.println("the end");

    }

}
