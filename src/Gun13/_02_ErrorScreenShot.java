package Gun13;

import Utils.BaseStaticDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class _02_ErrorScreenShot extends BaseStaticDriver {
    public static void main(String[] args) throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement name= driver.findElement(By.id("txtUsername"));
        name.sendKeys("Admin");

        WebElement password= driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin12");

        WebElement btn= driver.findElement(By.id("btnLogin"));
        btn.click();

        List<WebElement> spanMessage=driver.findElements(By.id("spanMessage"));
        if (spanMessage.size()>0){   //login olamadın hata ekran görüntüsünü saklayalım
            //Hata ekranının ScreenShot'ını alalım
            System.out.println("Login olamadın. Hata mesajı gözüktü");

            //Ekran kaydını alalım
            LocalDateTime saat=LocalDateTime.now();
            DateTimeFormatter ft = DateTimeFormatter.ofPattern("dd.MM.yyyy HH.mm.ss");

            TakesScreenshot tk=(TakesScreenshot) driver; // 1.Aşama Ekran görüntüsü alma değişkenini tanımladım.
            File hafizadakiHali=tk.getScreenshotAs(OutputType.FILE); //2.Aşama saklama tipi seçildi (Dosya), data(veriTabanı) (Byte)
            // hafizadakiHali -> dosya olarak (jpg,png,bmp) kaydedeceğiz

            FileUtils.copyFile(hafizadakiHali, new File("ekranGörüntüleri/"+saat.format(ft)+".png"));
        }

        BekleKapat();
    }
}
