package Ödevler.TestingTool_1.Soru_4;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru4 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement btn=driver.findElement(By.id("calculate"));
        btn.click();
        WebElement inpt=driver.findElement(By.id("number1"));
        inpt.sendKeys("2021");
        WebElement inpt2=driver.findElement(By.id("number2"));
        inpt2.sendKeys("1200");
        WebElement btn2=driver.findElement(By.id("calculate"));
        btn2.click();
        WebElement answr=driver.findElement(By.id("answer"));

        System.out.println("answer= " +answr.getText());

        BekleKapat();
    }
}
