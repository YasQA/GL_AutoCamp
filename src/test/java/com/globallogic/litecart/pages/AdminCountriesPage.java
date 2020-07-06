package com.globallogic.litecart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AdminCountriesPage extends Page {
    public AdminCountriesPage(WebDriver driver, String baseUrl) {
        super(driver, baseUrl);
        //PageFactory.initElements(driver, this);
    }

    public List<WebElement> countriesList;
    public List<WebElement> externalLinksListOnEditPage;

    public List<WebElement> getCountriesLinks() {
        countriesList = wait.until((WebDriver wd) -> wd.findElements(By.xpath("//*[@id='content']//table//a[contains(@href,'doc=edit_country')]")));
        return countriesList;
    }

    public AdminCountriesPage openCountryForEditByPositionInList(int position) {
        getCountriesLinks().get(position).click();
        wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Edit Country']")));
        return this;
    }

    public List<WebElement> getExternalLinks() {
        externalLinksListOnEditPage = wait.until((WebDriver wd) -> wd.findElements(By.xpath("//*[@class='fa fa-external-link']")));
        return externalLinksListOnEditPage;
    }

    public AdminCountriesPage openExternalLinkByLinkNumber(int number) {
        String parentHandle = driver.getWindowHandle();
        getExternalLinks().get(number).click();
        return this;
    }

}
