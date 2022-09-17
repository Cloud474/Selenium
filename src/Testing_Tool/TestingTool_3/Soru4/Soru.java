package Testing_Tool.TestingTool_3.Soru4;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Soru extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        Bekle(1);

        WebElement btn= driver.findElement(By.xpath("//*[@id='calculate']"));
        btn.click();

        WebElement nmbr1= driver.findElement(By.xpath("//input[starts-with(@id,'number1')]"));
        nmbr1.sendKeys("2022");
        Bekle(1);

        WebElement nmbr2= driver.findElement(By.xpath("//*[@id='number2' and @name='number2']"));
        nmbr2.sendKeys("1993");
        Bekle(1);

        WebElement calculate= driver.findElement(By.xpath("//*[contains(@id,'calculate')]"));
        calculate.click();
        Bekle(1);

        WebElement answer= driver.findElement(By.xpath("//*[@id='answer']"));
        System.out.println("Answer= " + answer.getText());

        Assert.assertTrue(driver.getCurrentUrl().contains("herokuapp"));
        Assert.assertTrue(answer.getText().contains("4015"));

        BekleKapat();


    }
}
