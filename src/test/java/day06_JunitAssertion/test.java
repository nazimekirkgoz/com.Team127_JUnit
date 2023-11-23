package day06_JunitAssertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.AssertionFailedError;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;

public class test {

   static WebDriver driver;
    @BeforeClass
    public  static  void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



    }
    @After
    public void teardown(){
        driver.quit();
    }

    /*
    a. Verilen web sayfasına gidin.
     https://testotomasyonu.com/form


 b. Sirt Agrisi ve Carpinti checkbox’larini secin
 c. Sirt Agrisi ve Carpinti checkbox’larininin seçili                                  olduğunu test edin
 d. Seker ve Epilepsi checkbox’larininin seçili                                  olmadigini test edin
     */
    @Test
    public void checkboxTesti(){
        driver.get("https://testotomasyonu.com/form");
        WebElement sirtAgrisiCheckBox = driver.findElement(By.id("gridCheck5"));

        sirtAgrisiCheckBox.submit();
        WebElement carpinti=  driver.findElement(By.id("gridCheck4"));
        carpinti.click();







}


        }






