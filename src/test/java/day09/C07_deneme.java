package day09;

import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase;

public class C07_deneme extends TestBase {
    @Test
    public void test01(){
        //2- https://www.testotomasyonu.com sayfasina gidelim
        //3- Arama kutusuna actions method’larini kullanarak “DELL Core I3” yazdirin
        //   ve Enter’a basarak arama yaptirin
        driver.get("https://www.testotomasyonu.com");
        ReusableMethods.bekle(1);
       WebElement box= driver.findElement(By.xpath("(//*[@id='global-search'])[1]"));
        Actions actions=new Actions(driver);
        actions.click(box)
                .keyDown(Keys.SHIFT)
                .sendKeys("DELL C")
                .keyUp(Keys.SHIFT)
                .sendKeys("ore ")
                .keyDown(Keys.SHIFT)
                .sendKeys("I")
                .keyUp(Keys.SHIFT)
                .sendKeys("3")
                .perform();


        actions.sendKeys(Keys.ENTER).perform();


        WebElement product= driver.findElement(By.xpath("//*[@class='prod-title mb-3 ']"));


        String expected="DELL Core I3";
        String actuall= product.getText();
        Assert.assertTrue(actuall.contains(expected));
        ReusableMethods.bekle(1);





    }

}
