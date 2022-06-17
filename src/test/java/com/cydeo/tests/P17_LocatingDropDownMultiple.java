package com.cydeo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P17_LocatingDropDownMultiple {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //driver.manage().window().maximize();

        driver.get("http://practice.cydeo.com/dropdown");

        //identify the dropdown with multiple select options
        WebElement multiItemDropDown=driver.findElement(By.name("Languages"));

        // wrap this element into select object
        Select multiItemSelect= new Select(multiItemDropDown);

        // check if this element has multi select option
        System.out.println("multiItemSelect.isMultiple() = "
                + multiItemSelect.isMultiple());

        //check is this is a multi select list
        multiItemSelect.selectByIndex(3);
        multiItemSelect.selectByValue("c#");
        multiItemSelect.selectByVisibleText("Java");

        // deselect items
        multiItemSelect.deselectByIndex(3);
        multiItemSelect.deselectByValue("c#");
        multiItemSelect.deselectByVisibleText("Java");
        multiItemSelect.deselectAll();


        System.out.println("the end");
    }
}
