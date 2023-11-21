package day05_JunitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class google_test {
    public static void main(String[] args) {
        /*
        2- https://www.google.com/ adresine gidin
3- cookies uyarisini kabul ederek kapatin
4- Sayfa basliginin “Google” ifadesi icerdigini test edin
5- Arama cubuguna “Nutella” yazip aratin
6- Bulunan sonuc sayisini yazdirin
7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
8- Sayfayi kapatin
         */
       // 2- https://www.google.com/ adresine gidin
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.google.com");

        //3- cookies uyarisini kabul ederek kapatin
        driver.findElement(By.xpath("//*[text()='Alle akzeptieren']"));
        //4- Sayfa basliginin “Google” ifadesi icerdigini test edin
        String expectedtitle="Google";
        String actaltitle=driver.getTitle();
        if (actaltitle.equals(expectedtitle)){
            System.out.println("title testi passed");
        }else {
            System.out.println("failed");
        }
        //5- Arama cubuguna “Nutella” yazip aratin
      WebElement titlenutella=  driver.findElement(By.xpath("//*[@name='q']"));
        titlenutella.click();
        titlenutella.sendKeys("Nutella");
        //6- Bulunan sonuc sayisini yazdirin
       WebElement sonucyazi= driver.findElement(By.id("result-stats"));
       String sonuc=sonucyazi.getText();
        System.out.println(sonuc);
        //7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
       String[] arr=sonuc.split(" ");
       String sonucsayisi=arr[1];//163.000.000
        sonucsayisi=sonucsayisi.replaceAll("\\D","");
        int sonucsayi=Integer.parseInt(sonucsayisi);
        if (sonucsayi>10000000){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }
        driver.quit();








    }
}
