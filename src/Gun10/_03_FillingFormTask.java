package Gun10;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _03_FillingFormTask extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement name= driver.findElement(By.id("title"));
        name.sendKeys("Huseyin");

        WebElement surName= driver.findElement(By.id("description"));
        surName.sendKeys("BULUT");

        WebElement btn= driver.findElement(By.id("btn-submit"));
        btn.click();


        wait.until(ExpectedConditions.textToBe(By.id("submit-control"),
                "Form submited Successfully!"));

        WebElement mesaj= driver.findElement(By.id("submit-control"));
        Assert.assertEquals("Form submited Successfully!",mesaj.getText());

        BekleKapat();
    }
}
