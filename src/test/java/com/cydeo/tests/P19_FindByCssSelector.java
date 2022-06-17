package com.cydeo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P19_FindByCssSelector {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.search.yahoo.com");

        //use css selector to identify search box and enter "css selector"
        WebElement searchBox= driver.findElement(By.cssSelector("#yschsp"));
        searchBox.sendKeys("AYHAN KAYKAÇ");

        //click on x icon to clear out the text
        WebElement clearIcon= driver.findElement(By.cssSelector("button#sbq-clear>span.sprite"));
        clearIcon.click();

        //enter "selenium locators" into search box
        searchBox.sendKeys("ORHAN KAYKAÇ");

        //identify search icon and click on it
        WebElement searchIcon= driver.findElement(By.cssSelector("#sf > button > span"));
        searchIcon.click();

        System.out.println("driver.getTitle() = "
                + driver.getTitle());


        System.out.println("the end");

    }

}
