package Gun06.Soru3;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Soru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.ebay.com/");

        WebElement ddMenu=driver.findElement(By.id("gh-cat"));
        Select menu=new Select(ddMenu);

        menu.selectByValue("14339");

        Bekle(2);
        WebElement searchBtn=driver.findElement(By.id("gh-btn"));
        searchBtn.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("ebay"));

        BekleKapat();
    }
}
