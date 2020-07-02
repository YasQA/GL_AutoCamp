package com.globallogic.litecart.helpers;

import org.openqa.selenium.WebDriver;

public class NewWindows {

    public static void switchToNewWindow(WebDriver driver){

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }

    public static void closeWindowAndSwitchBackToMain(WebDriver driver, String parentHandle) {
        driver.close();
        driver.switchTo().window(parentHandle);
    }
}
