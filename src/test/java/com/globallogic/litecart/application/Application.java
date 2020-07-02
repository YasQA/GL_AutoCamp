package com.globallogic.litecart.application;
import com.globallogic.litecart.listeners.Listener;
import com.globallogic.litecart.pages.AdminConsolePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class Application {

    public EventFiringWebDriver driver;

    public WebDriverWait wait;
    public String BaseUrl = "http://3.122.51.38/litecart";

    private AdminConsolePage adminPage;

    public Application() {
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();
        //WebDriverManager.edgedriver().setup();
        //driver = new ChromeDriver();

        driver = new EventFiringWebDriver(new ChromeDriver());
        try {
            driver.register(new Listener());
        } catch (IOException e) {
            e.printStackTrace();
        }
        wait = new WebDriverWait(driver, 5);

        adminPage = new AdminConsolePage(driver, BaseUrl);
    }

    public void quit() {
        driver.close();
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

    public boolean isTitleCorrect(String title) {
        return adminPage.isTitleCorrect(title);
    }

    //------------------------- Appearance -----------------------------------

    public void clickAppearanceMenuItem() {
        adminPage.clickAppearanceMenuItem();
    }

    public void clickTemplateMenuItem() {
        adminPage.clickTemplateMenuItem();
    }

    public void clickLogotypeMenuItem() {
        adminPage.clickLogotypeMenuItem();
    }

    //------------------------- Catalog --------------------------------------

    public void clickCatalogMenuItem() {
        adminPage.clickCatalogMenuItem();
    }
    public void clickCatalogSubMenuItem() {
        adminPage.clickCatalogSubMenuItem();
    }
    public void clickAttributeGroupsMenuItem() {
        adminPage.clickAttributeGroupsMenuItem();
    }
    public void clickManufacturersMenuItem() {
        adminPage.clickManufacturersMenuItem();
    }
    public void clickSuppliersMenuItem() {
        adminPage.clickSuppliersMenuItem();
    }
    public void clickDeliveryStatusesMenuItem() {
        adminPage.clickDeliveryStatusesMenuItem();
    }
    public void clickSoldOutStatusesMenuItem() {
        adminPage.clickSoldOutStatusesMenuItem();
    }
    public void clickQuantityUnitsMenuItem() {
        adminPage.clickQuantityUnitsMenuItem();
    }
    public void clickCSVMenuItem() {
        adminPage.clickCatalogCSVMenuItem();
    }

    //------------------------- Countries -----------------------------------

    public void clickCountriesMenuItem() {
        adminPage.clickCountriesMenuItem();
    }

    //------------------------- Currencies -----------------------------------

    public void clickCurrenciesMenuItem() {
        adminPage.clickCurrenciesMenuItem();
    }

    //------------------------- Customers ------------------------------------

    public void clickCustomersMenuItem() {
        adminPage.clickCustomersMenuItem();
    }
    public void clickCustomersSubMenuItem() {
        adminPage.clickCustomersSubMenuItem();
    }
    public void clickCustomersCsvMenuItem() {
        adminPage.clickCustomersCSVMenuItem();
    }
    public void clickNewsletterMenuItem() {
        adminPage.clickNewsletterMenuItem();
    }

    //-------------------------- Geo Zones -----------------------------------

    public void clickGeoZonesMenuItem() {
        adminPage.clickGeoZonesMenuItem();
    }

    //------------------------- Languages -----------------------------------

    public void clickLanguagesMenuItem() {
        adminPage.clickLanguagesMenuItem();
    }

    public void clickLanguagesSubMenuItem() {
        adminPage.clickLanguagesSubMenuItem();
    }

    public void clickStorageEncodingMenuItem() {
        adminPage.clickStorageEncodingMenuItem();
    }

    //------------------------- Modules -------------------------------------

    public void clickModulesMenuItem() {
        adminPage.clickModulesMenuItem();
    }

    public void clickCustomerModulesMenuItem() {
        adminPage.clickCustomerModulesMenuItem();
    }

    public void clickShippingModulesMenuItem() {
        adminPage.clickShippingModulesMenuItem();
    }

    public void clickPaymentModulesMenuItem() {
        adminPage.clickPaymentModulesMenuItem();
    }

    public void clickOrderModulesMenuItem() {
        adminPage.clickOrderModulesMenuItem();
    }

    public void clickOrderTotalModulesMenuItem() {
        adminPage.clickOrderTotalModulesMenuItem();
    }

    public void clickJobModulesMenuItem() {
        adminPage.clickJobModulesMenuItem();
    }

    //-------------------------- Orders -------------------------------------

    public void clickOrdersMenuItem() {
        adminPage.clickOrdersMenuItem();
    }

    public void clickOrdersSubMenuItem() {
        adminPage.clickOrdersSubMenuItem();
    }

    public void clickOrderStatusesMenuItem() {
        adminPage.clickOrderStatusesMenuItem();
    }

    //-------------------------- Pages --------------------------------------

    public void clickPagesMenuItem() {
        adminPage.clickPagesMenuItem();
    }

    public void clickPagesSubMenuItem() {
        adminPage.clickPagesSubMenuItem();
    }

    public void clickPagesCsvMenuItem() {
        adminPage.clickPagesCsvMenuItem();
    }

    //-------------------------- Reports ------------------------------------

    public void clickReportsMenuItem() {
        adminPage.clickReportsMenuItem();
    }

    public void clickMonthlySalesMenuItem() {
        adminPage.clickMonthlySalesMenuItem();
    }

    public void clickMostSoldProductsMenuItem() {
        adminPage.clickMostSoldProductsMenuItem();
    }

    public void clickMostShoppingCustomersMenuItem() {
        adminPage.clickMostShoppingCustomersMenuItem();
    }

    //-------------------------- Settings -----------------------------------

    public void clickSettingsMenuItem() {
        adminPage.clickSettingsMenuItem();
    }

    public void clickStoreInfoMenuItem() {
        adminPage.clickStoreInfoMenuItem();
    }

    public void clickDefaultsMenuItem() {
        adminPage.clickDefaultsMenuItem();
    }

    public void clickEmailMenuItem() {
        adminPage.clickEmailMenuItem();
    }

    public void clickListingsMenuItem() {
        adminPage.clickListingsMenuItem();
    }

    public void clickCustomerDetailsMenuItem() {
        adminPage.clickCustomerDetailsMenuItem();
    }

    public void clickLegalMenuItem() {
        adminPage.clickLegalMenuItem();
    }

    public void clickImagesMenuItem() {
        adminPage.clickImagesMenuItem();
    }

    public void clickCheckoutMenuItem() {
        adminPage.clickCheckoutMenuItem();
    }

    public void clickAdvancedMenuItem() {
        adminPage.clickAdvancedMenuItem();
    }

    public void clickSecurityMenuItem() {
        adminPage.clickSecurityMenuItem();
    }

    //-------------------------- Sliders ------------------------------------

    public void clickSlidesMenuItem() {
        adminPage.clickSlidesMenuItem();
    }

    //-------------------------- Tax ----------------------------------------

    public void clickTaxMenuItem() {
        adminPage.clickTaxMenuItem();
    }

    public void clickTaxRatesMenuItem() {
        adminPage.clickTaxRatesMenuItem();
    }

    public void clickTaxClassesMenuItem() {
        adminPage.clickTaxClassesMenuItem();
    }

    //-------------------------- Translations -------------------------------

    public void clickTranslationsMenuItem() {
        adminPage.clickTranslationsMenuItem();
    }

    public void clickSearchTranslationsMenuItem() {
        adminPage.clickSearchTranslationsMenuItem();
    }

    public void clickScanFilesMenuItem() {
        adminPage.clickScanFilesMenuItem();
    }

    public void clickTranslationsCsvMenuItem() {
        adminPage.clickTranslationsCsvMenuItem();
    }

    //-------------------------- Users --------------------------------------

    public void clickUsersMenuItem() {
        adminPage.clickUsersMenuItem();
    }

    //-------------------------- vQmods -------------------------------------

    public void clickVQmodsuItem() {
        adminPage.clickVQmodsuItem();
    }

    //=======================================================================


}