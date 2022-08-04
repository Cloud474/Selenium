package Gun11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_IFramelerGiris extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);

        WebElement input= driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("United States");

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        WebElement animal= driver.findElement(By.id("animals"));
        Select menu=new Select(animal);
        menu.selectByVisibleText("Avatar");


        BekleKapat();
    }
}
