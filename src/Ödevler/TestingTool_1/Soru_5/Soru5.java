package Ödevler.TestingTool_1.Soru_5;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru5 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement btn=driver.findElement(By.id("fakealerttest"));
        btn.click();
        WebElement btn2=driver.findElement(By.id("fakealert"));
        btn2.click();
        WebElement btn3=driver.findElement(By.id("dialog-ok"));
        btn3.click();
        WebElement dlg=driver.findElement(By.id("dialog-text"));
        if (dlg.getText().contains("fake"))
            System.out.println("Test Failed");
        else
            System.out.println("Test Passed");

        BekleKapat();

    }
}
