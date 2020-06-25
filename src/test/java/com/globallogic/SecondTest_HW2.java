package com.globallogic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondTest_HW2 {

    WebDriver driver;
    boolean isElementFound;

    // browserstack.com example
    //========================================================
//    String USERNAME = "yaroslavlebid1";
//    String AUTOMATE_KEY = "mQAqMEZwXCcb9HpKoXWK";
//    String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
//
//    DesiredCapabilities caps = new DesiredCapabilities();
//
//    caps.setCapability("os", "Windows");
//    caps.setCapability("os_version", "8");
//    caps.setCapability("browser", "Edge");
//    caps.setCapability("browser_version", "81");
//    caps.setCapability("name", "yaroslavlebid1's First Test");
//
//    driver = new RemoteWebDriver(new URL(URL), caps);

    //========================================================





    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //WebDriverManager.firefoxdriver().setup();
        //driver = new FirefoxDriver();
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