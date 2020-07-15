package com.globallogic.litecart.listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Listener extends AbstractWebDriverEventListener {

    File file = new File("testsExecution.log");

    public Listener() throws IOException {
    }

    @Override
    public void beforeFindBy (By by, WebElement element, WebDriver driver) {
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
            writer.write(" { Starting search for: [ " + by + " ] }\n");
            writer.close();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void afterFindBy (By by, WebElement element, WebDriver driver) {
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
            writer.write(" { Element : [ "+ by + " ] has been found }\n");
            writer.close();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
            writer.write(" { Will Click on [ " + element + " ] }\n");
            writer.close();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
            writer.write(" { Clicked on [ " + element + " ] }\n");
            writer.close();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
