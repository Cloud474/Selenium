package Gun08;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_IntroAllert extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement click= driver.findElement(By.cssSelector("[class='btn btn-default']"));
        click.click();

        Bekle(1);
        driver.switchTo().alert().accept();
        Bekle(1);


        BekleKapat();
    }
}
