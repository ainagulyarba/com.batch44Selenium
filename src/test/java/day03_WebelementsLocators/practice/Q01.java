package day03_WebelementsLocators.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.dom.model.ShapeOutsideInfo;

import java.time.Duration;

public class Q01 {

    public static void main(String[] args) throws InterruptedException {
        // ...Exercise1...
        // Create a new class under Q1 create main method
        // Set Path
        // Create chrome driver
        // Maximize the window
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Open google home page https://www.google.com/.
        driver.get("https://www.google.com/");
        Thread.sleep(3000);

        // On the same class, Navigate to amazon home page https://www.amazon.com/ Navigate back to google
        driver.navigate().to("https://www.amazon.com/");

        // Navigate forward to amazon
        driver.navigate().forward();

        // Refresh the page
        driver.navigate().refresh();

        // Close/Quit the browser
        driver.close();
        driver.quit();

        // And last step : print "all ok" on console
        System.out.println("all ok");


    }

}