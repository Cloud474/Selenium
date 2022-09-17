package Testing_Tool.TestingTool_4.Soru3;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Soru extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");

        Actions aksiyonlar=new Actions(driver);

        List<WebElement> ulkeler=driver.findElements(By.cssSelector("[id^='box']"));
        List<WebElement> sehirler=driver.findElements(By.cssSelector("[id^='node']"));


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
