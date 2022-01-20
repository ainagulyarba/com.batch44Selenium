package day03_WebelementsLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class odev {
    public static void main(String[] args) {


    //  1-driver olusturalim
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    //  2-java class'imiza chromedriver.exe'yi tanitalim
    //  3-driver'in tum ekrani kaplamasini saglayalim
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    //  4-https://github.com/ adresine gidelim
        driver.navigate().to("https://github.com/");

    //  5-Ardindan https://www.hepsiburada.com/ adrsine gidelim
        driver.navigate().to("https://www.hepsiburada.com/");

    //  6-Title ve url console da yazdirin ve yine title ve url in "burada" kelimesini icerip icermedigini kontrol edelim
        System.out.println(driver.getTitle()+ "\n " +driver.getCurrentUrl());
     String actualTitle = driver.getTitle();
     String expectedTitle="burada";
     if(actualTitle.contains(expectedTitle)){
         System.out.println("title testi PASS");
     }else{
         System.out.println("title testi FAILED");
     }

     String actualUrl =driver.getCurrentUrl();
     String expectedUrl ="burada";
     if(actualUrl.contains(expectedUrl)){
         System.out.println("Url testi PASS");
     } else{
         System.out.println("Url testi FAILED");
     }
    //  7-Sonrasinda https://github.com/ adresine geri donelim ve  sayfayi yenileyelim
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().refresh();

    //  8-Son adim olarak butun sayfalarimizi kapatmis olalim
        driver.quit();


    }
}
