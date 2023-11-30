package day10_Actions_Faker;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

public class C07 extends TestBase {
    @Test
    public void test01(){
        //https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");
        //chooseFile butonuna basalim
       WebElement choose= driver.findElement(By.id("file-upload"));


        ReusableMethods.bekle(3);
        //Yuklemek istediginiz dosyayi secelim.
        String dinamikDosyaYolu = System.getProperty("user.home") +   // herkeste farkli olan kisim
                "/Downloads/picture.png/";              // herkeste ortak olan kisim


        choose.sendKeys(dinamikDosyaYolu);


        //Upload butonuna basalim.
        driver.findElement(By.id("file-submit")).click();
        //“File Uploaded!” textinin goruntulendigini test edelim.


    }










}
