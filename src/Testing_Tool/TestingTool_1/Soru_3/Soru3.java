package Testing_Tool.TestingTool_1.Soru_3;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru3 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

        WebElement search=driver.findElement(By.id("inputValEnter"));
        search.sendKeys("teddy bear");

        WebElement btn=driver.findElement(By.className("searchTextSpan"));
        btn.click();

        WebElement drv=driver.findElement(By.id("searchMessageContainer"));
        if (drv.getText().contains("teddy bear"))
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed");

        BekleKapat();
    }
}
