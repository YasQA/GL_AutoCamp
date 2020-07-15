package com.globallogic.litecart;
import com.globallogic.litecart.listeners.Listener;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdminMenuAndTitlesTests extends TestBase {

    @BeforeAll
    static void setUp() {
        app.openAdminConsolePanel();
        app.loginAdminConsole();
    }

    @AfterAll
    static void tearDown() {
        app.logoutAdminConsole();
    }

    //--------------------------- Appearance ------------------------------

    @Test
    void  menuTest_MenuItemsAndHeaders() {
        assertTrue(app.isAllTitlesExists());
    }
}