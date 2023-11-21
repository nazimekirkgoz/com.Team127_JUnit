package day06_JunitAssertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class test {
    /*
    ) https://www.bestbuy.com/ Adresine gidin farkli test method’lari olusturarak asagidaki testleri yapin
 ○ Sayfa URL’inin https://www.bestbuy.com/ ’a esit oldugunu test edin
 ○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
 ○ logoTest => BestBuy logosunun görüntülendigini test edin
 ○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
     */
 static    WebDriver driver;
@BeforeClass
    public static void setup(){
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.bestbuy.com");

}
@Test
    public static void urlTesti(){
    String expectedurl="https://www.bestbuy.com";
    String actualurl= driver.getCurrentUrl();
    Assert.assertEquals(expectedurl,actualurl);


}
@Test
    public static final void titletest(){
    String unexpectedicerik="Rest";
    String actualTitle= driver.getTitle();
    Assert.assertFalse(actualTitle.contains(unexpectedicerik));


}
@Test
    public static   void logotesti(){
    WebElement logo=driver.findElement(By.xpath("(//img[@class=‘logo’])[1]"));
    Assert.assertTrue(logo.isDisplayed());
}
@Test
    public static  void francislink(){
    WebElement francis= driver.findElement(By.className("Français"));
}
}
