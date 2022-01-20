package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_CssSelector {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
    //  1 ) Bir class oluşturun : Locators_css
    //  2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.
    //          a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");

    //  b. Locate email textbox
        WebElement emailTextBox=driver.findElement(By.cssSelector("#session_email"));//Xpath

        //  c. Locate password textbox ve
        WebElement passwordTextBox=driver.findElement(By.cssSelector("input[placeholder='Password']"));

    //  d. Locate signin button
        WebElement signInButton=driver.findElement(By.cssSelector("input[name='commit']"));

    //  e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın

    //  i. Username : testtechproed@gmail.com

    //  ii. Password : Test1234!
    //          NOT: cssSelector kullanarak elementleri locate ediniz.




        //KISA YOLLAR:
        // ıd ile yapiliyorsa id yerine  # koyarsak ıd yi direk buluyor
        // class ile yapiliyorsa class yerine  . koyarsak classi  direk buluyor

    }
}
