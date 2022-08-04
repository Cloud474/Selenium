package Ödevler.TestingTool_2.Soru4;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru4 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        Bekle(2);
        WebElement btn= driver.findElement(By.cssSelector("[id='calculate']"));
        btn.click();
        WebElement nmr1= driver.findElement(By.cssSelector("[type='text'][id='number1']"));
        nmr1.sendKeys("1208");
        WebElement nmbr2= driver.findElement(By.cssSelector("[type='text']~input"));
        nmbr2.sendKeys("2034");
        WebElement clic= driver.findElement(By.cssSelector("[type='text']~input+input"));
        clic.click();
        WebElement answer= driver.findElement(By.cssSelector("[action='calculate.php']+span"));
        System.out.println("answer= " + answer.getText());

        BekleKapat();
    }
}
