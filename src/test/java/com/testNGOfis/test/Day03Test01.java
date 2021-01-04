package com.testNGOfis.test;

import com.testNGOfis.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day03Test01 extends TestBase {

    // 1.“http://webdriveruniversity.com/IFrame/index.html” sayfasina gidin
    // 2.“Our Products” butonuna basin
    // 3.“Cameras product” I tiklayin
    // 4.Popup mesajini yazdirin
    // 5.“close” butonuna basin
    // 6."WebdriverUniversity.com (IFrame)" linkini tiklayin
    // 7."http://webdriveruniversity.com/index.html" adresine gittigini test edin


    @Test
    public void iFrame() {
        // 1.“http://webdriveruniversity.com/IFrame/index.html” sayfasina gidin
        driver.get("http://webdriveruniversity.com/IFrame/index.html");

        // 2.“Our Products” butonuna basin
        WebElement iFrame = driver.findElement(By.id("frame"));
        driver.switchTo().frame(iFrame);

        driver.findElement(By.linkText("Our Products")).click();

        // 3.“Cameras product” I tiklayin
        driver.findElement(By.id("camera-img")).click();

        // 4.Popup mesajini yazdirin
        WebElement popUpYazisi = driver.findElement(By.xpath("//div[@class='modal-body']/p"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(popUpYazisi.getText());

        // 5.“close” butonuna basin
        driver.findElement(By.xpath("//*[@class='btn btn-default']")).click();

        // class='modal-body
        driver.switchTo().defaultContent();
        driver.findElement(By.id("nav-title")).click();

        // 7."http://webdriveruniversity.com/index.html" adresine gittigini test edin
        String aktuelSayfa = driver.getCurrentUrl();
        String bekleneneSayfa = "http://webdriveruniversity.com/index.html";

        Assert.assertEquals(aktuelSayfa, bekleneneSayfa);


    }

    }

