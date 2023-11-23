package day07;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class CheckBox extends TestBase {
    /*
    //a. Verilen web sayfasına gidin.
        //	     https://the-internet.herokuapp.com/checkboxes
        //	b. Checkbox1 ve checkbox2 elementlerini locate edin.

        //	c. Checkbox1 seçili değilse onay kutusunu tıklayın
        //	d. Checkbox2 seçili değilse onay kutusunu tıklayın
         //	e. Checkbox1 ve Checkbox2’nin seçili olduğunu test edin
     */
    @Test
    public void url() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        //	b. Checkbox1 ve checkbox2 elementlerini locate edin.
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        if (!checkbox1.isSelected()) {
            checkbox1.click();

        }
        if (!checkbox2.isSelected()) {
            checkbox1.click();


        }
        Assert.assertTrue(checkbox1.isSelected() && checkbox2.isSelected());

    }
}
