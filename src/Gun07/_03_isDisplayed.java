package Gun07;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_isDisplayed extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.facebook.com/");
        Bekle(1);

        WebElement buttn= driver.findElement(By.cssSelector("[id^='u_0_0_']"));
        buttn.click();
        Bekle(1);

        WebElement isim= driver.findElement(By.name("firstname"));
        isim.sendKeys("Hüseyin");
        Bekle(1);

        WebElement soyad= driver.findElement(By.name("lastname"));
        soyad.sendKeys("Bulut");
        Bekle(1);

        WebElement email2=driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse(email2.isDisplayed());
        Bekle(1);

        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("huseyin.blt47@hotmail.com");
        Assert.assertTrue(email2.isDisplayed());

        BekleKapat();
    }
}
