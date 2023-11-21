package day05_JunitFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Webapp {
    public static void main(String[] args) throws InterruptedException {
      /*
      1. http://zero.webappsecurity.com sayfasina gidin
2. Signin buttonuna tiklayin
3. Login alanine  “username” yazdirin
4. Password alanina “password” yazdirin
5. Sign in buttonuna tiklayin
6. Back tusu ile sayfaya donun
7. Online Banking menusunden Pay Bills sayfasina gidin
8. amount kismina yatirmak istediginiz herhangi bir miktari yazin
9. tarih kismina “2023-09-10” yazdirin
10. Pay buttonuna tiklayin
11. “The payment was successfully submitted.” mesajinin ciktigini test edin
       */
        // 1. http://zero.webappsecurity.com sayfasina gidin
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://zero.webappsecurity.com");
        Thread.sleep(2000);
        //2. Signin buttonuna tiklayin
        driver.findElement(By.id("signin_button")).click();
        //3. Login alanine  “username” yazdirin
       WebElement logikutusu= driver.findElement(By.id("user_login"));
       logikutusu.sendKeys("username");
       //4. Password alanina “password” yazdirin
        WebElement password= driver.findElement(By.id("user_password"));
        password.sendKeys("password");
        //5. Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//*[@*='Sign in']")).click();
        //6. Back tusu ile sayfaya donun
        driver.navigate().back();
        //7. Online Banking menusunden Pay Bills sayfasina gidin
        driver.findElement(By.id("onlineBankingMenu")).click();
        driver.findElement(By.id("pay_bills_link")).click();
        //8. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        WebElement amaunt= driver.findElement(By.id("sp_amount"));

        amaunt.sendKeys("200");
        //9. tarih kismina “2023-09-10” yazdirin
        driver.findElement(By.id("sp_date")).sendKeys("2023-09-10");;


        //Pay buttonuna tiklayin
        driver.findElement(By.id("pay_saved_payees")).click();
        //11. “The payment was successfully submitted.” mesajinin ciktigini test edin
        WebElement succesfully= driver.findElement(By.id("alert_content"));
        String expected="The payment was successfully submitted.";
        String actuall=succesfully.getText();
        if (expected.equals(actuall)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }





















        driver.quit();

    }
}
