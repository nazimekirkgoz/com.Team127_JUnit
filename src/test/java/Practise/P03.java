package Practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P03 {
    /*
    BeforeClass ile driver'i oluşturun ve class icinde static yapin
Maximize edin ve 10 sn bekletin
http://www.babayigit.net/testdocs adresine gidin
1-arama kutusuna "12 Angry Men" yaz ip, cikan sonuc şayisini yazdinin
2-arama kutusuna "Vizontele" yaz ip, cikan sonuc şayisini yazdirin
3-arama kutusuna "Saving Private Ryan" yaz4p, cikan sonuc şayisini yazdirin
AfterClass ile kapatin.
     *
     */
static  WebDriver driver;
WebElement searchbox;
    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
        @AfterClass
                public static void teardown() {
            driver.quit();
        }
        @Before
                public void before() {
            driver.get("http://babayigit.net/testcods");
            driver.findElement(By.xpath("//input[@id='search']"));
            searchbox = driver.findElement(By.xpath("//input[@id='search']"));
        }
        @After
        public void after(){
                System.out.println("sonucsayisi:"+driver.findElement(By.id("result-stats")));
            }
            @Test
    public void sonuc(){
            searchbox= driver.findElement(By.id("result-stats"));
            }

        }





