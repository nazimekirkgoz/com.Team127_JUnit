package day06_JunitAssertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.AssertionFailedError;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import utilities.ReusableMethods;
import utilities.TestBase;

import java.time.Duration;

public class test extends TestBase {
    /*
    1. http://zero.webappsecurity.com/ Adresine gidin
 2. Sign in butonuna basin
 3. Login kutusuna “username” yazin
 4. Password kutusuna “password” yazin
 5. Sign in tusuna basin, back tusuna basarak sayfaya donun
6. Online banking menusunden Pay Bills sayfasina gidin
7. “Purchase Foreign Currency” tusuna basin
8. “Currency” drop down menusunden Eurozone’u secin
9. “amount” kutusuna bir sayi girin
10. “US Dollars” in secilmedigini test edin
11. “Selected currency” butonunu secin
12. “Calculate Costs” butonuna basin sonra “purchase” butonuna basin
13. “Foreign currency cash was successfully purchased.” yazisinin ciktigini kontrol edin.
     */


   @Test
    public void url(){
        driver.get("http://zero.webappsecurity.com/");
        driver.findElement(By.id("signin_button")).click();
        WebElement login= driver.findElement(By.id("user_login"));
            login.sendKeys("username");
       WebElement password= driver.findElement(By.id("user_password"));
       login.sendKeys("password");
       driver.findElement(By.xpath("//*[@name='submit']")).click();
       driver.navigate().back();
       driver.findElement(By.id("onlineBankingMenu")).click();
       driver.findElement(By.id("pay_bills_link")).click();
driver.findElement(By.xpath("(//li[@class='ui-state-default ui-corner-top'])[2]")).click();
driver.findElement(By.xpath("//select[@id='pc_currency']")).click();
WebElement currencyddm=driver.findElement(By.id("pc_currency"));
       Select selectcurrency=new Select(currencyddm);
       selectcurrency.selectByValue("EUR");
       driver.findElement(By.id("pc_amount")).sendKeys("100");
       String unexpected="US Dollars";
       String actualltoption=selectcurrency.getFirstSelectedOption().getText();
       Assert.assertNotEquals(unexpected,actualltoption);
       driver.findElement(By.id("pc_inDollars_false")).click();
       driver.findElement(By.id("pc_calculate_costs")).click();
 driver.findElement(By.id("purchase_cash")).click();

      }






}








