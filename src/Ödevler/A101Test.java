package Ödevler;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class A101Test extends BaseStaticDriver {
    public static void main(String[] args) {


        driver.get("https://www.a101.com.tr/");
        driver.manage().window().maximize();

        WebElement kabul = driver.findElement(By.xpath("//button[contains(text(),'Kabul Et')]"));
        kabul.click();
        Bekle(1);
        WebElement giyim= driver.findElement(By.cssSelector("[title='GİYİM & AKSESUAR']"));

        Actions aksiyonlar=new Actions(driver);
        Bekle(1);
        aksiyonlar.moveToElement(giyim).build().perform();
        Bekle(1);
        WebElement dizAlti= driver.findElement(By.linkText("Dizaltı Çorap"));
        aksiyonlar.moveToElement(dizAlti).build().perform();
        dizAlti.click();

        WebElement dizAltiTrue=driver.findElement(By.xpath("//h1[text()='Dizaltı Çorap']"));
        Bekle(2);
        Assert.assertTrue(dizAltiTrue.getText().contains("Dizaltı"));

        BekleKapat();
    }
}
