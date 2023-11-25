package day08_iframe_cokluwindow;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C05  extends TestBase {
    @Test
    public void Test02() {


        // Testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");
        // url'in testotomasyonu icerdigini test edin
        String expected="testotomasyonu";
        String actuall= driver.getCurrentUrl();
        Assert.assertTrue(actuall.contains(expected));
       String anasayfaWhD=driver.getWindowHandle();
        // yeni bir tab olarak elctronics linkini acin
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.testotomasyonu.com");
        driver.findElement(By.xpath("(//a[text()='Electronics'])[3]")).click();
        String electeronicWHD= driver.getWindowHandle();
        String expectedicerik="Electronics";
        String actuallicerik= driver.getTitle();
        Assert.assertTrue(actuallicerik.contains(expectedicerik));
        driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.testotomasyonu.com/");
        driver.findElement(By.xpath("(//li[@class='has-sub'])[2]")).click();
        String menFashionWHD= driver.getWindowHandle();
        expectedicerik="Men Fashion";
        actuallicerik=driver.getTitle();
        Assert.assertTrue(actuallicerik.contains(expectedicerik));
        driver.switchTo().window(anasayfaWhD);
        String expectedurl="https://www.testotomasyonu.com/";
        String actuallurl= driver.getCurrentUrl();
        Assert.assertEquals(expectedurl,actuallurl);
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.testotomasyonu.com/");
        driver.findElement(By.xpath("(//li[@class='has-sub'])[2]"));
        String menfashion= driver.getWindowHandle();

        // menfashion sayfasinin acildigini test edin
        expectedicerik = "Men Fashion";
        actuallicerik = driver.getTitle();




    }
}


