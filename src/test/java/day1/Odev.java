package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev {
    public static void main(String[] args) throws InterruptedException {

       /* Question1
        1.https://www.youtube.com sayfasına gidin
        2.Title i consolda yazdirin
        3.Title “YouTube” a eşitse “correct title” yazdirin değilse “incorrect title yzdirin”
        4.Sayfayi kapatin
        5.Tum sayfalari kapatin
        6.Consola “Test completed” yazdirin
        */

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.navigate().to("https://www.youtube.com");
        System.out.println(driver.getTitle());
        Thread.sleep(3000);

     String  title =driver.getTitle();
     String arananKelime="YouTube";
     if(title.equals(arananKelime)){
         System.out.println("correct title");
     }else{
         System.out.println("incorrect title ");
     }
        driver.close();
        driver.quit();
        System.out.println("test complected");




    }
}
