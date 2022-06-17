package com.cydeo.tests;

import com.cydeo.test_util.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class p26_WebTables extends TestBase {

    @Test
    public void testWebTables(){

        driver.get("http://practice.cydeo.com/tables");

        //cell42 =Tim
        String cell42Lacotor="//*[@id=\"table1\"]/tbody/tr[4]/td[2]";
        WebElement cell42=driver.findElement(By.xpath(cell42Lacotor));
        System.out.println("cell42.getText() = " + cell42.getText());

        //print out all of row 4
        String row4CellLocator= "//table[@id='table1']/tbody/tr[4]/td";
        List<WebElement> allRow4Cell= driver.findElements(By.xpath(row4CellLocator));

        for (WebElement eachCell : allRow4Cell) {
            System.out.println("eachCell.getText() = " + eachCell.getText());
        }



    }


}
