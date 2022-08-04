package Gun10;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _04_Waitsoru extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.demoblaze.com/index.html");

        WebElement mobile= driver.findElement(By.xpath("//*[text()='Samsung galaxy s6']"));
        mobile.click();

        WebElement sepet= driver.findElement(By.cssSelector("[onclick='addToCart(1)']"));
        sepet.click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        WebElement ana= driver.findElement(By.id("nava"));
        ana.click();





        BekleKapat();
    }
}
