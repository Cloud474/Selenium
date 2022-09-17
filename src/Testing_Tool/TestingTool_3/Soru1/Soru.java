package Testing_Tool.TestingTool_3.Soru1;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Soru extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demoqa.com/text-box");

        Bekle(1);
        WebElement auto=driver.findElement(By.xpath("//*[@id='userName']"));
        auto.sendKeys("Automation");
        Bekle(1);
        WebElement mail=driver.findElement(By.xpath("//input[@id='userEmail']"));
        mail.sendKeys("Testing@gmail.com");
        Bekle(1);
        WebElement addr=driver.findElement(By.xpath("//textarea[starts-with(@id,'currentAddress')]"));
        addr.sendKeys("Testing Current Address");
        Bekle(1);
        WebElement parrmn=driver.findElement(By.xpath("//*[@id='permanentAddress' and @class='form-control']"));
        parrmn.sendKeys("Testing Permanent Address");
        Bekle(1);
        WebElement btn=driver.findElement(By.xpath("//*[text()='Submit']"));
        btn.click();
        Bekle(1);
        WebElement name=driver.findElement(By.xpath("//*[text()='Automation']"));
        WebElement mailT=driver.findElement(By.xpath("//*[text()='Email:']"));

        Assert.assertTrue(driver.getCurrentUrl().contains("demoqa"));
        Assert.assertTrue(name.getText().contains("Automation"));
        Assert.assertTrue(mailT.getText().contains("Testing"));

        BekleKapat();
    }
}
