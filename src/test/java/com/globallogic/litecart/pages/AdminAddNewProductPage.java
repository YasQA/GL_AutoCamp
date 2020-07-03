package com.globallogic.litecart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.globallogic.litecart.data.Product;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AdminAddNewProductPage extends Page {
    public AdminAddNewProductPage(WebDriver driver, String baseUrl) {
        super(driver, baseUrl);
        PageFactory.initElements(driver, this);
    }

    List<String> createdProductNames = new ArrayList<>();

    @FindBy(xpath="//button[@name='save']")
    WebElement saveButton;

    // ---------------------- generalTab ----------------------------------

    @FindBy(xpath="//a[text()='General']")
    WebElement generalTab;

    @FindBy(xpath="//label[text()=' Enabled']")
    WebElement generalEnabledStatusLabel;

    @FindBy(xpath="//label[text()=' Disabled']")
    WebElement generalDisabledStatusLabel;

    @FindBy(xpath="//input[@data-name='Root']")
    WebElement generalCategoriesRootCheckBox;

    @FindBy(xpath="//input[@data-name='Rubber Ducks']")
    WebElement generalCategoriesRubberDucksCheckBox;

    @FindBy(xpath="//select[@name='default_category_id']")
    WebElement generalDefaultCategoryList;

    @FindBy(xpath="//input[@name='date_valid_from']")
    WebElement generalDateValidFromDate;

    @FindBy(xpath="//input[@name='date_valid_to']")
    WebElement generalDateValidToDate;

    @FindBy(xpath="//input[@name='name[en]']")
    WebElement generalNameInput;

    @FindBy(xpath="//input[@name='code']")
    WebElement generalCodeInput;

    @FindBy(xpath="//div[@class='input-group']//input[@name='sku']")
    WebElement generalSKUInput;

    @FindBy(xpath="//div[@class='input-group']//input[@name='mpn']")
    WebElement generalMPNInput;

    @FindBy(xpath="//div[@class='input-group']//input[@name='gtin']")
    WebElement generalGTINInput;

    @FindBy(xpath="//div[@class='input-group']//input[@name='taric']")
    WebElement generalTARICInput;

    @FindBy(xpath="//select[@name='manufacturer_id']")
    WebElement generalManufacturerList;

    @FindBy(xpath="select[@name='supplier_id']")
    WebElement generalSupplierList;

    @FindBy(xpath="//input[@name='keywords']")
    WebElement generalKeywordsInput;

    //------------------ informationTab -------------------------------

    @FindBy(xpath="//a[text()='Information']")
    WebElement informationTab;

    @FindBy(xpath="//input[@name='short_description[en]']")
    WebElement informationShortDescriptionInput;

    @FindBy(xpath="//textarea[@name='description[en]']")
    WebElement informationDescriptionInput;

    @FindBy(xpath="//textarea[@name='technical_data[en]']")
    WebElement informationTechDataInput;

    @FindBy(xpath="//input[@name='head_title[en]']")
    WebElement informationHeadTitleInput;

    @FindBy(xpath="//input[@name='meta_description[en]']")
    WebElement informationMetaDescriptionInput;

    //------------------ priceTab ------------------------------------

    @FindBy(xpath="//a[text()='Prices']")
    WebElement pricesTab;

    @FindBy(xpath="//input[@name='purchase_price']")
    WebElement pricePurchasePriceInput;

    @FindBy(xpath="//select[@name='purchase_price_currency_code']")
    WebElement pricePurchasePriceCurrencyCodeList;

    @FindBy(xpath="//select[@name='tax_class_id']")
    WebElement priceTaxClassList;

    @FindBy(xpath="//input[@name='prices[USD]']")
    WebElement pricePriceUSDInput;

    @FindBy(xpath="//input[@name='prices[EUR]']")
    WebElement pricePriceEURInput;

    @FindBy(xpath="//input[@name='gross_prices[USD]']")
    WebElement priceGrossUSDInput;

    @FindBy(xpath="//input[@name='gross_prices[EUR]']")
    WebElement priceGrossEURInput;

    public void addNewProduct(Product product) {
        enableStatusLabel(product.getEnabled());
        setCheckboxValue(generalCategoriesRootCheckBox, product.getRoot());
        setCheckboxValue(generalCategoriesRubberDucksCheckBox, product.getRubberDucks());
        selectDefaultCategory(product.getDefaultCategory());
        enterDate(generalDateValidFromDate,product.getDateValidFrom());
        enterDate(generalDateValidToDate,product.getDateValidTo());
        generalCodeInput.sendKeys(product.getCode());
        generalNameInput.sendKeys(product.getProductName());
        generalSKUInput.sendKeys(product.getSKU());
        generalMPNInput.sendKeys(product.getMPN());
        generalGTINInput.sendKeys(product.getGTIN());
        generalTARICInput.sendKeys(product.getTARIC());
        selectManufacturer(product.getManufacturer());
        generalKeywordsInput.sendKeys(product.getKeywords());
        attachFile();
        informationTab.click();
        informationShortDescriptionInput.sendKeys(product.getShortDescription());
        informationDescriptionInput.sendKeys(product.getDescription());
        informationTechDataInput.sendKeys(product.getTechnicalData());
        informationHeadTitleInput.sendKeys(product.getHeadTitle());
        informationMetaDescriptionInput.sendKeys(product.getMetaDescription());
        pricesTab.click();
        pricePurchasePriceInput.sendKeys(String.valueOf(product.getPurchasePrice()));
        selectPriceCurrencyCode(product.getCurrencyCode());
        pricePriceUSDInput.sendKeys(String.valueOf(product.getPriceUSD()));
        pricePriceEURInput.sendKeys(String.valueOf(product.getPriceEUR()));
        priceGrossUSDInput.clear();
        priceGrossUSDInput.sendKeys(String.valueOf(product.getPriceUSDinclTax()));
        priceGrossEURInput.clear();
        priceGrossEURInput.sendKeys(String.valueOf(product.getPriceEURinclTax()));
        saveNewProductChanges();

        createdProductNames.add(product.getProductName());
    }

    private void enableStatusLabel(boolean toEnable) {
        if (toEnable) {
            executor.executeScript("arguments[0].click();", generalEnabledStatusLabel);
        }
        else {
            executor.executeScript("arguments[0].click();", generalDisabledStatusLabel);
        }
    }

    private void setCheckboxValue(WebElement checkBoxWebElement, boolean toCheck) {
        if (toCheck && !checkBoxWebElement.isSelected()) {
            executor.executeScript("arguments[0].click();", checkBoxWebElement);
        } else if (!toCheck && checkBoxWebElement.isSelected()) {
            executor.executeScript("arguments[0].click();", checkBoxWebElement);
        }
    }

    private void selectDefaultCategory(String category) {
        new Select(generalDefaultCategoryList).selectByVisibleText(category);
    }

    private void enterDate(WebElement calendarWebElement, String date) {
        String day = date.substring(0, 2);
        String month = date.substring(3, 6);
        String year = date.substring(7, 11);
        calendarWebElement.click();
        calendarWebElement.sendKeys(day + month + Keys.TAB + year + Keys.TAB);
    }

    private void selectManufacturer(String manufacturer) {
        new Select(driver.findElement(By.xpath("//select[@name='manufacturer_id']"))).selectByVisibleText(manufacturer);
    }

    private void selectPriceCurrencyCode(String currencyCode) {
        new Select(pricePurchasePriceCurrencyCodeList).selectByValue(currencyCode);
    }

    private void saveNewProductChanges() {
        saveButton.click();
        wait.until((WebDriver wd) -> wd.findElement(By.xpath("//div[text()=' Changes saved']")));
    }

    public void attachFile() {
        WebElement input = driver.findElement(By.xpath("//input[@type='file']"));
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("NewSuperDuck.png").getFile());
        input.sendKeys(file.getAbsolutePath());
    }

    public List<String> getCreatedProductNames() {
        return createdProductNames;
    }

    public boolean isAllNewProductsAvailable(List<String> productNames) {
        List<WebElement> listOfProducts = driver.findElements(By.xpath("//form[@name='catalog_form']//a"));
        int i = 0; // number of added new products located in products list
        for(String product : productNames) {
            for (WebElement element : listOfProducts) {
                System.out.println(element.getText());
                if (element.getText().equals(product)) {
                    i++;
                }
            }
        }
        return (i == productNames.size());
    }
}