package Testing_Tool.TestingTool_2.Soru1;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demoqa.com/text-box");

        WebElement auto=driver.findElement(By.cssSelector("[id='userName-wrapper']>div input"));
        auto.sendKeys("Automation");
        Bekle(1);
        WebElement mail=driver.findElement(By.cssSelector("[id='userEmail-wrapper'] [id='userEmail']"));
        mail.sendKeys("Testing@gmail.com");
        Bekle(1);
        WebElement addr=driver.findElement(By.cssSelector("[class='form-control'][id='currentAddress'] "));
        addr.sendKeys("Testing Current Address");
        Bekle(1);
        WebElement parrmn=driver.findElement(By.cssSelector("[id='permanentAddress-wrapper'] textarea"));
        parrmn.sendKeys("Testing Permanent Address");
        Bekle(1);
        WebElement btn=driver.findElement(By.cssSelector("[id='submit'][type='button']"));
        btn.click();
        Bekle(1);
        WebElement msg=driver.findElement(By.cssSelector("[id='name'][class='mb-1']"));
        if (msg.getText().contains("Automation"))
            System.out.println("test passed");
        else
            System.out.println("test failed");

        WebElement msg1=driver.findElement(By.cssSelector("[id='email'][class='mb-1']"));
        if (msg1.getText().contains("Testing"))
            System.out.println("test passed");
        else
            System.out.println("test failed");



        BekleKapat();



    }
}
