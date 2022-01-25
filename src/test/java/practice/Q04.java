package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q04 {
    public static void main(String[] args) {

// ...Exercise4...
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

// Navigate to website  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");
// Under the  ORIGINAL CONTENTS
// click on Alerts
        driver.findElement(By.id("alerts")).click();
// print the URL
        String url1=driver.getCurrentUrl();
        System.out.println("url1 = " +url1);
// navigate back
        driver.navigate().back();

// print the URL
        String url2=driver.getCurrentUrl();
        System.out.println("url2 = " + url2);

// Click on Basic Ajax
        driver.findElement(By.id("basicajax")).click();
// print the URL
        String url3=driver.getCurrentUrl();
        System.out.println("url3 = " + url3);
// enter value-> 20 and Enter
     driver.findElement(By.id("lteq30")).sendKeys("20"+ Keys.ENTER);

// and then verify Submitted Values is displayed open page
        boolean verifySubmitted=driver.findElement(By.xpath("//p[text()='Submitted Values']")).isDisplayed();
        System.out.println(verifySubmitted? "test PASS" : "test FAILED");


// close driver
driver.close();



    }
}
