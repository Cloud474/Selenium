package Gun11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_IFrameSoru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://chercher.tech/practice/frames");

        driver.switchTo().frame(0);

        WebElement input= driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("United States");

        driver.switchTo().frame(0);

        WebElement check= driver.findElement(By.cssSelector("[type='checkbox']"));
        check.click();


        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        WebElement animal= driver.findElement(By.id("animals"));
        Select menu=new Select(animal);
        menu.selectByVisibleText("Avatar");



        BekleKapat();
    }
}
