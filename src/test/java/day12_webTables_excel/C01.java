package day12_webTables_excel;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

import java.util.List;

public class C01 extends TestBase {
    @Test
    public void test01(){
        //  1. “https://testotomasyonu.com/webtables2” sayfasina gidin
        driver.get("https://testotomasyonu.com/webtables2");
        //  2. Headers da bulunan basliklari yazdirin
        List<WebElement>baslikelementleri=driver.findElements(By.xpath("//div[@role='hdata']"));
        for (int i = 0; i <baslikelementleri.size() ; i++) {
            System.out.println(i + 1 + ".elementin basligi: " + baslikelementleri.get(i).getText());
        }
            //2.yol
            List<String> baslikyazilarilerstr= ReusableMethods.stringListeDonustur(baslikelementleri);
            System.out.println(baslikyazilarilerstr);
            //  3. 3.sutunun basligini yazdirin
            ReusableMethods.bekle(2);

            System.out.println("3.sutun basligi : " + baslikyazilarilerstr.get(2));

        //  4. Tablodaki tum datalari yazdirin
        List<WebElement> datalistesi=driver.findElements(By.xpath("//*[@role='tdata']"));
        List<String> dataliststr=ReusableMethods.stringListeDonustur(datalistesi);
        System.out.println("=====data listesi======");
        System.out.println(dataliststr);
        //  5. Tabloda kac tane cell (data) oldugunu yazdirin
        System.out.println("Tablodaki data sayisi:"+datalistesi.size());
        //  6. Tablodaki satir sayisini yazdirin
        List<WebElement> satirElementlerilist=driver.findElements(By.xpath("//div[@role='trow']"));
        System.out.println(satirElementlerilist.size());
        //  7. Tablodaki sutun sayisini yazdirin
        System.out.println(dataliststr.size());
        //  8. Tablodaki 3.kolonu yazdirin
        List<WebElement> ucuncuelementlerilist=driver.findElements(By.xpath("//*[@role='trow']/*[@role='tdata'][3]"));
        List<String> ucuncuyazisilistesi=ReusableMethods.stringListeDonustur(ucuncuelementlerilist);
        System.out.println("3.sutun:"+ucuncuyazisilistesi);
//  9. Tabloda " Category" si Furniture olan urunun fiyatini yazdirin

        // bir loop ile her bir satiri tek tek inceleyelim
        // kategori degeri (yani 2.data) Furniture olan satirdaki
        // fiyat degerini(yani 3.data) yazdiralim




    }
}
