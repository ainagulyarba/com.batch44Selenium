package day02_driverMethods.C02_driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DrivetNavigateMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.com");
        //driver.get ile ayni islemi yapar ama DAHA HIZLIDIR

        driver.navigate().to("https://www.techproeducation.com");

        driver.navigate().back();// geldigi yere doner
        driver.navigate().forward();//ileri goturur
        driver.navigate().refresh();//sayfayi yeniler


    }
}
