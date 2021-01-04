package com.testNGOfis.test;

import com.testNGOfis.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Day04Test01 extends TestBase {

    //  1." https://demoqa.com/dynamic-properties” sayfasina gidin
    //  2.“Visible After 5 Seconds” butonunun gorunur oldugunu test edin

    @Test
    public void explicitlyWaitTest(){
        driver.get("https://demoqa.com/dynamic-properties");

        WebElement besSnSonraGorunen = driver.findElement(By.id("visibleAfter"));

        WebDriverWait wait = new WebDriverWait(driver, 7);

       // WebElement bekleGorEleman = wait.until(ExpectedConditions.visibilityOf(besSnSonraGorunen));
       // Assert.assertTrue(besSnSonraGorunen.isDisplayed());

        // Yukaridakinin aynisi ama WebElwmwnti onceden bulmazsak bu kullanilir.
        WebElement bekleGorEleman = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
        Assert.assertTrue(bekleGorEleman.isDisplayed());


    }
}
