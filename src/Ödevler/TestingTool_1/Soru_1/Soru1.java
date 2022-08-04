package Ödevler.TestingTool_1.Soru_1;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru1 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demoqa.com/text-box");

        Bekle(2);

        WebElement user=driver.findElement(By.id("userName"));
        user.sendKeys("Automation");

        WebElement mail=driver.findElement(By.id("userEmail"));
        mail.sendKeys("Testing@gmail.com");

        WebElement current=driver.findElement(By.id("currentAddress"));
        current.sendKeys("Testing Current Address");

        WebElement parrent=driver.findElement(By.id("permanentAddress"));
        parrent.sendKeys("Testing Permanent Address");

        WebElement btn= driver.findElement(By.className("btn-primary"));
        btn.click();

        WebElement msg=driver.findElement(By.id("name"));
        if (msg.getText().contains("Automation"))
            System.out.println("test passed");
        else
            System.out.println("test failed");

        WebElement msg1=driver.findElement(By.id("email"));
        if (msg1.getText().contains("Testing"))
            System.out.println("test passed");
        else
            System.out.println("test failed");

        BekleKapat();

    }
}
