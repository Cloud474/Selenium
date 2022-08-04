package Ödevler.TestingTool_2.Soru3;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");
        Bekle(2);
        WebElement search= driver.findElement(By.cssSelector("[class='col-xs-14 search-box-wrapper']>input"));
        search.sendKeys("teddy bear");
        WebElement btn= driver.findElement(By.cssSelector("[class='searchformButton col-xs-4 rippleGrey']>span"));
        btn.click();
        WebElement msg= driver.findElement(By.cssSelector("[id='searchMessageContainer']>div"));
        if (msg.getText().contains("teddy"))
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed");

        BekleKapat();
    }
}
