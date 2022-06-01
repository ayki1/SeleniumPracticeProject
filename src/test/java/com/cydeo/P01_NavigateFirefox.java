package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P01_NavigateFirefox {
    public static void main(String[] args) {
        // 1- Setup Firefox driver
        WebDriverManager.firefoxdriver().setup();

        // 2- Create Firefox driver object to open browser
        WebDriver driver= new FirefoxDriver();

        driver.get("https://www.google.com");
        //driver.get("https://www.modalife.com");


    }

}
