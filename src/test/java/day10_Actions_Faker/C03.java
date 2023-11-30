package day10_Actions_Faker;

import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;




public class C03 extends TestBase {
    @Test
    public void test01(){
        //2. https://the-internet.herokuapp.com/download adresine gidelim.
        driver.get("https://the-internet.herokuapp.com/download");
        ReusableMethods.bekle(2);
        //3. logo.png dosyasını indirelim
    driver.findElement(By.xpath("//a[text()='picture.png']")).click();
        ReusableMethods.bekle(5);
        String file="C:\\Users\\kirkg\\Downloads\\picture.logo\\";


    }
}
