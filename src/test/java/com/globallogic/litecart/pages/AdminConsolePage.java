package com.globallogic.litecart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import static java.util.stream.Collectors.toSet;

public class AdminConsolePage extends Page {
    public AdminConsolePage(WebDriver driver, String baseUrl) {
        super(driver, baseUrl);
    }

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
            //wait.until((WebDriver dw) -> dw.findElements(By.xpath("//*[@class='app']")).size() >= 16);
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

    public AdminConsolePage clickAppearanceMenuItem() {
//        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 16)
        wait.until((WebDriver wd) -> wd.findElements(By.xpath("//*[@class='app']")).size() >= 16);
        driver.findElement(By.xpath("//*[@id='box-apps-menu']/li[contains(@data-code,'appearance')]")).click();

        //wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@class='panel-body']")));
//    }
    return this;
    }

    public AdminConsolePage clickTemplateMenuItem() {
        if (driver.findElements(By.xpath("//*[@class='app']")).size() >= 16) {
            driver.findElement(By.xpath("//*[@id='sidebar']//li[contains(@data-code,'appearance')]")).click();
            driver.findElement(By.xpath("//*[@id='sidebar']//li[contains(@data-code,'template')]")).click();
            wait.until((WebDriver wd) -> wd.findElement(By.xpath("//*[@id='top-bar']//li[text()='Template']")));
        }
        return this;
    }





    //PAGE Factory ???????????????????????????????----------------------------------------
//    @FindBy(xpath="//*[@class='panel-heading']")
//    WebElement panelHeading;
//
//    @FindBy(xpath="//*[@id='sidebar']//li[contains(@data-code,'appearance')]")
//    WebElement appearanceMenuItem;

    //PAGE Factory ???????????????????????????????----------------------------------------

//
//    public initLoggedAdminPage() {
//        PageFactory.initElements(driver, this);
//    }

//    public WebElement panelHeading; // = driver.findElement(By.xpath("//*[@class='panel-heading']"));;
//    public WebElement getPanelHeading () {
//        panelHeading = driver.findElement(By.xpath("//*[@class='panel-heading']"));
//        return panelHeading;
//    }


}