package com.globallogic.litecart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class MainPage extends Page {
    public MainPage(WebDriver driver, String baseUrl) {
        super(driver, baseUrl);
        PageFactory.initElements(driver, this);
    }

    public MainPage open() {
        driver.get(BaseUrl);
        return this;
    }

    @FindBy(xpath = "//a[@class='logotype']")
    WebElement logotype;

    @FindBy(xpath="//*[@id='box-popular-products']//a[@class='link']")
    List<WebElement> popularProductsList;

    @FindBy(id = "cart")
    WebElement checkout;

    @FindBy(xpath = "//*[@class='badge quantity']")
    WebElement itemsOnCart;

    public MainPage logotypeClick() {
        logotype.click();
        return this;
    }

    public MainPage selectItemFromPopProducts(int number) {
        if (popularProductsList.size() >= 1) {
            popularProductsList.get(number).click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@class='btn btn-success']")));
        }
        return this;
    }

    public MainPage addItemToCart() {
        if (driver.findElements(By.xpath("//*[@class='form-control' and @name='quantity']")).size() == 1) {
            int onCart = getNumberOfItemsOnCart();
            driver.findElement(By.xpath("//*[@class='btn btn-success']")).click();
            wait.until(ExpectedConditions.attributeToBe(By.xpath("//div[@class='badge quantity']"), "textContent", String.valueOf(onCart+1)));
        }
        return this;
    }

    public int getNumberOfItemsOnCart() {
        String indicatorValue = itemsOnCart.getText();
        int numberOfItems = indicatorValue.equals("") ? 0 : Integer.parseInt(indicatorValue);
        return numberOfItems;
    }

}
