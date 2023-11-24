package Practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestBase;
import utilities.TestBase_BeforeClass;

import java.time.Duration;

public class P04  extends TestBase_BeforeClass {

 static String url="https://";



@Test
        public void google() {
        //1- www.google.com adresine gidilir

        driver.get(url + "www.google.com");
        driver.findElement(By.id("L2AGLb"));
        System.out.println("title:"+driver.getTitle());
        System.out.println("url:"+driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle());
        driver.switchTo();



//2- sayfanın title ve Url değerleri yazdırılır

//3- yeni bir sekme açılarak www.wisequarter.com adresine gidilir
//4- gidilen sayfanın title ve url değerleri yazdırılır
//5- ilk sekmeye geçilip, burada www.testotomasyonu.com adresine gidilir
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(url+"www.testotomasyonu.com ");
//6- gidilen sayfanın title ve url değerleri yazdırılır
//7- açılan pencere kapatılır.


}


        }


