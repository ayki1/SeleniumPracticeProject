package Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_Task1_YahooTitleVerification {
    public static void main(String[] args) {
        /*
        Task #1: Yahoo Title Verification
        1. Open Chrome browser
        2. Go to https://www.yahoo.com
        3. Verify title:
        Expected: Yahoo */

        // 1- Setting up the web driver manager
        WebDriverManager.chromedriver().setup();;

        // 2- Create instance of the chrome driver
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com");

        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

        //actual title comes from the browser
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected. Verification PASSED!");
        }else{
            System.out.println("Title is NOT as expected. Verification FAILED!");
        }

        System.out.println("THE END");
        driver.quit();

    }
}
