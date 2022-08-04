package Gun11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiris extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);

        WebElement input= driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("United States");

        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();



        BekleKapat();
    }
}
