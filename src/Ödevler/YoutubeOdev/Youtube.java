package Ödevler.YoutubeOdev;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Youtube extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.youtube.com/");

        WebElement search= driver.findElement(By.name("search_query"));
        search.sendKeys("Selenium");

        WebElement btn= driver.findElement(By.cssSelector("[id='search-icon-legacy'] [class='style-scope ytd-searchbox']"));
        btn.click();

        WebElement son= driver.findElement(By.xpath("//*[text()='Türkçe Selenium Pencere Kullanımı (Window Handling) - Selenium Ders - 10']"));
        JavascriptExecutor js= (JavascriptExecutor) driver;

        

        BekleKapat();
    }
}
