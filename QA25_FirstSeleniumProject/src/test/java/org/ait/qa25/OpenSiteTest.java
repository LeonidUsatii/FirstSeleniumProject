package org.ait.qa25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenSiteTest {

    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
    @Test
    public void openGoogleTest() {
        System.out.println("Site opened!!!");
    }

    public void tearDown() {
        driver.quit();
    }
}