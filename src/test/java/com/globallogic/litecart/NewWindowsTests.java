package com.globallogic.litecart;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.globallogic.litecart.helpers.NewWindows;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NewWindowsTests extends TestBase {
    String parentHandle = app.driver.getWindowHandle();

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
        app.clickCountriesMenuItem();
        app.openCountryForEditByPositionInList(0);

        for (int i = 0; i < app.getExternalLinksOnEditCountriesPage().size(); i++) {
            app.openExternalLinkByLinkNumber(i);
            assertTrue(app.driver.getWindowHandles().size() > 1); // New Handlers(Windows) appears

            NewWindows.switchToNewWindow(app.driver);
            NewWindows.closeWindowAndSwitchBackToMain(app.driver, parentHandle);

            assertTrue(app.driver.getWindowHandles().size() == 1); //only one Handler left
            assertTrue(app.driver.getWindowHandle().equals(parentHandle)); //current Handler is initial Handler
        }
    }
}
