package day02_driverMethods.C02_driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigationMethods {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //  2. Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.navigate().to(" https://www.youtube.com/");

        //  3. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");

        //  4. Tekrar YouTube’sayfasina donelim
        driver.navigate().back();

        //  5. Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();

        //  6. Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();

        //  7. Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.close(); //-> sadece driver'in son bulundugu sayfayi kapatir
        driver.quit(); //->varsa acik olan tum sayfalari kapatir

        //  8. Sayfayi tam ekran yapalim
        driver.manage().window().fullscreen();


    }
}
