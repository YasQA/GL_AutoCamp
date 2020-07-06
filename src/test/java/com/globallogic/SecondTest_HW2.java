package com.globallogic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondTest_HW2 {

    static WebDriver driverChrome;
    static WebDriver driverFF;
    static WebDriver driverEdge;
    static WebDriver driverBrowserStack;
    static WebDriver driverSeleniumServer;
    boolean isElementFound;

    //BS Cridentials
    String USERNAME = "yaroslavlebid1";
    String AUTOMATE_KEY = "mQAqMEZwXCcb9HpKoXWK";
    String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    @BeforeAll
    static void setUp() {
    }

    @AfterAll
    static void tearDown() {
    }

    @Test
    void test1_Local_Chrome() {
        WebDriverManager.chromedriver().setup();
        driverChrome = new ChromeDriver();

        driverChrome.get("http://google.com");
        driverChrome.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);
        List<WebElement> byTextXPath = driverChrome.findElements(By.xpath("//*[contains(text(), 'Selenium')]"));

        Assertions.assertTrue(byTextXPath.size() > 0);

        driverChrome.close();
    }

    @Test
    void test2_Local_FF() {
        WebDriverManager.firefoxdriver().setup();
        driverFF = new FirefoxDriver();

        driverFF.get("http://google.com");
        driverFF.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driverFF.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);
        try {
            isElementFound = driverFF.findElement(By.tagName("h3")).getText().contains("Selenium");
        }
        catch (NoSuchElementException e) {
            System.out.println("Element not found");
            isElementFound = false;
        }

        Assertions.assertTrue(isElementFound);

        driverFF.close();
    }

    @Test
    void test3_Local_Edge() {
        WebDriverManager.edgedriver().setup();
        driverEdge = new EdgeDriver();

        driverEdge.get("http://google.com");
        driverEdge.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);
        try {
            isElementFound = driverEdge.findElement(By.tagName("h3")).getText().contains("Selenium");
        } catch (NoSuchElementException e) {
            System.out.println("Element not found");
            isElementFound = false;
        }

        Assertions.assertTrue(isElementFound);

        driverEdge.close();
    }

    @Test
    void test4_BrowserStack_Win8_Edge() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "8");
        caps.setCapability("browser", "Edge");
        caps.setCapability("browser_version", "81");
        caps.setCapability("name", "BrowserStack_Win8_Edget");

        driverBrowserStack = new RemoteWebDriver(new URL(URL), caps);

        driverBrowserStack.get("http://google.com");
        driverBrowserStack.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);
        List<WebElement> byTextXPath = driverBrowserStack.findElements(By.xpath("//*[contains(text(), 'Selenium')]"));

        Assertions.assertTrue(byTextXPath.size() > 0);

        driverBrowserStack.close();
    }

    @Test
    void test5_BrowserStack_Win7_IE11() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("browser", "IE");
        caps.setCapability("browser_version", "11.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "7");
        caps.setCapability("resolution", "1024x768");
        caps.setCapability("name", "BrowserStack_Win7_IE11");

        driverBrowserStack = new RemoteWebDriver(new URL(URL), caps);

        driverBrowserStack.get("http://google.com");
        driverBrowserStack.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);
        List<WebElement> byTextXPath = driverBrowserStack.findElements(By.xpath("//*[contains(text(), 'Selenium')]"));

        Assertions.assertTrue(byTextXPath.size() > 0);

        driverBrowserStack.close();
    }

    @Test
    //For this test Selenium Server(Grid) should be UP on port 4444
    void test6_SeleniumServerGrid_IE11() throws MalformedURLException {

        driverSeleniumServer = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());

        driverSeleniumServer.get("http://google.com");
        driverSeleniumServer.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);
        List<WebElement> byTextXPath = driverSeleniumServer.findElements(By.xpath("//*[contains(text(), 'Selenium')]"));

        Assertions.assertTrue(byTextXPath.size() > 0);

        driverSeleniumServer.close();
    }

}