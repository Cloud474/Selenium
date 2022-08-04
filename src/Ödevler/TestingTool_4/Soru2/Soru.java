package Ödevler.TestingTool_4.Soru2;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Soru extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        Actions aksiyonlar=new Actions(driver);

        List<WebElement> group=driver.findElements(By.cssSelector("#dhtmlgoodies_mainContainer>div"));
        List<WebElement> student=driver.findElements(By.cssSelector("#allItems>li"));

        int ogr=0;

        for (int i = 0; i < student.size(); i++) {
            for (int j = ogr; j <group.size() ; j++) {
                Action aksiyon=aksiyonlar.clickAndHold(student.get(i)).moveToElement(group.get(j)).release(group.get(j)).build();
                aksiyon.perform();
                if (group.get(j).getText().contains(student.get(i).getText())){
                    break;}
                else {
                    ogr++;
                }
            }
        }

        BekleKapat();
    }
}
