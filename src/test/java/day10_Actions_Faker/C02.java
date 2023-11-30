package day10_Actions_Faker;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase;

public class C02 extends TestBase {
    @Test
    public  void  test01(){
        //2- https://html.com/tags/iframe/ sayfasina gidelim
        driver.get("https://html.com/tags/iframe/");
        //3- video’yu gorecek kadar asagi inin
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Actions actions1=new Actions(driver);
        actions1.sendKeys(Keys.PAGE_DOWN).perform();
        //4- videoyu izlemek icin Play tusuna basin
        // play butonu iframe icinde oldugundan, once iframe'e gecis yapalim.
        ReusableMethods.bekle(2);
        WebElement iframe=  driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));
        driver.switchTo().frame(iframe);
        ReusableMethods.bekle(2 );

        driver.findElement(By.xpath("//*[@*='ytp-title-link yt-uix-sessionlink']")).click();
        //5- videoyu calistirdiginizi test edin
       WebElement control=  driver.findElement(By.xpath("//*[@*='ytp-title-link yt-uix-sessionlink']"));
        Assert.assertTrue(control.isDisplayed());

ReusableMethods.bekle(2);
    }
}
