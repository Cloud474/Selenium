package Gun06.Soru1;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.List;

public class Soru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com/");
        Bekle(1);
        WebElement user= driver.findElement(By.xpath("//*[@id='user-name']"));
        user.sendKeys("standard_user");
        Bekle(1);
        WebElement pass= driver.findElement(By.xpath("//input[@id='password']"));
        pass.sendKeys("secret_sauce");
        Bekle(1);
        WebElement btn= driver.findElement(By.xpath("//*[contains(@id,'login-button')]"));
        btn.click();
        Bekle(1);
        WebElement back= driver.findElement(By.xpath("//*[@class='inventory_item_name']"));
        back.click();
        Bekle(1);
        WebElement remove= driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']"));
        remove.click();
        Bekle(1);
        WebElement bck= driver.findElement(By.xpath("//button[starts-with(@id,'back-to')]"));
        bck.click();
        Bekle(1);

        WebElement shirt= driver.findElement(By.xpath("//*[text()='Sauce Labs Bolt T-Shirt']"));
        shirt.click();
        Bekle(1);
        WebElement add= driver.findElement(By.xpath("//*[text()='Add to cart']"));
        add.click();
        WebElement remv=driver.findElement(By.xpath("//*[@id='back-to-products']"));
        remv.click();
        Bekle(1);

        WebElement spt=driver.findElement(By.xpath("//*[@class='shopping_cart_link']"));
        spt.click();

        WebElement ctn=driver.findElement(By.xpath("//*[@id='checkout']"));
        ctn.click();


        WebElement name= driver.findElement(By.xpath("//*[@class='input_error form_input']"));
        name.sendKeys("Huseyin");
        Bekle(1);
        WebElement surname= driver.findElement(By.xpath("//*[@id='last-name']"));
        surname.sendKeys("BULUT");
        Bekle(1);
        WebElement zip= driver.findElement(By.xpath("//*[@id='postal-code']"));
        zip.sendKeys("34000");
        Bekle(1);
        WebElement contin= driver.findElement(By.xpath("//*[@id='continue']"));
        contin.click();
        Bekle(1);
           //(//*[@class='inventory_item_price'])[1]
         List<WebElement> ucretler=driver.findElements(By.xpath("//*[@class='inventory_item_price']"));

         double toplam=0;
         for(WebElement e: ucretler) {
             System.out.println("e.getText() = " + e.getText());
             toplam += Double.parseDouble(e.getText().substring(1));
         }
         System.out.println("toplam = " + toplam);

         // double çevirme işlemleri ayrı bir metod yardımıyla regex ile yapılacak
         WebElement webAltToplam=driver.findElement(By.xpath("//*[@class='summary_subtotal_label']"));
         System.out.println(webAltToplam.getText());
         double altToplam = Double.parseDouble(webAltToplam.getText().substring(13));
         System.out.println("altToplam = " + altToplam);

         if (toplam == altToplam)
             System.out.println("test passed");
         else
             System.out.println("test failed");

        BekleKapat();


    }
}
