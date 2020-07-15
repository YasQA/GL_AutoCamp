package com.globallogic.litecart.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.Set;

public class NewWindows {

    public static void switchToNewWindow(WebDriver driver, String newWindow){
        driver.switchTo().window(newWindow);
    }

    public static void closeWindowAndSwitchBackToMain(WebDriver driver, String originalWindow) {
        driver.close();
        driver.switchTo().window(originalWindow);
    }

    public static String getCurrentWindow(WebDriver driver) {
        String originalW = driver.getWindowHandle();
        return originalW;
    }

    public static Set<String> getOpenedWindows(WebDriver driver) {
        Set<String> existWindows = driver.getWindowHandles();
        return existWindows;
    }

    public static ExpectedCondition<String> anyWindowOtherThan(WebDriver driver, Set<String> windows) {
        return input -> {
            Set<String> handles = driver.getWindowHandles();
            handles.removeAll(windows);
            return handles.size() > 0 ? handles.iterator().next() : null;
        };
    }
}
