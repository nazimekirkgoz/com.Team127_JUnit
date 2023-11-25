package day08_iframe_cokluwindow;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C03 extends TestBase {
    @Test
    public void demo(){
        //http://demo.guru99.com/ sitesine gidiniz
        driver.get("http://demo.guru99.com/test/guru99home/");
        //Cookies kabul edin
        // cookies de iframe icinde oldugundan
        // once o iframe'e gecis yapalim
        WebElement cookie=driver.findElement(By.xpath("(//iframe)[4]"));
        driver.switchTo().frame(cookie);
        driver.findElement(By.xpath("//span[text()='Alle akzeptieren']"));
        //driver.switchTo().parentFrame();
        //3) sayfadaki iframe sayısını bulunuz.
        List<WebElement>iframelist=driver.findElements(By.tagName("iframe"));
        System.out.println("sayfadaki iframe sayisi:"+iframelist.size());
        //4) ilk iframe'deki (Youtube) play butonuna tıklayınız.
        WebElement playIFrame = driver.findElement(By.xpath("(//iframe)[4]"));
        driver.switchTo().frame(playIFrame);
       driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")).click();
driver.switchTo().defaultContent();//en basa döner





    }
}
