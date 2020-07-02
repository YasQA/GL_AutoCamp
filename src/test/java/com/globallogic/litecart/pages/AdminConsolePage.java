package com.globallogic.litecart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class AdminConsolePage extends Page {
    public AdminConsolePage(WebDriver driver, String baseUrl) {
        super(driver, baseUrl);
        PageFactory.initElements(driver, this);
    }

    //--------------------------- Appearance ------------------------------

    @FindBy(xpath="//*[@id='box-apps-menu']//a[contains(@href,'appearance')]")
    WebElement appearanceMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//a[contains(@href,'template')]")
    WebElement templateMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//a[contains(@href,'logotype')]")
    WebElement logotypeMI;

    //--------------------------- Catalog ---------------------------------

    @FindBy(xpath="//*[@id='box-apps-menu']/li/a[contains(@href,'catalog')]")
    WebElement catalogMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'doc=catalog')]")
    WebElement catalogSubMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//a[contains(@href,'attribute_groups')]")
    WebElement attributeGroupsMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//a[contains(@href,'manufacturers')]")
    WebElement manufacturersMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//a[contains(@href,'suppliers')]")
    WebElement suppliersMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//a[contains(@href,'delivery_statuses')]")
    WebElement deliveryStatusesMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//a[contains(@href,'sold_out_statuses')]")
    WebElement soldOutStatusesMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//a[contains(@href,'quantity_units')]")
    WebElement quantityUnitsMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//a[contains(@href,'app=catalog&doc=csv')]")
    WebElement catalogCsvMI;

    //------------------------- Countries -----------------------------------

    @FindBy(xpath="//*[@id='box-apps-menu']//a[contains(@href,'countries')]")
    WebElement countriesMI;

    //------------------------- Currencies ----------------------------------

    @FindBy(xpath="//*[@id='box-apps-menu']//a[contains(@href,'currencies')]")
    WebElement currenciesMI;

    //-------------------------- Customers ----------------------------------

    @FindBy(xpath="//*[@id='box-apps-menu']/li/a[contains(@href,'app=customers&doc=customers')]")
    WebElement customersMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=customers&doc=customers')]")
    WebElement customersSubMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//a[contains(@href,'app=customers&doc=csv')]")
    WebElement customerCsvMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//a[contains(@href,'newsletter')]")
    WebElement newsletterMI;

    //------------------------- Geo Zones -----------------------------------

    @FindBy(xpath="//*[@id='box-apps-menu']//a[contains(@href,'geo_zones')]")
    WebElement geoZonesMI;

    //------------------------- Languages -----------------------------------

    @FindBy(xpath="//*[@id='box-apps-menu']/li/a[contains(@href,'app=languages&doc=languages')]")
    WebElement languagesMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=languages&doc=languages')]")
    WebElement languagesSubMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//a[contains(@href,'app=languages&doc=storage_encoding')]")
    WebElement storageEncodingMI;

    //------------------------- Modules -------------------------------------

    @FindBy(xpath="//*[@id='box-apps-menu']/li/a[contains(@href,'app=modules&doc=customer')]")
    WebElement modulesMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=modules&doc=customer')]")
    WebElement customerModulesMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=modules&doc=shipping')]")
    WebElement shippingModulesMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=modules&doc=payment')]")
    WebElement paymentModulesMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=modules&doc=order')]")
    WebElement orderModulesMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=modules&doc=order_total')]")
    WebElement orderTotalModulesMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=modules&doc=jobs')]")
    WebElement jobModulesMI;

    //-------------------------- Orders -------------------------------------

    @FindBy(xpath="//*[@id='box-apps-menu']/li/a[contains(@href,'app=orders&doc=orders')]")
    WebElement ordersMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=orders&doc=orders')]")
    WebElement ordersSubMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=orders&doc=order_statuses')]")
    WebElement orderStatusesMI;

    //-------------------------- Pages --------------------------------------

    @FindBy(xpath="//*[@id='box-apps-menu']/li/a[contains(@href,'app=pages&doc=pages')]")
    WebElement pagesMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=pages&doc=pages')]")
    WebElement pagesSubMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=pages&doc=csv')]")
    WebElement pagesCsvMI;

    //-------------------------- Reports ------------------------------------

    @FindBy(xpath="//*[@id='box-apps-menu']/li/a[contains(@href,'app=reports&doc=monthly_sales')]")
    WebElement reportsMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=reports&doc=monthly_sales')]")
    WebElement monthlySalesMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=reports&doc=most_sold_products')]")
    WebElement mostSoldProductsMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=reports&doc=most_shopping_customers')]")
    WebElement mostShoppingCustomersMI;

    //-------------------------- Settings -----------------------------------

    @FindBy(xpath="//*[@id='box-apps-menu']/li/a[contains(@href,'app=settings&doc=store_info')]")
    WebElement settingsMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=settings&doc=store_info')]")
    WebElement storeInfoMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=settings&doc=defaults')]")
    WebElement defaultsMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=settings&doc=email')]")
    WebElement emailMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=settings&doc=listings')]")
    WebElement listingsMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=settings&doc=customer_details')]")
    WebElement customerDetailsMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=settings&doc=legal')]")
    WebElement legalMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=settings&doc=images')]")
    WebElement imagesMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=settings&doc=checkout')]")
    WebElement checkoutMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=settings&doc=advanced')]")
    WebElement advancedMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=settings&doc=security')]")
    WebElement securityMI;

    //-------------------------- Slides ------------------------------------

    @FindBy(xpath="//*[@id='box-apps-menu']/li/a[contains(@href,'app=slides&doc=slides')]")
    WebElement slidesMI;

    //-------------------------- Tax ----------------------------------------

    @FindBy(xpath="//*[@id='box-apps-menu']/li/a[contains(@href,'app=tax&doc=tax_rates')]")
    WebElement taxMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=tax&doc=tax_rates')]")
    WebElement taxRatesMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=tax&doc=tax_classes')]")
    WebElement taxClassesMI;

    //-------------------------- Translations -------------------------------

    @FindBy(xpath="//*[@id='box-apps-menu']/li/a[contains(@href,'app=translations&doc=search')]")
    WebElement translationsMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=translations&doc=search')]")
    WebElement searchTranslationsMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=translations&doc=scan')]")
    WebElement scanFilesMI;

    @FindBy(xpath="//*[@id='box-apps-menu']//ul//a[contains(@href,'app=translations&doc=csv')]")
    WebElement translationsCsvMI;

    //-------------------------- Users --------------------------------------

    @FindBy(xpath="//*[@id='box-apps-menu']/li/a[contains(@href,'app=users&doc=users')]")
    WebElement usersMI;

    //-------------------------- vQmods -------------------------------------

    @FindBy(xpath="//*[@id='box-apps-menu']/li/a[contains(@href,'app=vqmods&doc=vqmods')]")
    WebElement vQmodsMI;


    //=======================================================================

    //-------------------------- Appearance ---------------------------------

    public AdminConsolePage clickAppearanceMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            executor.executeScript("arguments[0].click();", appearanceMI);
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Template']")));
        }
        return this;
    }

    public AdminConsolePage clickTemplateMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickAppearanceMenuItem();
            templateMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Template']")));
        }
        return this;
    }

        public AdminConsolePage clickLogotypeMenuItem() {
            if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
                clickAppearanceMenuItem();
                logotypeMI.click();
                wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Logotype']")));
            }
        return this;
    }

    //--------------------------- Catalog -----------------------------------

    public AdminConsolePage clickCatalogMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            executor.executeScript("arguments[0].click();", catalogMI);
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Catalog']")));
        }
        return this;
    }

    public AdminConsolePage clickCatalogSubMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickCatalogMenuItem();
            catalogSubMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Catalog']")));
        }
        return this;
    }

    public AdminConsolePage clickAttributeGroupsMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickCatalogMenuItem();
            attributeGroupsMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath(".//*[@id='top-bar']//a[text()='Attribute Groups']")));
        }
        return this;
    }

    public AdminConsolePage clickManufacturersMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickCatalogMenuItem();
            manufacturersMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Manufacturers']")));
        }
        return this;
    }

    public AdminConsolePage clickSuppliersMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickCatalogMenuItem();
            suppliersMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Suppliers']")));
        }
        return this;
    }

    public AdminConsolePage clickDeliveryStatusesMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickCatalogMenuItem();
            deliveryStatusesMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Delivery Statuses']")));
        }
        return this;
    }

    public AdminConsolePage clickSoldOutStatusesMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickCatalogMenuItem();
            soldOutStatusesMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Sold Out Statuses']")));
        }
        return this;
    }

    public AdminConsolePage clickQuantityUnitsMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickCatalogMenuItem();
            quantityUnitsMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Quantity Units']")));
        }
        return this;
    }

    public AdminConsolePage clickCatalogCSVMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickCatalogMenuItem();
            catalogCsvMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Import/Export CSV']")));
        }
        return this;
    }

    //-------------------------- Countries -----------------------------------

    public AdminConsolePage clickCountriesMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            executor.executeScript("arguments[0].click();", countriesMI);
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//a[text()='Countries']")));
        }
        return this;
    }

    //------------------------- Currencies ----------------------------------

    public AdminConsolePage clickCurrenciesMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            executor.executeScript("arguments[0].click();", currenciesMI);
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//a[text()='Currencies']")));
        }
        return this;
    }

    //------------------------ Customers  ----------------------------------

    public AdminConsolePage clickCustomersMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            executor.executeScript("arguments[0].click();", customersMI);
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//a[text()='Customers']")));
        }
        return this;
    }

    public AdminConsolePage clickCustomersSubMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickCustomersMenuItem();
            customersSubMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//a[text()='Customers']")));
        }
        return this;
    }

    public AdminConsolePage clickCustomersCSVMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickCustomersMenuItem();
            customerCsvMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='CSV Import/Export']")));
        }
        return this;
    }

    public AdminConsolePage clickNewsletterMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickCustomersMenuItem();
            newsletterMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Newsletter']")));
        }
        return this;
    }

    //------------------------- Geo Zones -----------------------------------

    public AdminConsolePage clickGeoZonesMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            executor.executeScript("arguments[0].click();", geoZonesMI);
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//a[text()='Geo Zones']")));
        }
        return this;
    }

    //------------------------- Languages -----------------------------------

    public AdminConsolePage clickLanguagesMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            executor.executeScript("arguments[0].click();", languagesMI);
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//a[text()='Languages']")));
        }
        return this;
    }

    public AdminConsolePage clickLanguagesSubMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickLanguagesMenuItem();
            languagesSubMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//a[text()='Languages']")));
        }
        return this;
    }

    public AdminConsolePage clickStorageEncodingMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickLanguagesMenuItem();
            storageEncodingMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Storage Encoding']")));
        }
        return this;
    }

    //------------------------- Modules -------------------------------------

    public AdminConsolePage clickModulesMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            executor.executeScript("arguments[0].click();", modulesMI);
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Customer Modules']")));
        }
        return this;
    }

    public AdminConsolePage clickCustomerModulesMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickModulesMenuItem();
            customerModulesMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Customer Modules']")));
        }
        return this;
    }

    public AdminConsolePage clickShippingModulesMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickModulesMenuItem();
            shippingModulesMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Shipping Modules']")));
        }
        return this;
    }

    public AdminConsolePage clickPaymentModulesMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickModulesMenuItem();
            paymentModulesMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Payment Modules']")));
        }
        return this;
    }

    public AdminConsolePage clickOrderModulesMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickModulesMenuItem();
            orderModulesMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Order Modules']")));
        }
        return this;
    }

    public AdminConsolePage clickOrderTotalModulesMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickModulesMenuItem();
            orderTotalModulesMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Order Total Modules']")));
        }
        return this;
    }

    public AdminConsolePage clickJobModulesMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickModulesMenuItem();
            jobModulesMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Job Modules']")));
        }
        return this;
    }

    //-------------------------- Orders -------------------------------------

    public AdminConsolePage clickOrdersMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            executor.executeScript("arguments[0].click();", ordersMI);
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//a[text()='Orders']")));
        }
        return this;
    }

    public AdminConsolePage clickOrdersSubMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickOrdersMenuItem();
            ordersSubMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//a[text()='Orders']")));
        }
        return this;
    }

    public AdminConsolePage clickOrderStatusesMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickOrdersMenuItem();
            orderStatusesMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Order Statuses']")));
        }
        return this;
    }

    //-------------------------- Pages --------------------------------------

    public AdminConsolePage clickPagesMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            executor.executeScript("arguments[0].click();", pagesMI);
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//a[text()='Pages']")));
        }
        return this;
    }

    public AdminConsolePage clickPagesSubMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickPagesMenuItem();
            pagesSubMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//a[text()='Pages']")));
        }
        return this;
    }

    public AdminConsolePage clickPagesCsvMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickPagesMenuItem();
            pagesCsvMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='CSV Import/Export']")));
        }
        return this;
    }

    //-------------------------- Reports ------------------------------------

    public AdminConsolePage clickReportsMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            executor.executeScript("arguments[0].click();", reportsMI);
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Monthly Sales']")));
        }
        return this;
    }

    public AdminConsolePage clickMonthlySalesMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickReportsMenuItem();
            monthlySalesMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Monthly Sales']")));
        }
        return this;
    }

    public AdminConsolePage clickMostSoldProductsMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickReportsMenuItem();
            mostSoldProductsMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Most Sold Products']")));
        }
        return this;
    }

    public AdminConsolePage clickMostShoppingCustomersMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickReportsMenuItem();
            mostShoppingCustomersMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Most Shopping Customers']")));
        }
        return this;
    }

    //-------------------------- Settings -----------------------------------

    public AdminConsolePage clickSettingsMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            executor.executeScript("arguments[0].click();", settingsMI);
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//a[text()='Settings']")));
        }
        return this;
    }

    public AdminConsolePage clickStoreInfoMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickSettingsMenuItem();
            storeInfoMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//a[text()='Settings']")));
        }
        return this;
    }

    public AdminConsolePage clickDefaultsMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickSettingsMenuItem();
            defaultsMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//a[text()='Settings']")));
        }
        return this;
    }

    public AdminConsolePage clickEmailMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickSettingsMenuItem();
            emailMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//a[text()='Settings']")));
        }
        return this;
    }

    public AdminConsolePage clickListingsMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickSettingsMenuItem();
            listingsMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//a[text()='Settings']")));
        }
        return this;
    }

    public AdminConsolePage clickCustomerDetailsMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickSettingsMenuItem();
            customerDetailsMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//a[text()='Settings']")));
        }
        return this;
    }

    public AdminConsolePage clickLegalMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickSettingsMenuItem();
            legalMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//a[text()='Settings']")));
        }
        return this;
    }
    public AdminConsolePage clickImagesMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickSettingsMenuItem();
            imagesMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//a[text()='Settings']")));
        }
        return this;
    }

    public AdminConsolePage clickCheckoutMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickSettingsMenuItem();
            checkoutMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//a[text()='Settings']")));
        }
        return this;
    }

    public AdminConsolePage clickAdvancedMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickSettingsMenuItem();
            advancedMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//a[text()='Settings']")));
        }
        return this;
    }

    public AdminConsolePage clickSecurityMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickSettingsMenuItem();
            securityMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//a[text()='Settings']")));
        }
        return this;
    }

    //-------------------------- Slides ------------------------------------

    public AdminConsolePage clickSlidesMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            executor.executeScript("arguments[0].click();", slidesMI);
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//a[text()='Slides']")));
        }
        return this;
    }

    //-------------------------- Tax ----------------------------------------

    public AdminConsolePage clickTaxMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            executor.executeScript("arguments[0].click();", taxMI);
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Tax Rates']")));
        }
        return this;
    }

    public AdminConsolePage clickTaxRatesMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickTaxMenuItem();
            taxRatesMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Tax Rates']")));
        }
        return this;
    }

    public AdminConsolePage clickTaxClassesMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickTaxMenuItem();
            taxClassesMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Tax Classes']")));
        }
        return this;
    }

    //-------------------------- Translations -------------------------------

    public AdminConsolePage clickTranslationsMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            executor.executeScript("arguments[0].click();", translationsMI);
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Search Translations']")));
        }
        return this;
    }

    public AdminConsolePage clickSearchTranslationsMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickTranslationsMenuItem();
            searchTranslationsMI.click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Search Translations']")));
        }
        return this;
    }

    public AdminConsolePage clickScanFilesMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickTranslationsMenuItem();
            executor.executeScript("arguments[0].click();", scanFilesMI);
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Scan Translations']")));
        }
        return this;
    }

    public AdminConsolePage clickTranslationsCsvMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            clickTranslationsMenuItem();
            executor.executeScript("arguments[0].click();", translationsCsvMI);
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Import/Export CSV']")));
        }
        return this;
    }

    //-------------------------- Users --------------------------------------

    public AdminConsolePage clickUsersMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            executor.executeScript("arguments[0].click();", usersMI);
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//a[text()='Users']")));
        }
        return this;
    }

    //-------------------------- vQmods -------------------------------------

    public AdminConsolePage clickVQmodsItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 1) {
            executor.executeScript("arguments[0].click();", vQmodsMI);
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//a[text()='vQmods']")));
        }
        return this;
    }

    //=======================================================================

    public AdminConsolePage open() {
        driver.get(BaseUrl + "/admin");
        return this;
    }

    public AdminConsolePage performLogin() {
        if (driver.findElements(By.id("box-login")).size() > 0) {
            driver.findElement(By.name("username")).sendKeys("admin");
            driver.findElement(By.name("password")).sendKeys("gl_admin");
            driver.findElement(By.name("password")).submit();
            wait.until((WebDriver dw) -> dw.findElement(By.id("box-apps-menu")));
        }
        return this;
    }

    public AdminConsolePage performLogout() {
        driver.findElement(By.xpath("//a[contains(@href,'logout')]")).click();
        return this;
    }

    public boolean isTitleCorrect(String title) {
        return wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@class='panel-heading']"), title));
    }
}

