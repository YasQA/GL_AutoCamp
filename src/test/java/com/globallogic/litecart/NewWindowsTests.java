package com.globallogic.litecart;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.globallogic.litecart.helpers.NewWindows;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class NewWindowsTests extends TestBase {
    String originalWindow;
    String newWindow;
    Set<String> existWindows;

    @BeforeAll
    static void setUp() {
        app.openAdminConsolePanel();
        app.loginAdminConsole();
    }

    @AfterAll
    static void tearDown() {
        app.logoutAdminConsole();
    }

    @Test
    void newWindowTest1_OpenCloseNewTabs() {
        originalWindow = NewWindows.getCurrentWindow(app.driver);
        existWindows = NewWindows.getOpenedWindows(app.driver);

        app.clickCountriesMenuItem();
        app.openCountryForEditByPositionInList(0);

        for (int i = 0; i < app.getExternalLinksOnEditCountriesPage().size(); i++) {
            app.openExternalLinkByLinkNumber(i);
            newWindow = app.wait.until(NewWindows.anyWindowOtherThan(app.driver, existWindows));

            assertNotEquals(null, newWindow); // New Window appears

            NewWindows.switchToNewWindow(app.driver, newWindow);
            NewWindows.closeWindowAndSwitchBackToMain(app.driver, originalWindow);

            assertEquals(1, app.driver.getWindowHandles().size()); //only one Handler left
            assertTrue(app.driver.getWindowHandle().equals(originalWindow)); //current Handler is initial Handler
        }
    }
}
