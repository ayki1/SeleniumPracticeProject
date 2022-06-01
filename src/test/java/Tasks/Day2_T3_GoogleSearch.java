package Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_T3_GoogleSearch {
    public static void main(String[] args) {
        /*TC#3: Google search
        1- Open a chrome browser
        2- Go to: https://google.com
        3- Write “apple” in search box
        4- Click google search button
        5- Verify title:
        Expected: Title should start with “apple” word  */

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        //3-4 Write “apple” in search box and search
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("apple" + Keys.ENTER);

        //5- Verify title:
        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }

        driver.quit();
        System.out.println("THE END");



    }
}
