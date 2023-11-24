package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P05 {





        public static void main(String[] args) {
            /**
             1- www.google.com adresine gidilir
             2- sayfanın title ve Url değerleri yazdırılır
             3- yeni bir sekme açılarak www.wisequarter.com adresine gidilir
             4- gidilen sayfanın title ve url değerleri yazdırılır
             5- ilk sekmeye geçilip, burada www.testotomasyonu.com adresine gidilir
             6- gidilen sayfanın title ve url değerleri yazdırılır
             7- açılan pencere kapatılır.

             */

            System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            //1- www.google.com adresine gidilir
            driver.get("https://www.google.com");

            //2- sayfanın title ve Url değerleri yazdırılır
            System.out.println("1.Site Title: "+driver.getTitle());
            System.out.println("1.Site URL: "+driver.getCurrentUrl());
            System.out.println("1.Site Handle(1): "+driver.getWindowHandle());

            String handle1= driver.getWindowHandle();//ilk açılan sekmenin yani google sekmesinin handle degerini bir variable yaptık
            driver.navigate().refresh();
            System.out.println("1.Site Handle(2): " + driver.getWindowHandle());
            //Pencerenin handle numarasıdır.Pencere ayni oldugu icin handle numarasi degismedi.



            //3- yeni bir sekme açılarak www.wisequarter.com adresine gidilir
            driver.switchTo().newWindow(WindowType.TAB);//yeni bir sekme actik. yani wisequarter sekmesi acildi.
            driver.get("https://www.wisequarter.com");

            //4- gidilen sayfanın title ve url değerleri yazdırılır
            System.out.println("2.Site Title: "+driver.getTitle());
            System.out.println("2.Site URL: "+driver.getCurrentUrl());
            System.out.println("2.Sitenin Handle(2): "+driver.getWindowHandle());

            String handle2= driver.getWindowHandle();
            System.out.println("Tüm Sekmeler: "+driver.getWindowHandles());//ilk handle degeri google sekmesinin, ikinci handle degeri wisequarter sekmesinindir.
            //iki farkli sekmenin iki farkli handle degeri vardir.

            //5- ilk sekmeye geçilip, burada www.testotomasyonu.com adresine gidilir
            //İlk sekmeye dönmek için o sekmenin handle variable'ı kullanılır.
            driver.switchTo().window(handle1);//birinci sekmenin handle degeri ile birinci sekmede farkli bir adrese gidilir
            driver.get("https://www.testotomasyonu.com");

            //6- gidilen sayfanın title ve url değerleri yazdırılır
            System.out.println("3.Site URL= "+driver.getCurrentUrl());
            System.out.println("3.Site Title= "+driver.getTitle());
            System.out.println("Sekme Handle = " + driver.getWindowHandle());

            //7- 2. sekmeye dönmek için 2. sekmenin handle degeri kullanılır
            driver.switchTo().window(handle2);//ikinci sekmenin handle degeri ile ikinci sekmede farkli bir adrese gidilir
            driver.get("http://www.babayigit.net");


            driver.switchTo().newWindow(WindowType.WINDOW); //yeni bir pencere açıp orada işlem yapıyor.
            System.out.println("Sekme Handle = " + driver.getWindowHandle());
            driver.get("https://www.wisequarter.com");
            driver.switchTo().window(handle1);
            driver.navigate().to("https://www.amazon.com");
            System.out.println("Sekme Handle = " + driver.getWindowHandle());



            //navigate().to() ile sayfalar arası switchTo() ile sekmeler arasında dolaşıyoruz.

            driver.quit();

        }
    }

