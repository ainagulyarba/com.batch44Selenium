package day02_driverMethods.C02_driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle()); // sayfanin title'ini getirir

        System.out.println(driver.getCurrentUrl()); // sayfanin adresini getirir

        System.out.println(driver.getWindowHandle()); // ->kimlik numarasi ->CDwindow-1B38CAA83610265A3AD8EF38AAEBFE71

        System.out.println(driver.getPageSource()); // sayfanin kaynagini getiriyor






    }






}
