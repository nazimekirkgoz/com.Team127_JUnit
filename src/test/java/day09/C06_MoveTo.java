package day09;

import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C06_MoveTo extends TestBase {
    @Test
    public void test01(){
        //1- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        //2- Sag ust bolumde bulunan “Account & Lists” menusunun acilmasi icin
        //   mouse’u bu menunun ustune getirin
        Actions actions=new Actions(driver);
        WebElement kontolist= driver.findElement(By.xpath("(//span[@class='nav-line-2'])[1]"));
        actions.moveToElement(kontolist).perform();;
                //3- “Create a list” butonuna basint
        driver.findElement(By.xpath("//*[text()='Create a List']"));
//4- Acilan sayfada “Your Lists” yazisi oldugunu test edin
        WebElement title= driver.findElement(By.id("my-lists-tab"));
        String expected="Meine Listen";
        String actuall= driver.getTitle();
        Assert.assertTrue(title.isDisplayed());

    }
}
