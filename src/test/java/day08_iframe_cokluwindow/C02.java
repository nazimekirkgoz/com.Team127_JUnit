package day08_iframe_cokluwindow;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

public class C02 extends TestBase {
    // 1 ) https://the-internet.herokuapp.com/iframe adresine gidin.
    @Test
    public void test01(){
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement textbox= driver.findElement(By.tagName("h3"));
        Assert.assertTrue(textbox.isDisplayed());
        System.out.println(textbox.getText());
        WebElement iframe= driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframe);
      WebElement text=  driver.findElement(By.tagName("p"));
        text.clear();
        text.sendKeys("Merhaba dünya");
        ReusableMethods.bekle(3);
        driver.switchTo().parentFrame();
        WebElement elementel= driver.findElement(By.xpath("//*[text()='Elemental Selenium']"));
        elementel.click();
        Assert.assertTrue(elementel.isDisplayed());
        System.out.println(elementel.getText());


    }


    // 2 ) Bir metod olusturun: iframeTest
    //	- “An IFrame containing….” textinin erisilebilir oldugunu test edin ve  konsolda yazdirin.
    //	- Text Box’a “Merhaba Dunya!” yazin.

}
