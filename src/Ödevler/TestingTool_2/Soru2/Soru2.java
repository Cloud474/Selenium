package Ödevler.TestingTool_2.Soru2;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demo.applitools.com/");
        Bekle(2);
        WebElement user=driver.findElement(By.cssSelector("[class='form-group']>input"));
        user.sendKeys("ttechno@gmail.com");
        WebElement pass=driver.findElement(By.cssSelector("[id='password'][class='form-control']"));
        pass.sendKeys("techno123.");
        WebElement sign=driver.findElement(By.cssSelector("[class='buttons-w']>a"));
        sign.click();
        WebElement msg= driver.findElement(By.cssSelector("[class='content-box']>div h6"));
        if (msg.getText().contains("branch"))
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed");

        BekleKapat();
    }
}
