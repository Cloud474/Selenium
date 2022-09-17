package Testing_Tool.TestingTool_1.Soru_6;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru6 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement btn=driver.findElement(By.id("fakealerttest"));
        btn.click();
        WebElement btn2= driver.findElement(By.id("modaldialog"));
        btn2.click();
        WebElement btn3= driver.findElement(By.id("dialog-ok"));
        btn3.click();
        WebElement dlg= driver.findElement(By.id("dialog-text"));
        if (dlg.getText().contains("div!"))
            System.out.println("Test Failed");
        else
            System.out.println("Test Passed");

        BekleKapat();
    }
}
