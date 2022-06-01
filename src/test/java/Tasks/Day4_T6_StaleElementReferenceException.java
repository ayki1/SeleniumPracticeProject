package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day4_T6_StaleElementReferenceException {
    public static void main(String[] args) {/*
        TC #6: StaleElementReferenceException Task
        1- Open a chrome browser
        2- Go to: https://practice.cydeo.com/abtest
        3- Locate “CYDEO” link, verify it is displayed.
        4- Refresh the page.
        5- Verify it is displayed, again.
                This is a simple StaleElementReferenceException to understand what is
        this exception and how to handle it.    */

        //WebDriver driver = WebDriverFactory.getDriver("chrome");
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Providing extra wait time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3- Locate “CYDEO” link, verify it is displayed.
        WebElement cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']"));

        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

        //4- Refresh the page.
        driver.navigate().refresh();

        //We are refreshing the web element reference by re-assigning (re-locating) the web element
        cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']"));

        //5- Verify it is displayed, again.
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

        System.out.println("the end");


    }
}
