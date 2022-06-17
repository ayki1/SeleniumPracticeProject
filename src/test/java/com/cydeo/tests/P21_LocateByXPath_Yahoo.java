package com.cydeo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P21_LocateByXPath_Yahoo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.search.yahoo.com");

        //use xpath to identify search box and enter "xpath"
        //  //*[@name="p"]
        WebElement searchBoxField=driver.findElement(By.xpath("//input[@name='p']"));
        searchBoxField.sendKeys("xpath");

        // click on x icon to clear out the text
        // //*[@id=\"sbq-clear\"]
        driver.findElement(By.xpath("//button[@id='sbq-clear']")).click();

        // enter "selenium xpath" into search box
        searchBoxField.sendKeys("Selenium xpath");

        //identify search icon and click on it
        ////*[@id="sf"]/button/span
        driver.findElement(By.xpath("//span[@title='Search']")).click();



        System.out.println("the end");

    }
}
