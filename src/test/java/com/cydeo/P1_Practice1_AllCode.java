package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class P1_Practice1_AllCode {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://saucedemo.com");

        //print title
        System.out.println("driver.getTitle() = " + driver.getTitle());

        //Enter username: standard_user
        WebElement userName= driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");

        //Enter password: secret_sauce
        WebElement password= driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        //Click on Login btn
        WebElement loginBtn=driver.findElement(By.id("login-button"));
        loginBtn.submit();

        //first product price
        WebElement firstProductPrice= driver.findElement(By.className("inventory_item_price"));
        WebElement firstProductName=driver.findElement(By.className("inventory_item_name"));
        System.out.println("firstProductName = "
                + firstProductName.getText());
        System.out.println("firstProductPrice.getText() = "
                + firstProductPrice.getText());

        // Get all product names into List<WebElement>
        List<WebElement> allProductTitle=driver.findElements(By.className("inventory_item_name"));

            //Get the count
        System.out.println("allProduct = " + allProductTitle.size());

            //print out the text of all product title
        for (WebElement eachTitleText : allProductTitle) {
            String productTitleText= eachTitleText.getText();
            System.out.println("productTitleText = " + productTitleText);
        }

        // Click on shopping cart
        WebElement cartContainerElm=driver.findElement(By.id("shopping_cart_container"));
        cartContainerElm.click();

        //Come back product page
        WebElement continueShopBtn=driver.findElement(By.id("continue-shopping"));
        continueShopBtn.click();

        Thread.sleep(5000);

        driver.quit();
        System.out.println("THE END");
    }
}
