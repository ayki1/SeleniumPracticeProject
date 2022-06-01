package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_BasicNavigation {
    public static void main(String[] args) {
        /*
        - Basic navigations

        driver.navigate() --> navigate methods allows us to do simple navigations
        driver.navigate().forward () --> will take page to forward page
        driver.navigate().back() --> will take page to previous page
        driver.navigate().refresh()--> will refresh the current page
        driver.navigate().to() --> exactly same as .get() method
        driver.getTitle();
        driver.getCurrentUrl();   */

        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        // navigate.to(url)
        driver.navigate().to("https://www.google.com");

        // driver.get(url)
//        driver.get("https://www.google.com");

        //navigate.back()
        driver.navigate().back();

        // navigate.forward()
        driver.navigate().forward();

        // navigate.refresh()
        driver.navigate().refresh();

        System.out.println("driver.manage().window().getPosition() = "
                            + driver.manage().window().getPosition());

        //get the title of the page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentURL =  driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);
        //get the current title after getting the google page
        currentTitle = driver.getTitle();

        //System.out.println("driver.getTitle() = " + driver.getTitle());

        System.out.println("THE END");
        driver.quit();

    }
}
