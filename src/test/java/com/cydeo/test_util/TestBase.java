package com.cydeo.test_util;

import com.cydeo.utility.WebDriverFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class TestBase {

    public WebDriver driver;

    @BeforeAll
    public static void initBrowserDriver(){
        System.out.println("@BeforeAll only once before all test");
    }
    @AfterAll
    public static void teardown(){
        System.out.println("@AfterAll only once after all test");
    }

    @BeforeEach
    public void setupBrowser(){
        driver= WebDriverFactory.get("chrome");
    }

    @AfterEach
    public void closeBrowser(){
        //driver.close();
    }


}
