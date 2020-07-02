package com.globallogic.litecart.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected String BaseUrl;
    protected JavascriptExecutor executor;

    public Page(WebDriver driver, String baseUrl) {
        this.driver = driver;
        this.BaseUrl = baseUrl;
        this.executor = (JavascriptExecutor)this.driver;
        wait = new WebDriverWait(driver, 10);
    }
}