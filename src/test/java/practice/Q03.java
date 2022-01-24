package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q03 {
    public static void main(String[] args) {

        // ...Exercise3...
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

      /*

// go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
       driver.manage().deleteAllCookies();
     // driver.findElement(By.xpath("//a[@data-cc-event='click:dismiss']")).click();
//fill the firstname
      driver.findElement(By.name("firstname")).sendKeys("ainagul");
     WebElement lastname=   driver.findElement(By.name("lastname"));
     lastname.sendKeys("yarba");
        lastname.sendKeys(Keys.PAGE_DOWN);
driver.findElement(By.xpath("//input[@id='sex-0']")).click();
driver.findElement(By.xpath("//input[@id='sex-0']")).click();
driver.findElement(By.id("By.xpath("//input[@id='datepicker']")).sendKeys("10/04/2021");
WebElement prof= driver.findElement(By.id("profession-1"));
prof.click();
prof.sendKeys(Keys.PAGE_DOWN);
//driver.findElement(By.id(""))

//fill the firstname

//check the gender

//check the experience

//fill the date

//choose your profession -> Automation Tester

//choose your tool -> Selenium Webdriver

//choose your continent -> Antartica
//choose your command  -> Browser Commands
//click submit button




        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe" );
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
