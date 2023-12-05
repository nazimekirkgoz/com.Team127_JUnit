package day12_webTables_excel;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;
import java.io.FileNotFoundException;

import java.io.FileInputStream;
import java.io.IOException;

public class C02 {
    @Test
    public void  excelOtomasyonu() throws IOException {
        String dosyayolu="src/test/java/day12_webTables_excel/ulkeler (1).xlsx";
        FileInputStream fileInputStream=new FileInputStream(dosyayolu);
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        Sheet sayfa1=workbook.getSheet("sayfa1");
        Row ucuncusatir=sayfa1.getRow(3);
        Cell ikinciData=ucuncusatir.getCell(2);
        System.out.println(ikinciData);
        // 12.satirda bulunan ulkenin turkce isminin "Azerbaycan" oldugunu test edin
        String actuallistenenÜlkeAdi=  sayfa1.getRow(11).getCell(2).toString();
        String expecttedtülkeadi="Azerbaycan";
        Assert.assertEquals(expecttedtülkeadi,actuallistenenÜlkeAdi);


    }
}
