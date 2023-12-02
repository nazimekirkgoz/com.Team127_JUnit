package day11_waits_cookies_webTables;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class C03 extends TestBase {
    @Test
    public void  cookitestleri(){
        //1- amazon anasayfaya gidin
       driver.get("https://www.amazon.com");
        //2- tum cookie’leri listeleyin
        Set<Cookie> cookieSet=driver.manage().getCookies();
        int sirano=1;
        for (Cookie each:cookieSet
             ) {
            System.out.println(sirano + "========>" + each);
            sirano++;
        }
        //3- Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
        int expectedMincookiesayisi=5;
        int actuallCookiesayisi=cookieSet.size();
        Assert.assertTrue(actuallCookiesayisi<expectedMincookiesayisi);
        }
    }

