package com.globallogic.litecart;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
        for (int i = 0; i < 3; i++) {
            app.gotoMainPage();
            app.selectItemFromLatestProducts(i);
            app.addItemToCart();
        }

        app.openCheckoutPage();
        app.removeItemsFromCart();

        app.gotoMainPage();
        assertEquals(0, app.getNumberOfItemsOnCart());
    }
}
