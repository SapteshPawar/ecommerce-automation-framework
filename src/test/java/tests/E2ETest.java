package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseTest;
import listeners.TestListener;
import pages.*;
import utils.TestData;

@Listeners(TestListener.class)
public class E2ETest extends BaseTest {

    @Test(dataProvider = "loginData", dataProviderClass = TestData.class)
    public void testEcommerceFlow(String username, String password) {

        LoginPage login = new LoginPage(driver);
        login.login(username, password);

        // ❌ Negative Case
        if (username.equals("invalid_user")) {
            String error = login.getErrorMessage();
            Assert.assertTrue(error.contains("do not match"), "Error message not displayed");
            return;
        }

        // ✅ Positive Case
        ProductsPage product = new ProductsPage(driver);
        product.applyFilter();

        String productName = "Sauce Labs Backpack";
        product.addProductToCart(productName);
        product.goToCart();

        CartPage cart = new CartPage(driver);
        Assert.assertTrue(cart.isProductDisplayed(productName),
                "Product not found in cart");
    }
}