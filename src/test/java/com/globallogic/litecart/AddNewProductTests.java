package com.globallogic.litecart;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import com.globallogic.litecart.data.Product;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddNewProductTests extends TestBase {
    String addedProductName;

    @BeforeAll
    static void setUp() {
        app.openAdminConsolePanel();
        app.loginAdminConsole();
    }

    @AfterAll
    static void tearDown() {
        app.logoutAdminConsole();
    }

    @ParameterizedTest
    @MethodSource("productProvider")
    public void addNewProductTest1(Product product) {
        app.addNewProduct(product);
        addedProductName = product.getProductName();

        assertTrue(app.isNewProductAvailable(addedProductName));

        app.deleteProduct(addedProductName);
    }
}
