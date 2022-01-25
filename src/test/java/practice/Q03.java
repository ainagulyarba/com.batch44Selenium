package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.image.Kernel;
import java.time.Duration;

public class Q03 {
    public static void main(String[] args) throws InterruptedException {

        // ...Exercise3...
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        Thread.sleep(3000);
      WebElement cookie= driver.findElement(By.xpath("//a[@class='cc_btn cc_btn_accept_all']"));
      cookie.click();
        driver.findElement(By.xpath("(//a[@class='cookie-choices-button'])[2]")).click();
      //  driver.findElement(By.xpath("(//a[@class='cookie-choices-button'])[2]")).click();
        //fill the firstname
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ainagul");

        //fill the lastname
       WebElement lastname= driver.findElement(By.xpath("//input[@name='lastname']"));
             lastname.sendKeys("yarba"+ Keys.PAGE_DOWN);

        //check the gender
        driver.findElement(By.xpath("//input[@id='sex-1']")).click();
        //check the experience
        driver.findElement(By.xpath("//input[@id='exp-1']")).click();
        //fill the date
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/09/2021");
        //choose your profession -> Automation Tester

        //choose your tool -> Selenium Webdriver

        //choose your continent -> Antartica
        //choose your command  -> Browser Commands
        //click submit button



/*      System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@class='cookie-choices-button'][2]")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Oguzhan");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Yucedal");
        driver.findElement(By.xpath("//input[@id='sex-0']")).click();
        driver.findElement(By.xpath("//input[@id='exp-6']")).click();
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("15.05.2030");
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();
        driver.findElement(By.xpath("//select[@id='continents']")).sendKeys("Africa");
        driver.findElement(By.xpath("//option[normalize-space()='Browser Commands']")).click();
*/



    }
}
