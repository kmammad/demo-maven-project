package demo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class SeleniumDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("johnjkjkjk", Keys.ENTER);

        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        String title = driver.getTitle();
        System.out.println(title);

       // String pageSource = driver.getPageSource();
        //System.out.println(pageSource);

        Thread.sleep(5000);
        //driver.quit();
        driver.close();

      //  driver.get("https://www.duotech.io");
       // List<WebElement> links = driver.findElements(By.tagName("a"));
       // System.out.println("Number of links: " + links.size());

//        JavascriptExecutor script = new ChromeDriver();

  //      TakesScreenshot screenshot = new ChromeDriver();

    }

}
