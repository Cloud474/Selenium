package Gun08;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class _06_AllertPart3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        Bekle(1);

        WebElement element1= driver.findElement(By.cssSelector("[onclick='myPromptFunction()']"));
        element1.click();

        Bekle(1);
        System.out.println(driver.switchTo().alert().getText());
        Bekle(1);
        driver.switchTo().alert().sendKeys("BULUT");
        Bekle(1);
        driver.switchTo().alert().accept();
        Bekle(2);
        WebElement tctactually= driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue(tctactually.getText().contains("BULUT"));


        BekleKapat();
    }
}
