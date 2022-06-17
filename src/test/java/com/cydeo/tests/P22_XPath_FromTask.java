package com.cydeo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P22_XPath_FromTask {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cydeo.com/registration_form");

        //locate element using xpath and sign up and verify success msg
        WebElement headerText=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/h2"));
        System.out.println("headerText.isDisplayed() = "
                + headerText.isDisplayed());
        System.out.println("headerText.getText() = " + headerText.getText());

        WebElement firstNameField=driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[1]/div/input"));
        firstNameField.sendKeys("Ayhan");

        //last name
        driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[2]/div/input")).
                sendKeys("Kaykac");

        //username
        driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[3]/div/input")).
                sendKeys("Ayki2000");

        //email
        WebElement emailField=driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[4]/div/input"));
        emailField.sendKeys("elorsoft@gmail.com");

        //password
        driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[5]/div/input")).
                sendKeys("Org74112");

        //phoneNumber
        driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[6]/div/input")).
                sendKeys("553-805-3791");

        //Gender
        WebElement femaleRadioBtn=driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[7]/div/div[2]/label/input"));
        femaleRadioBtn.click();

        //birthday
        driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[8]/div/input")).
                sendKeys("01/05/1981");

        //department
        WebElement departmentDropdwn=driver.findElement(By.xpath("//select[@name='department']"));
        Select depObject=new Select(departmentDropdwn);
        depObject.selectByIndex(1);   //Engineering

        //job
        WebElement jobDropdwn=driver.findElement(By.xpath("//select[@name='job_title']"));
        Select jobObject=new Select(jobDropdwn);
        jobObject.selectByVisibleText("SDET");

        //Programing
        WebElement programingCheckBox=driver.findElement(By.xpath("//*[@id=\"inlineCheckbox2\"]"));
        System.out.println("programingCheckBox.isSelected() = "
                + programingCheckBox.isSelected());
        programingCheckBox.click();

        //sign up Btn
        WebElement signupBtn=driver.findElement(By.xpath("//*[@id=\"wooden_spoon\"]"));
        signupBtn.click();

        //success msg
        WebElement welldoneTxt=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/h4"));
        System.out.println("welldoneTxt.getText() = " + welldoneTxt.getText());
        System.out.println("welldoneTxt.isDisplayed() = " + welldoneTxt.isDisplayed());


        System.out.println("the end");

    }
}
