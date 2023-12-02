package day11_waits_cookies_webTables;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase;

import javax.sound.midi.Soundbank;
import java.util.List;

public class C04 extends TestBase {
    @Test
            public void webtable(){



    //1."https://testotomasyonu.com/webtables" adresine gidin
        driver.get("https://testotomasyonu.com/webtables");
    //2.Web table tum body’sini yazdirin
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.END).perform();
        actions.sendKeys(Keys.END).perform();

        WebElement element= driver.findElement(By.xpath("//tbody"));

        System.out.println(element.getText());
        //3. Web tablosunda "Comfortable Gaming Chair" bulundugunu test edin
        String expected="Comfortable Gaming Chair";
        String actuall=element.getText();
        Assert.assertTrue(actuall.contains(expected));
        //4.Web table’daki satir sayisinin 5 oldugunu test edin


        List<WebElement> satirelementstr= driver.findElements(By.xpath("//tbody/tr"));
 int expectedsatirsayisi=5;
 int actuallsaytirsayisi= satirelementstr.size();
 Assert.assertEquals(expectedsatirsayisi,actuallsaytirsayisi);
        //5.Tum satirlari yazdirin
        for (WebElement each:satirelementstr
             ) {

        }
        List<String> satirlistesi=ReusableMethods.stringListeDonustur(satirelementstr);
        System.out.println("=======Elementler listesi======");
        System.out.println(satirlistesi);
//2.yol
        for (int i = 0; i < satirlistesi.size(); i++) {
            System.out.println(i+1 + ". satir  : " + satirelementstr.get(i).getText());

        }
        //6. Web table’daki sutun sayisinin 4 olduğunu test edin
        /*
            Web table'da sutun yapisi yoktur
            satirlar ve o ssatirlardaki datalar vardir

            sutun sayisini elde etmek icin
            herhangi bir satirdaki data sayisina bakabiliriz
         */
        List<WebElement> sutunsayisi=driver.findElements(By.xpath("//thead/tr/th"));
int expectedsutun=4;
int actuallsutun=sutunsayisi.size();
Assert.assertEquals(expectedsutun,actuallsutun);

//7. 3.sutunu yazdirin
        List<WebElement> ucuncusutunlist=driver.findElements(By.xpath("//tbody/tr/td[3]"));
        for (int i = 0; i < ucuncusutunlist.size(); i++) {
            System.out.println(i+1+". satirdaki 3. sütun:" +ucuncusutunlist.get(i).getText());



        }
        //8. Tablodaki basliklari yazdirin
        //   list olarak yazdiralim
        List<String>basliklarlist =ReusableMethods.stringListeDonustur(sutunsayisi);
        System.out.println(basliklarlist);
}}

