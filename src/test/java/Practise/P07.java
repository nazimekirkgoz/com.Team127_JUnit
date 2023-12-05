package Practise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase;

public class P07 extends TestBase {
    /*
    1. "http://webdriveruniversity.com/Actions" sayfasina gidin
2. "Hover over Me First" kutusunun ustune gelin
3. "Link 1" e tiklayin
4. Popup mesajini yazdirin
5. Popup'i tamam diyerek kapatin
6. "Click and hold" kutusuna basili tutun
7. "Click and hold" kutusunda cikan yaziyi yazdirin
8. "Double click me" butonunu cift tiklayin
     */
    @Test
    public void Test(){
        driver.get("http://webdriveruniversity.com/Actions");
        ReusableMethods.bekle(1);
        WebElement haveover= driver.findElement(By.xpath("//button[text()='Hover Over Me First!']"));
        Actions actions=new Actions(driver);

        actions.moveToElement(haveover).perform();
        ReusableMethods.bekle(2);

        WebElement link1= driver.findElement(By.xpath("(//div[@class='dropdown-content'])[1]"));
        link1.click();

        ReusableMethods.bekle(2);
        String  expected="Well done you clicked on the link!";
       String actuall=driver.switchTo().alert().getText();

        Assert.assertEquals(expected,actuall);
      driver.switchTo().alert().accept();
        ReusableMethods.bekle(5);

       // 6. "Click and hold" kutusuna basili tutun
        WebElement clickan= driver.findElement(By.xpath("//p[text()='Click and Hold!']"));
        ReusableMethods.bekle(2);
        actions.clickAndHold(clickan).perform();

        //actions.keyDown(clickan,Keys.SHIFT).perform();

        ReusableMethods.bekle(2);
       // 7. "Click and hold" kutusunda cikan yaziyi yazdirin
        System.out.println(clickan);
        //8. "Double click me" butonunu cift tiklayin
        WebElement doubleclick=driver.findElement(By.xpath("//div[@id='double-click']"));
        ReusableMethods.bekle(5);
        actions.doubleClick().perform();
    }
}
