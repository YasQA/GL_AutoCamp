package com.globallogic.litecart;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddRemoveItemsFromTheCartTests extends TestBase {

    @BeforeAll
    static void setUp() {
    }

    @AfterAll
    static void tearDown() {
    }

    @Test
    void AddRemoveItemsTest1() {
        app.openMainPage();
        app.selectItemFromPopProducts(0);
        app.addItemToCart();

        app.logotypeClick();
        app.selectItemFromPopProducts(1);
        app.addItemToCart();

        app.logotypeClick();
        app.selectItemFromPopProducts(2);
        app.addItemToCart();

        app.openCheckoutPage();
        app.removeItemsFromCart();

        app.logotypeClick();
        assertTrue(app.getNumberOfItemsOnCart() == 0);
    }
}
