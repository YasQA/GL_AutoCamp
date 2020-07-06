package com.globallogic.litecart;

import com.globallogic.litecart.application.Application;
import com.globallogic.litecart.data.Product;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.util.stream.Stream;

public class TestBase {
    static Application app;

    @BeforeAll
    public static void startDriver() {
        app = new Application();
    }

    @AfterAll
    public static void stopDriver() {
        app.quit();
    }

    public static Stream<Product> productProvider() {
        return Stream.of(
                Product.newEntity()
                        .withProductName("SuperDuck " + System.currentTimeMillis())
                        .withEnabled(true)
                        .withRoot(true)
                        .withRubberDucks(true)
                        .withDefaultCategory("Root")
                        .withDateValidFrom("01-Jul-2020")
                        .withDateValidTo("09-Aug-2021")
                        .withManufacturer("ACME Corp.")
                        .withSupplier("")
                        .withCode(String.valueOf(System.currentTimeMillis()))
                        .withSKU("SKU" + System.currentTimeMillis())
                        .withMPN("MPN1" + System.currentTimeMillis())
                        .withGTIN("GTIN1" + System.currentTimeMillis())
                        .withTARIC("TARIC1" + System.currentTimeMillis())
                        .withKeywords("Super Duck")
                        .withShortDescription("This is Super Duck")
                        .withDescription("This is Mega Super Duck")
                        .withTechnicalData("100% Gold")
                        .withHeadTitle("Super Puper Duck")
                        .withMetaDescription("Just Gold Duck")
                        .withPurchasePrice(100)
                        .withCurrencyCode("USD")
                        .withTaxClass("")
                        .withPriceUSD(200)
                        .withPriceEUR(190)
                        .withPriceUSDinclTax(200)
                        .withPriceEURinclTax(190)
                        .build(),
                Product.newEntity()
                        .withProductName("SuperDuck 2 " + System.currentTimeMillis())
                        .withEnabled(true)
                        .withRoot(true)
                        .withRubberDucks(true)
                        .withDefaultCategory("Root")
                        .withDateValidFrom("01-Jul-2020")
                        .withDateValidTo("09-Aug-2021")
                        .withManufacturer("ACME Corp.")
                        .withSupplier("")
                        .withCode("2" + System.currentTimeMillis())
                        .withSKU("SKU 2 " + System.currentTimeMillis())
                        .withMPN("MPN1 2 " + System.currentTimeMillis())
                        .withGTIN("GTIN1 2 " + System.currentTimeMillis())
                        .withTARIC("TARIC1 2 " + System.currentTimeMillis())
                        .withKeywords("Super Duck")
                        .withShortDescription("This is Super Duck")
                        .withDescription("This is Mega Super Duck")
                        .withTechnicalData("100% Gold")
                        .withHeadTitle("Super Puper Duck")
                        .withMetaDescription("Just Gold Duck")
                        .withPurchasePrice(100)
                        .withCurrencyCode("USD")
                        .withTaxClass("")
                        .withPriceUSD(200)
                        .withPriceEUR(190)
                        .withPriceUSDinclTax(200)
                        .withPriceEURinclTax(190)
                        .build()
        );
    }

}
