package com.globallogic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;

import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTest_HW1 {

    WebDriver driver;
    boolean isElementFound;

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterEach
    void tearDown() {
        driver.close();
    }

    @Test
    void simpleTest1() {
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);
        List<WebElement> byTextXPath = driver.findElements(By.xpath("//*[contains(text(), 'Selenium')]"));

        Assertions.assertTrue(byTextXPath.size() > 0);
    }

    @Test
    void simpleTest2() {
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);
        try {
            isElementFound = driver.findElement(By.tagName("h3")).getText().contains("Selenium");
        }
        catch (NoSuchElementException e) {
            System.out.println("Element not found");
            isElementFound = false;
        }

        Assertions.assertTrue(isElementFound);
    }
}