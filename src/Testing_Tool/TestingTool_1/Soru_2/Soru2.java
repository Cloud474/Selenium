package Testing_Tool.TestingTool_1.Soru_2;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru2 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demo.applitools.com/");

        WebElement user=driver.findElement(By.id("username"));
        user.sendKeys("ttechno@gmail.com");

        WebElement pass=driver.findElement(By.id("password"));
        pass.sendKeys("techno123.");

        WebElement btn=driver.findElement(By.id("log-in"));
        btn.click();

        WebElement msg=driver.findElement(By.className("content-i"));
        if (msg.getText().contains("Your nearest branch closes in: 30m 5s"))
            System.out.println("test passed");
        else
            System.out.println("test failed");

        BekleKapat();
    }
}
