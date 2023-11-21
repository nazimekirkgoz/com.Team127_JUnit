package day05_JunitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class saucedoma_Test {
    public static void main(String[] args) {
/*
1. “https://www.saucedemo.com” Adresine gidin
2. Username kutusuna “standard_user” yazdirin
3. Password kutusuna “secret_sauce” yazdirin
4. Login tusuna basin
5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
6. Add to Cart butonuna basin
7. Alisveris sepetine tiklayin
8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
9. Sayfayi kapatin
 */

        // 1. “https://www.saucedemo.com” Adresine gidin
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com");

        //2. Username kutusuna “standard_user” yazdirin
       WebElement login= driver.findElement(By.id("user-name"));
       login.click();
       login.sendKeys("standard_user");

        //3. Password kutusuna “secret_sauce” yazdirin
        WebElement password= driver.findElement(By.xpath("//*[@id='password']"));
        password.click();
        password.sendKeys("secret_sauce");
        //4. Login tusuna basin
     driver.findElement(By.id("login-button")).click();

    //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
       WebElement canta= driver.findElement(By.id("item_4_title_link"));
       String ilkcanta= canta.getText();
        System.out.println(ilkcanta);
        canta.click();

        //6. Add to Cart butonuna basin
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        //7. Alisveris sepetine tiklayin
        driver.findElement(By.className("shopping_cart_badge")).click();
        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        WebElement sepet=driver.findElement(By.className("item_pricebar"));
        if (sepet.isDisplayed()){
            System.out.println("passed");

        }else {
            System.out.println("failed");
        }
        //9. Sayfayi kapatin
        driver.quit();

    }
}