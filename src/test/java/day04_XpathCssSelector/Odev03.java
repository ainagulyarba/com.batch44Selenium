package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev03 {
    public static void main(String[] args) throws InterruptedException {
    //   1.  https://id.heroku.com/login sayfasina gidin
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://id.heroku.com/login");
    //   2.  Bir mail adersi giriniz
     WebElement mailAdresi= driver.findElement(By.xpath("//input[@id='email']"));
     mailAdresi.sendKeys("tquisga@gmail.com");
    //   3.  Bir password giriniz
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("1234");

    //   4.  Login butonuna tiklayiniz
        WebElement login=driver.findElement(By.xpath("//button[@name='commit']"));
        login.click();
    //   5.  "There was a problem with your login." texti gorunur ise
    //   6.  "kayit yapilamadi" yazdiriniz
       // 8.  eger yazi gorunur degilse "kayit yapildi" yazdiriniz
        WebElement error=driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
        if(error.isDisplayed()){
            System.out.println("kayit yapilmadi");
        }else{
            System.out.println("kayit yapildi");
        }
        Thread.sleep(1000);
    //   9.  Tum sayfalari kapatiniz
        driver.quit();
    }
}
