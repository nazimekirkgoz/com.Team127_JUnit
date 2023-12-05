package day12_webTables_excel;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03 {
    @Test
    public void readExcel() throws IOException {
        String dosyayolu="src/test/java/day12_webTables_excel/ulkeler (1).xlsx";
        FileInputStream fileInputStream=new FileInputStream(dosyayolu);
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        Sheet sayfa1= workbook.getSheet("sayfa1");
        //		- 1.satirdaki 2.hucreye gidelim ve yazdiralim//kabul
        System.out.println(sayfa1.getRow(0).getCell(1 ));
        String istenenHucrestr=sayfa1.getRow(0).getCell(1).toString();
        System.out.println(istenenHucrestr);

        //		- 2.satir 4.cell’in afganistan’in baskenti Kabil oldugunu test edelim
        String expectedHucreBilgisi = "Kabil";
        String actualHucreBIlgisi = sayfa1.getRow(1).getCell(3).toString();
        Assert.assertEquals(expectedHucreBilgisi,actualHucreBIlgisi);
        //		- Satir sayisini bulalim
        int satirsayisi= sayfa1.getLastRowNum();
        System.out.println(satirsayisi);
        //      - Samoa'nin baskent isminin Apia oldugunu test edin
        String expectbaskent="Apia";
        String actual="";
        for (int i = 0; i <=satirsayisi ; i++) {
            String ülkeismi=sayfa1.getRow(i).getCell(0).toString();


        }


    }
}
