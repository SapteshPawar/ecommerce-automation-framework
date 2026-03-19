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

        // NEGATIVE CASE
        if (username.equals("invalid_user")) {
            Assert.assertTrue(driver.getCurrentUrl().contains("saucedemo"));
            return;
        }

        // POSITIVE FLOW
        ProductsPage product = new ProductsPage(driver);
        product.applyFilter();
        product.addProductToCart();
        product.goToCart();

        CartPage cart = new CartPage(driver);
        Assert.assertTrue(false, "Forcing failure to test screenshot");
    }
}