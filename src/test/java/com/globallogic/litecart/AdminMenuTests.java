package com.globallogic.litecart;
import com.globallogic.litecart.listeners.Listener;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdminMenuTests extends TestBase {

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
    void menuTest1_AppearanceMI() {
        app.clickAppearanceMenuItem();
        assertTrue(app.isTitleCorrect("Template"));
    }

    @Test
    void menuTest2_TemplateMI() {
        app.clickTemplateMenuItem();
        assertTrue(app.isTitleCorrect("Template"));
    }

    @Test
    void menuTest3_LogotypeMI() {
        app.clickLogotypeMenuItem();
        assertTrue(app.isTitleCorrect("Logotype"));
    }

    //--------------------------- Catalog ---------------------------------

    @Test
    void menuTest4_CatalogMI() {
        app.clickCatalogMenuItem();
        assertTrue(app.isTitleCorrect("Catalog"));
    }

    @Test
    void menuTest5_CatalogSubMI() {
        app.clickCatalogSubMenuItem();
        assertTrue(app.isTitleCorrect("Catalog"));
    }

    @Test
    void menuTest6_AttributeGroupsMI() {
        app.clickAttributeGroupsMenuItem();
        assertTrue(app.isTitleCorrect("Attribute Groups"));
    }

    @Test
    void menuTest7_ManufacturersMI() {
        app.clickManufacturersMenuItem();
        assertTrue(app.isTitleCorrect("Manufacturers"));
    }

    @Test
    void menuTest8_SuppliersMI() {
        app.clickSuppliersMenuItem();
        assertTrue(app.isTitleCorrect("Suppliers"));
    }

    @Test
    void menuTest9_DeliveryStatusesMI() {
        app.clickDeliveryStatusesMenuItem();
        assertTrue(app.isTitleCorrect("Delivery Statuses"));
    }

    @Test
    void menuTest10_SoldOutStatusesMI() {
        app.clickSoldOutStatusesMenuItem();
        assertTrue(app.isTitleCorrect("Sold Out Statuses"));
    }

    @Test
    void menuTest11_QuantityUnitsMI() {
        app.clickQuantityUnitsMenuItem();
        assertTrue(app.isTitleCorrect("Quantity Units"));
    }

    @Test
    void menuTest12_CSVMI() {
        app.clickCSVMenuItem();
        assertTrue(app.isTitleCorrect("CSV Import/Export"));
    }

    //------------------------- Countries -----------------------------------

    @Test
    void menuTest13_CountriesMI() {
        app.clickCountriesMenuItem();
        assertTrue(app.isTitleCorrect("Countries"));
    }

    //------------------------- Currencies ----------------------------------

    @Test
    void menuTest14_CurrenciesMI() {
        app.clickCurrenciesMenuItem();
        assertTrue(app.isTitleCorrect("Currencies"));
    }

    //-------------------------- Customers ----------------------------------

    @Test
    void menuTest15_CustomersMI() {
        app.clickCustomersMenuItem();
        assertTrue(app.isTitleCorrect("Customers"));
    }

    @Test
    void menuTest16_CustomersSubMI() {
        app.clickCustomersSubMenuItem();
        assertTrue(app.isTitleCorrect("Customers"));
    }

    @Test
    void menuTest17_CustomersCsvMI() {
        app.clickCustomersCsvMenuItem();
        assertTrue(app.isTitleCorrect("CSV Import/Export"));
    }

    @Test
    void menuTest18_NewsletterMI() {
        app.clickNewsletterMenuItem();
        assertTrue(app.isTitleCorrect("Newsletter"));
    }

    //-------------------------- Geo Zones -------------------------------

    @Test
    void menuTest19_GeoZonesMI() {
        app.clickGeoZonesMenuItem();
        assertTrue(app.isTitleCorrect("Geo Zones"));
    }

    //------------------------- Languages -----------------------------------
    @Test
    void menuTest20_LanguagesMI() {
        app.clickLanguagesMenuItem();
        assertTrue(app.isTitleCorrect("Languages"));
    }

    @Test
    void menuTest21_LanguagesSubMI() {
        app.clickLanguagesSubMenuItem();
        assertTrue(app.isTitleCorrect("Languages"));
    }

    @Test
    void menuTest22_StorageEncodingMI() {
        app.clickStorageEncodingMenuItem();
        assertTrue(app.isTitleCorrect("Storage Encoding"));
    }

    //------------------------- Modules -------------------------------------

    @Test
    void menuTest23_ModulesMI() {
        app.clickModulesMenuItem();
        assertTrue(app.isTitleCorrect("Customer Modules"));
    }

    @Test
    void menuTest24_CustomerModulesMI() {
        app.clickCustomerModulesMenuItem();
        assertTrue(app.isTitleCorrect("Customer Modules"));
    }

    @Test
    void menuTest25_ShippingModulesMI() {
        app.clickShippingModulesMenuItem();
        assertTrue(app.isTitleCorrect("Shipping Modules"));
    }

    @Test
    void menuTest26_PaymentModulesMI() {
        app.clickPaymentModulesMenuItem();
        assertTrue(app.isTitleCorrect("Payment Modules"));
    }

    @Test
    void menuTest27_OrderModulesMI() {
        app.clickOrderModulesMenuItem();
        assertTrue(app.isTitleCorrect("Order Modules"));
    }

    @Test
    void menuTest28_OrderTotalModulesMI() {
        app.clickOrderTotalModulesMenuItem();
        assertTrue(app.isTitleCorrect("Order Total Modules"));
    }

    @Test
    void menuTest29_JobModulesMI() {
        app.clickJobModulesMenuItem();
        assertTrue(app.isTitleCorrect("Job Modules"));
    }

    //-------------------------- Orders -------------------------------------

    @Test
    void menuTest30_OrdersMI() {
        app.clickOrdersMenuItem();
        assertTrue(app.isTitleCorrect("Orders"));
    }

    @Test
    void menuTest31_OrderTotalModulesMI() {
        app.clickOrdersSubMenuItem();;
        assertTrue(app.isTitleCorrect("Orders"));
    }

    @Test
    void menuTest32_OrderStatusesMI() {
        app.clickOrderStatusesMenuItem();;
        assertTrue(app.isTitleCorrect("Order Statuses"));
    }

    //-------------------------- Pages --------------------------------------

    @Test
    void menuTest33_PagesMI() {
        app.clickPagesMenuItem();
        assertTrue(app.isTitleCorrect("Pages"));
    }

    @Test
    void menuTest34_PagesSubMI() {
        app.clickPagesSubMenuItem();
        assertTrue(app.isTitleCorrect("Pages"));
    }

    @Test
    void menuTest35_PagesCsvMI() {
        app.clickPagesCsvMenuItem();
        assertTrue(app.isTitleCorrect("CSV Import/Export"));
    }

    //-------------------------- Reports ------------------------------------

    @Test
    void menuTest36_ReportsMI() {
        app.clickReportsMenuItem();
        assertTrue(app.isTitleCorrect("Monthly Sales"));
    }

    @Test
    void menuTest37_MonthlySalesMI() {
        app.clickMonthlySalesMenuItem();
        assertTrue(app.isTitleCorrect("Monthly Sales"));
    }

    @Test
    void menuTest38_MostSoldProductsMI() {
        app.clickMostSoldProductsMenuItem();
        assertTrue(app.isTitleCorrect("Most Sold Products"));
    }

    @Test
    void menuTest39_MostShoppingCustomersMI() {
        app.clickMostShoppingCustomersMenuItem();
        assertTrue(app.isTitleCorrect("Most Shopping Customers"));
    }

    //-------------------------- Settings -----------------------------------

    @Test
    void menuTest40_SettingsMI() {
        app.clickSettingsMenuItem();
        assertTrue(app.isTitleCorrect("Settings"));
    }

    @Test
    void menuTest41_StoreInfoMI() {
        app.clickStoreInfoMenuItem();
        assertTrue(app.isTitleCorrect("Settings"));
    }

    @Test
    void menuTest42_DefaultsMI() {
        app.clickDefaultsMenuItem();
        assertTrue(app.isTitleCorrect("Settings"));
    }

    @Test
    void menuTest43_EmailMI() {
        app.clickEmailMenuItem();
        assertTrue(app.isTitleCorrect("Settings"));
    }

    @Test
    void menuTest44_ListingsMI() {
        app.clickListingsMenuItem();
        assertTrue(app.isTitleCorrect("Settings"));
    }

    @Test
    void menuTest45_CustomerDetailsMI() {
        app.clickCustomerDetailsMenuItem();
        assertTrue(app.isTitleCorrect("Settings"));
    }

    @Test
    void menuTest46_LegalMI() {
        app.clickLegalMenuItem();
        assertTrue(app.isTitleCorrect("Settings"));
    }

    @Test
    void menuTest47_ImagesMI() {
        app.clickImagesMenuItem();
        assertTrue(app.isTitleCorrect("Settings"));
    }

    @Test
    void menuTest48_CheckoutMI() {
        app.clickCheckoutMenuItem();
        assertTrue(app.isTitleCorrect("Settings"));
    }

    @Test
    void menuTest49_AdvancedMI() {
        app.clickAdvancedMenuItem();
        assertTrue(app.isTitleCorrect("Settings"));
    }

    @Test
    void menuTest50_SecurityMI() {
        app.clickSecurityMenuItem();
        assertTrue(app.isTitleCorrect("Settings"));
    }

    //-------------------------- Slides ------------------------------------

    @Test
    void menuTest51_SlidesMI() {
        app.clickSlidesMenuItem();
        assertTrue(app.isTitleCorrect("Slides"));
    }

    //-------------------------- Tax ----------------------------------------

    @Test
    void menuTest52_TaxMI() {
        app.clickTaxMenuItem();
        assertTrue(app.isTitleCorrect("Tax Rates"));
    }

    @Test
    void menuTest53_TaxRatesMI() {
        app.clickTaxRatesMenuItem();
        assertTrue(app.isTitleCorrect("Tax Rates"));
    }

    @Test
    void menuTest54_TaxClassesMI() {
        app.clickTaxClassesMenuItem();
        assertTrue(app.isTitleCorrect("Tax Classes"));
    }

    //-------------------------- Translations -------------------------------

    @Test
    void menuTest55_TranslationsMI() {
        app.clickTranslationsMenuItem();
        assertTrue(app.isTitleCorrect("Search Translations"));
    }

    @Test
    void menuTest55_SearchTranslationsMI() {
        app.clickSearchTranslationsMenuItem();
        assertTrue(app.isTitleCorrect("Search Translations"));
    }

    @Test
    void menuTest56_ScanFilesMI() {
        app.clickScanFilesMenuItem();
        assertTrue(app.isTitleCorrect("Scan Files For Translations"));
    }

    @Test
    void menuTest57_TransactionsCsvMI() {
        app.clickTranslationsCsvMenuItem();
        assertTrue(app.isTitleCorrect("CSV Import/Export"));
    }

    //-------------------------- Users --------------------------------------

    @Test
    void menuTest58_UsersMI() {
        app.clickUsersMenuItem();
        assertTrue(app.isTitleCorrect("Users"));
    }

    //-------------------------- vQmods -------------------------------------

    @Test
    void menuTest59_vQmodsMI() {
        app.clickVQmodsuItem();
        assertTrue(app.isTitleCorrect("vQmods"));
    }

}
