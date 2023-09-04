package org.ait.qa25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public  class FindElementTests {

    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void findElementTest() {
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println(element.getText());
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());
        driver.findElement(By.id("city"));
        driver.findElement(By.className("input-label"));
        driver.findElement(By.name("viewport"));
        driver.findElement(By.linkText("Let the car work"));
        driver.findElement(By.partialLinkText("work"));
        driver.findElement(By.cssSelector(".input-label"));
        driver.findElement(By.cssSelector("[name='viewport']"));
        driver.findElement(By.cssSelector(" [class*='pristine']"));
        driver.findElement(By.cssSelector(" [class$='input']"));
    }

    @Test
    public void findElementByXpathTest() {
        driver.findElement(By.xpath("//h1"));
        driver.findElement(By.xpath("//input[@id='city']"));
        driver.findElement(By.xpath("//label[@class='input-label']"));
        driver.findElement(By.xpath("//h2[contains(.,  'Type your data and hit Yalla!')]"));
    }

    @Test
    public void findElementByCssSelector() {
        driver.findElement(By.cssSelector("#dates"));
        driver.findElement(By.cssSelector(".header"));
        driver.findElement(By.cssSelector(".search-card"));
        driver.findElement(By.cssSelector(".search-container"));
        driver.findElement(By.cssSelector(".subtitle"));
        driver.findElement(By.cssSelector(".special-offers-container"));
        driver.findElement(By.cssSelector(".red-line-triangle"));
        driver.findElement(By.cssSelector(".login-btn"));
        driver.findElement(By.cssSelector(".feedback-container"));
        driver.findElement(By.cssSelector("[href='https://www.facebook.com/']"));

    }

    @Test
    public void findElementByXpath() {
        driver.findElement(By.xpath("//input[@id='dates']"));
        driver.findElement(By.xpath("//div[@class='header']"));
        driver.findElement(By.xpath("//div[@class='search-card']"));
        driver.findElement(By.xpath("//div[@class='search-container']"));
        driver.findElement(By.xpath("//h2[@class='subtitle']"));
        driver.findElement(By.xpath("//a[@id='0']"));
        driver.findElement(By.xpath("//div[@class='special-offers-container']"));
        driver.findElement(By.xpath("//div[@class='red-line-triangle']"));
        driver.findElement(By.xpath("//a[@class='login-btn']"));
        driver.findElement(By.xpath("//div[@class='feedback-container']"));
        driver.findElement(By.xpath("//a[@href='https://www.facebook.com/']"));

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
