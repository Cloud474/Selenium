package Gun08;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_AllertPart2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        WebElement element1= driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        element1.click();

        Bekle(1);
        driver.switchTo().alert().dismiss();
        Bekle(1);

        BekleKapat();
    }
}
