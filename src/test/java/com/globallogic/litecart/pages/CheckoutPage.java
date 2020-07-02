package com.globallogic.litecart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CheckoutPage extends Page {
    public CheckoutPage(WebDriver driver, String baseUrl) {
        super(driver, baseUrl);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "cart")
    WebElement checkout;

    @FindBy(xpath = "//button[@name='remove_cart_item']")
    List<WebElement> removeButtonsList;

    public CheckoutPage open() {
        driver.get(BaseUrl);
        checkout.click();
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//tr[@class='item']"), 0) );
        wait.until(ExpectedConditions.or(
                ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//tr[@class='item']"), 0),
                ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='There are no items in your cart.']"))));
        return this;
    }

    public CheckoutPage removeItemsFromCart() {
        List<WebElement> itemsOnCartList = driver.findElements(By.xpath("//tr[@class='item']"));
        int itemsOnCart = itemsOnCartList.size();

        while(itemsOnCart > 0) {
            removeButtonsList.get(0).click();
            wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//tr[@class='item']"), itemsOnCart-1));
            itemsOnCart--;
            System.out.println("Items after: " + itemsOnCart);
        }

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='There are no items in your cart.']")));
        return this;
    }

}
