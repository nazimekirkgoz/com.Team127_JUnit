package day13_writeExcel_screenShot;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class C02_getScreenShot extends TestBase {
    @Test
    public void screenShot() throws IOException {
        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        // Nutella icin arama yapin
        WebElement aramakutusu= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramakutusu.sendKeys("Nutella"+ Keys.ENTER);
        // Sonuclarin Nutella icerdigini test edin

        WebElement sonucYaziElementi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        String expectedIcerik ="Nutella";
        String actualSonucYazisi = sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));


        // rapor icin sayfanin fotografini cekin

        // 1.adim TakeScreenshot objesi olusturma
        TakesScreenshot tss=(TakesScreenshot) driver;
        // 2.adim fotografi kaydedecegimiz dosyayi olusturalim, dosya yolunu yazalim
        File tumSayfaShot=new File("target/screenShot/tumsayfascreenshot.png");
        // 3.adim bir gecici dosya olusturup buna tss objesi ile cektigimiz fotografi kaydedelim
        File geciciResim=tss.getScreenshotAs(OutputType.FILE);
        // 4.adim gecici resmi asil dosyaya kopyalayalim
        FileUtils.copyFile(geciciResim,tumSayfaShot);













    }
}
