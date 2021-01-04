package com.testNGOfis.test;

import com.testNGOfis.pages.ZeroWebPage;
import com.testNGOfis.utilities.ConfigurationReader;
import com.testNGOfis.utilities.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Day04Test02 extends TestBase {

  //  1. configuration file olusturup, oradan data kullanarak http://zero.webappsecurity.com/  sayfasina gidin
  //  2. Pages package altinda bir zerowebPage classi olusturun
  //  3. zerowebPage class'inda login olmak icin gerekli locate'leri ve methodu yazin
  //  4. Icinde bulundugumuz class'tan pages sayfasindaki methodu cagirarak login olun


    @Test
    public void loginTest(){

        //  1. configuration file olusturup, oradan data kullanarak http://zero.webappsecurity.com/  sayfasina gidin
        driver.get(ConfigurationReader.getProperty("zerowebUrl"));

        //  2. Pages package altinda bir zerowebPage classi olusturun
        ZeroWebPage zeroWebPage = new ZeroWebPage(driver);

        zeroWebPage.zeroWebLogin();




    }
}
