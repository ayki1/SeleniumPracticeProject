package com.cydeo.tests;

import com.cydeo.test_util.TestBase;
import org.junit.jupiter.api.Test;

public class p27_iFrame extends TestBase {

    @Test
    public void test_iFrame(){

        driver.get("http://practice.cydeo.com/iframe");

        // switch to iframe using index
        driver.switchTo().frame(0);

        // identify the <p> element inside the frame

        //WebElement pTagElmInsideFrame= driver.findElement(By.tagName("p"));
        //System.out.println("pTagElmInsideFrame = " + pTagElmInsideFrame);

    }


}
