package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_TekrarTesti {
  //  1. Bir class oluşturun : AmazonSearchTest
  //  2. Main method oluşturun ve aşağıdaki görevi tamamlayın.


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //  a. amazon web sayfasına gidin. https://www. amazon.com/
        driver.get("https://www.amazon.com");
        //  b. Search(ara) “city bike”
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);//1.yol
       // aramaKutusu.submit(); //2.yol-> enter tusu gibi calisir

        //  c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
      // WebElement sonucYazisiElementi=driver.findElement(By.className("sg-col-inner"));
        WebElement sonucYazisiElementi=driver.findElement(By.className("//div[@class='sg-col-14-of-20 sg-col s-breadcrumb sg-col-10-of-16 sg-col-6-of-12']"));

        //className ile daha once bu elementi locate edemedigimiz halde
        //xpath ile class attribute'unu kullanarak locate edebildik

        System.out.println(sonucYazisiElementi.getText());

      /*  //  e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        WebElement ilkUrunResmi=driver.findElement(By.className("s-image"));
        ilkUrunResmi.click();
       */

        //sadece click yapmak gibi basit bir islemde kullanacagimiz webElementler icin
        // variable olusturmadan direk locate edip istedigimiz islemi yapabiliriz

        driver.findElement(By.className("s-image")).click();

    }

}
