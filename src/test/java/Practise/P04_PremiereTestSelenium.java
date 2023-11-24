package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P04_PremiereTestSelenium {

    public static void main(String[] args) {
         /*
     . .Exercise2...
  1-Driver oluşturalim
  2-Java class'imiza chnomedriver.exe i tanitalim
  3-Driver'in tum ekranı kaplamasini saglayalim
  4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim. Egen oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
  5-"https://www.otto.de” adresine gidelim
  6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
  7-Title ve url inin "OTTO” kelimesinin içerip icermedigini kontrol edelim
  8-Ardindan "https://wisequarter.com/” adresine gidip
  9-BU adresin basligini alalim ve "Quarter” kelimesini icenip icermedigini kontrol edelim
  10-Bir onceki web sayfamiza geri donelim
  11-Sayfayı yenileyelim
  12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
     */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        driver.get("https://www.otto.de");
        String ottoUrl = driver.getCurrentUrl();
        String ottoTitle = driver.getTitle();

        System.out.println(ottoTitle);
        System.out.println(ottoUrl);

        if (ottoTitle.contains("OTTO") && ottoUrl.contains("OTTO")){
            System.out.println("TITLE and URL TEST PASSED");
        }else{
            System.out.println("TITLE and URL TEST FAILED");
        }

        // if (ottoTitle.contains("OTTO") ){
        //         System.out.println("TITLE TEST PASSED");
        //     }else{
        System.out.println("TITLE TEST FAILED");
        //     }
        // if (ottoUrl.contains("OTTO") ){
        //     System.out.println("URL TEST PASSED");
        // }else{
        //     System.out.println("URL TEST FAILED");
        // }
        System.out.println("-----------------------------------------------------------");
        driver.get("https://wisequarter.com/");
        String wqTitle= driver.getTitle();

        boolean kelime = wqTitle.contains("Quarter");

        System.out.println(wqTitle);
        if (kelime){
            System.out.println("WISE QUARTER TITLE TEST PASSED");
        }else{
            System.out.println("WISE QUARTER TITLE TEST FALIED");
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        System.out.println("-------------------Test Tamamlandı-------------------");

        driver.quit();
    }
}