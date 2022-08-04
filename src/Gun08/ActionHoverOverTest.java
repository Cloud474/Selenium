package Gun08;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

public class ActionHoverOverTest extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.etsy.com/");

        List<WebElement> cookiesAccept= driver.findElements(By.cssSelector("[data-gdpr-single-choice-accept='true']"));
        if (cookiesAccept.size()>0)
            cookiesAccept.get(0).click();


        Bekle(2);
        WebElement mucevher= driver.findElement(By.id("catnav-primary-link-10855"));
        WebElement kolye= driver.findElement(By.id("side-nav-category-link-10873"));
        WebElement bibkolye= driver.findElement(By.id("catnav-l3-10881"));

        Actions aksiyonlar=new Actions(driver);
        Bekle(2);
        aksiyonlar.moveToElement(mucevher).build().perform();
        Bekle(2);
        aksiyonlar.moveToElement(kolye).build().perform();
        Bekle(2);
        aksiyonlar.moveToElement(bibkolye).build().perform();


        bibkolye.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("bib"));
        Bekle(1);


        BekleKapat();
    }
}
