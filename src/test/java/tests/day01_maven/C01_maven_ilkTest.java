package tests.day01_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_maven_ilkTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //testotomasyonu.com sayfasina gidin


        driver.get("https://www.testotomasyonu.com");
        Thread.sleep(3000);
        driver.quit();
    }
}
