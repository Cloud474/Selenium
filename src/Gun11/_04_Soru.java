package Gun11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class _04_Soru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int random1 = (int) (Math.random() * 100);
                int random2 = (int) (Math.random() * 100);

                String tutulanstr1 = String.valueOf(random1);
                String tutulanstr2 = String.valueOf(random2);

                WebElement first = driver.findElement(By.id("number1Field"));
                first.sendKeys(tutulanstr1);

                WebElement second = driver.findElement(By.id("number2Field"));
                second.sendKeys(tutulanstr2);

                WebElement add = driver.findElement(By.id("selectOperationDropdown"));
                Select menu = new Select(add);
                menu.selectByIndex(i);

                WebElement calculate = driver.findElement(By.id("calculateButton"));
                calculate.click();

                wait.until(ExpectedConditions.textToBe(By.id("calculatingForm"), "Calculating ..."));
                WebElement cevap = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='numberAnswerField']")));

                if (i == 0) {
                    int toplam = random1 + random2;
                    String toplamstr = String.valueOf(toplam);
                    Assert.assertTrue(cevap.getAttribute("value").contains(toplamstr));
                    System.out.println(cevap.getAttribute("value"));
                    System.out.println(toplam);
                } else if (i == 1) {
                    int cikar = random1 - random2;
                    String cikarstr = String.valueOf(cikar);
                    Assert.assertTrue(cevap.getAttribute("value").contains(cikarstr));
                } else if (i == 2) {
                    int carp = random1 * random2;
                    String carpstr = String.valueOf(carp);
                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='numberAnswerField']")));
                    Assert.assertTrue(cevap.getAttribute("value").contains(carpstr));
                } else if (i == 3) {
                    int bol = random1 / random2;
                    String bolstr = String.valueOf(bol);
                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='numberAnswerField']")));
                    Assert.assertTrue(cevap.getAttribute("value").contains(bolstr));
                } else if (i == 4) {
                    String birles = tutulanstr1.concat(tutulanstr2);
                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='numberAnswerField']")));
                    Assert.assertTrue(cevap.getAttribute("value").contains(birles));
                }
                Bekle(1);
                first.clear();
                second.clear();
            }
        }

        BekleKapat();
    }
}
