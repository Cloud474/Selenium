package Gun06.Soru2;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Soru extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.amazon.com/");

        WebElement menu= driver.findElement(By.id("searchDropdownBox"));
        Select ddmenu=new Select(menu);

        ddmenu.deselectByVisibleText("Books");
        Bekle(1);

        WebElement srcbutton= driver.findElement(By.id("nav-search-submit-button"));
        srcbutton.click();

        String url= driver.getCurrentUrl();
        Assert.assertTrue(url.contains("amazon"));

        BekleKapat();
    }
}
