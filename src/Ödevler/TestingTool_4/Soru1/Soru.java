package Ödevler.TestingTool_4.Soru1;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Soru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        Bekle(1);

        Actions aksiyonlar=new Actions(driver);

        List<WebElement>  ulkeler=driver.findElements(By.cssSelector("[id='questionDiv']>[class='destinationBox']"));
        List<WebElement> sehirler=driver.findElements(By.cssSelector("[id='answerDiv']>[class='dragDropSmallBox']"));


        for (WebElement seh:sehirler){
            for (WebElement ulk:ulkeler){

                Action aksiyon=aksiyonlar.clickAndHold(seh).moveToElement(ulk).release(ulk).build();
                aksiyon.perform();
                if (seh.getCssValue("background-color").equals("rgba(0, 128, 0, 1)")){
                    break;}
            }
        }
        BekleKapat();
    }
}
