package com.testNGOfis.test;

import com.testNGOfis.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Day03Test02 extends TestBase {

    // 1.”https://www.mediawiki.org/wiki/Download” sayfasina gidin
    // 2.”MediaWiki 1.34.2” dosyasini indirin
    // 3.Dosyanin indirildigini test edin

    @Test
    public void dosyaIndirme(){

    // 1.”https://www.mediawiki.org/wiki/Download” sayfasina gidin
    driver.get("https://www.mediawiki.org/wiki/Download");

    // 2.”MediaWiki 1.34.2” dosyasini indirin
    driver.findElement(By.linkText("Download MediaWiki 1.35.0")).click();

    // 3.Dosyanin indirildigini test edin
        boolean varMi = Files.exists(Paths.get("/Users/cc/Downloads"));
        Assert.assertTrue(varMi);

    }
}



