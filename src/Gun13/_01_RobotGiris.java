package Gun13;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _01_RobotGiris extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {
        driver.get("https://demo.guru99.com/test/upload/");

        //toDO: frame in varlığı kontrol edilip var ise veya yok ise her iki duruma göre çözüm yapılacak
        driver.switchTo().frame(8);  //"gdpr-consent-notice"
        WebElement acceptAll = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Accept All']")));
        //WebElement acceptAll = driver.findElement(By.xpath("//span[text()='Accept All']"));
        acceptAll.click();
        driver.switchTo().defaultContent();

        Robot robot=new Robot();

        for (int i = 0; i < 13; i++) {
            robot.keyPress(KeyEvent.VK_TAB);  // tuşa bastık
            robot.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        // Stringi hafızaya-clipboard a kopyalama kodu
        StringSelection stringSelection = new StringSelection("C:\\Users\\pRofesör\\Desktop\\dersnotu.txtddw");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection , null);
        // Verilen stringi clipboard a set ediyor.

        Bekle(1);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        Bekle(1);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_TAB);  // tuşa bastık
            robot.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        WebElement btn= driver.findElement(By.id("submitbutton"));
        btn.click();

        WebElement aasert= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("res")));
        Assert.assertTrue(aasert.getText().contains("has been successfully uploaded."));

        BekleKapat();
    }
}
