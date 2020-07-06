package com.globallogic.litecart;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import com.globallogic.litecart.data.Product;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddNewProductTests extends TestBase {

    @BeforeAll
    static void setUp() {
        app.openAdminConsolePanel();
        app.loginAdminConsole();
    }

    @AfterAll
    static void tearDown() {
        app.deleteProducts(app.getCreatedProductNames());
        app.logoutAdminConsole();
    }

    @ParameterizedTest
    @MethodSource("productProvider")
    public void addNewProductTest1(Product product) {
        app.addNewProduct(product);
        assertTrue(app.isAllNewProductAvailable());
    }
}
