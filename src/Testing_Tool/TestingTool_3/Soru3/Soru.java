package Testing_Tool.TestingTool_3.Soru3;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Soru extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");
        Bekle(1);

        WebElement search= driver.findElement(By.xpath("//*[@id='inputValEnter']"));
        search.sendKeys("teddy bear");
        Bekle(1);

        WebElement btn= driver.findElement(By.xpath("//*[text()='Search']"));
        btn.click();
        Bekle(1);

        WebElement tedd= driver.findElement(By.xpath("//*[@class='search-result-txt-section  marT12']/span"));
        Bekle(1);
        Assert.assertTrue(driver.getCurrentUrl().contains("snapdeal"));
        Assert.assertTrue(tedd.getText().contains("teddy"));

        BekleKapat();

    }
}
