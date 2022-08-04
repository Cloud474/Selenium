package Gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_GetAttirubuteGetCssValue extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

        WebElement input=driver.findElement(By.id("inputValEnter"));
        System.out.println(input.getAttribute("name"));
        System.out.println(input.getAttribute("type"));
        System.out.println(input.getAttribute("class"));
        System.out.println(input.getCssValue("color"));
        System.out.println(input.getCssValue("background"));
        System.out.println(input.getCssValue("font-size"));
        System.out.println(input.getCssValue("height"));


        BekleKapat();
    }
}
