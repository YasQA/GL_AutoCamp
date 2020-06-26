package com.globallogic.litecart;

import com.globallogic.litecart.pages.AdminConsolePage;
import com.globallogic.litecart.pages.Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AdminMenuTests extends TestBase {

    @BeforeAll
    static void setUp() {
        app.openAndLogin();
    }

    @AfterAll
    static void tearDown() {
        app.logoutAdminConsole();
    }

    @Test
    void menuTest1() {
        //app.openAndLogin();
        app.clickAppearanceMenuItem();
        //app.clickAppearanceMenuItem2();

        assertTrue(app.isTitleCorrect("Template"));

    }
}
