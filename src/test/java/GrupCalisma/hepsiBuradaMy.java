package GrupCalisma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hepsiBuradaMy {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // navigate.to(url)
        driver.navigate().to("https://www.hepsiburada.com");

        WebElement searchBox=driver.findElement(By.xpath("//*[@id=\"SearchBoxOld\"]/div/div/div[1]/div[2]/input"));
        searchBox.sendKeys("apple");

        WebElement searchBtn=driver.findElement(By.xpath("//*[@id=\"SearchBoxOld\"]/div/div/div[2]"));
        searchBtn.click();

        //3.ürün adını al
        WebElement threeProdcutName= driver.findElement(By.xpath("(//li[@class='productListContent-item'])[5]/following-sibling::li[1]"));

        System.out.println("threeProdcutName.getText() = "
                + threeProdcutName.getText());




        System.out.println("the end");


    }
}
