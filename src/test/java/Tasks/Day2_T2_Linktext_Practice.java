package Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_T2_Linktext_Practice {
    public static void main(String[] args) {
        /*TC #2: Back and forth navigation
        1- Open a chrome browser
        2- Go to: https://practice.cydeo.com
        3- Click to A/B Testing from top of the list.
        4- Verify title is:
        Expected: No A/B Test
        5- Go back to home page by using the .back();
        6- Verify title equals:
        Expected: Practice  */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");

        //3.
        WebElement ABLinkTest=driver.findElement(By.linkText("A/B Testing"));
        ABLinkTest.click();

        //4- Verify title is:
        //Expected: No A/B Test
        String expectedTitle="No A/B Test";
        String actualTitle= driver.getTitle();
        System.out.println("driver.getTitle() = " + driver.getTitle());

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification is PASSED");
        }else {
            System.out.println("Title is verification is FAILED..");
        }

        //5- Go back to home page by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        //Expected: Practice
        String expectedTitle2="Practice";
        String actualTitle2=driver.getTitle();
        System.out.println("driver.getTitle() = " + driver.getTitle());

        if (actualTitle2.equals(actualTitle2)) {
            System.out.println("Title is PASSED");
        }else {
            System.out.println("Title is FAILED");
        }

        driver.quit();
        System.out.println("THE END");


    }
}
