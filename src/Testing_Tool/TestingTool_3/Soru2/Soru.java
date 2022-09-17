package Testing_Tool.TestingTool_3.Soru2;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Soru extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demo.applitools.com/");
        Bekle(1);

        WebElement name= driver.findElement(By.xpath("//*[@class='form-control']"));
        name.sendKeys("ttechno@gmail.com");
        Bekle(1);
        WebElement pass= driver.findElement(By.xpath("//input[@id='password']"));
        pass.sendKeys("techno123.");
        Bekle(1);
        WebElement btn= driver.findElement(By.xpath("//*[contains(@id,'log-in')]"));
        btn.click();
        WebElement tof= driver.findElement(By.xpath("//*[@id='time' or @name='btnReset']"));

        Assert.assertTrue(driver.getCurrentUrl().contains("demo"));
        Assert.assertTrue(tof.getText().contains("nearest"));

        BekleKapat();
    }
}
