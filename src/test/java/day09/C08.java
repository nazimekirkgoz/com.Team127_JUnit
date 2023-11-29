package day09;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C08 extends TestBase {
    @Test
    public void test01(){
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _al65 _4jy3 _4jy1 selected _51sy']")).click();
        driver.findElement(By.xpath("//*[@*='open-registration-form-button']")).click();
        WebElement firstname= driver.findElement(By.xpath("//*[@name='firstname']"));
        Actions actions=new Actions(driver);
        Faker faker=new Faker();
        actions.click(firstname)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("5")
                .sendKeys(Keys.TAB)
                .sendKeys("Kas")
                .sendKeys(Keys.TAB)
                .sendKeys("2023")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_RIGHT)
                .sendKeys(Keys.ARROW_LEFT).perform();
        driver.findElement(By.xpath("(//button[@type='submit'])[3]"));





        //2- Cookies kabul edin
        //3- Yeni hesap olustur butonuna basalim
        //4- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
        //5- Kaydol tusuna basalim









    }









}
