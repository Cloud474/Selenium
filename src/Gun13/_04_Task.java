package Gun13;

import Utils.BaseStaticDriver;
import org.junit.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;

public class _04_Task extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {
        driver.get("https://google.com");
        String anaSayfaWinddowId= driver.getWindowHandle();
        Robot robot=new Robot();
        for (int i = 0; i <2 ; i++) {

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_T);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_T);
        }
        Bekle(1);
        Set<String> windowsIdler=driver.getWindowHandles();
        for(String id: windowsIdler){
            if (id.equals(anaSayfaWinddowId))
                continue;
            driver.switchTo().window(id);
            driver.get("https://www.facebook.com/");
            Bekle(1);
            driver.switchTo().window(id);
            driver.get("https://twitter.com/");
        }
        Bekle(2);

        BekleKapat();
    }
}
