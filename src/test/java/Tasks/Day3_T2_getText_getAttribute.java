package Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLException;

public class Day3_T2_getText_getAttribute {
    public static void main(String[] args) throws SQLException {/*
        TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        1- Open a chrome browser
        2- Go to: https://login1.nextbasecrm.com/
        3- Verify “remember me” label text is as expected:
        Expected: Remember me on this computer
        4- Verify “forgot password” link text is as expected:
        Expected: Forgot your password?
                5- Verify “forgot password” href attribute’s value contains expected:
        Expected: forgot_password=yes
        PS: Inspect and decide which locator you should be using to locate web
        elements.   */

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRememberMeLabel= "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();

        if (actualRememberMeLabel.equals(expectedRememberMeLabel)){
            System.out.println("Label verification PASSED!");
        }else{
            System.out.println("Label verification FAILED!!!");
        }

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));

        String expectedForgotPasswordLinkText = "FORGOT YOUR PASSWORD?";
        String actualForgotPasswordLinkText = forgotPasswordLink.getText();

        if (actualForgotPasswordLinkText.equals(expectedForgotPasswordLinkText)){
            System.out.println("Forgot password link verification PASSED!");
        }else {
            System.out.println("actualForgotPasswordLinkText = " + actualForgotPasswordLinkText);
            System.out.println("expectedForgotPasswordLinkText = " + expectedForgotPasswordLinkText);

            System.out.println("Forgot password link verification FAILED!!!");
        }


        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        String expectedInHref = "forgot_password=yes";
        String actualHrefAttributeValue = forgotPasswordLink.getAttribute("href");

        System.out.println("actualHrefAttributeValue = " + actualHrefAttributeValue);

        if (actualHrefAttributeValue.contains(expectedInHref)){
            System.out.println("HREF attribute value verification PASSED!");
        }else{
            System.out.println("HREF attribute value verification FAILED!!!");
        }

        System.out.println("THE END");



    }
}
