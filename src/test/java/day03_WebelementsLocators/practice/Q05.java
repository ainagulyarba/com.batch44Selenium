package day03_WebelementsLocators.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q05 {
    public static void main(String[] args) {
        // ...Exercise5...


        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");

// Click on  Calculate under Micro Apps
        driver.findElement(By.id("calculatetest")).click();
//    Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("5");
        driver.findElement(By.id("function")).click();
        driver.findElement(By.id("number2")).sendKeys("3");
        driver.findElement(By.id("calculate")).click();
        String result=driver.findElement(By.id("answer")).getText();
        System.out.println("result = " + result);

//    Type any number in the second input

// Click on Calculate
// Get the result
// Print the result

/*    System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.id("calculatetest")).click();
        WebElement firstBox = driver.findElement(By.id("number1"));
        WebElement secondBox = driver.findElement(By.id("number2"));
        firstBox.sendKeys("25");
        secondBox.sendKeys("60");
        WebElement calculate = driver.findElement(By.id("calculate"));
        calculate.click();
        String answer = driver.findElement(By.id("answer")).getText();
        System.out.println("answer = " + answer);

*/




    }
}
