package com.globallogic.litecart.application;
import com.globallogic.litecart.pages.AdminConsolePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Application {

    public WebDriver driver;
    public WebDriverWait wait;
    public String BaseUrl = "http://3.122.51.38/litecart";

    private AdminConsolePage adminPage;

    public Application() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5);
        adminPage = new AdminConsolePage(driver, BaseUrl);
    }

    public void quit() {
        driver.quit();
    }

    public void openAdminConsolePanel() {
        adminPage.open();
    }
    public void loginAdminConsole() {
        adminPage.performLogin();
    }

    public void logoutAdminConsole() {
        adminPage.performLogout();
    }

    public void openAndLogin() {
        adminPage.open().performLogin();
    }

    public boolean isTitleCorrect(String title) {
        return adminPage.isTitleCorrect(title);
    }

    public void clickAppearanceMenuItem() {
        adminPage.clickAppearanceMenuItem();
    }

    public void clickAppearanceMenuItem2() {
        adminPage.open().performLogin().clickAppearanceMenuItem();
    }

    public void clickTemplateMenuItem() {
        adminPage.clickTemplateMenuItem();
    }
    public void clickTemplateMenuItem2() {
        adminPage.open().performLogin().clickTemplateMenuItem();
    }

}