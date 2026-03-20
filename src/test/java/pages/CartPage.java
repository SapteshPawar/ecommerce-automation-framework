package pages;

import org.openqa.selenium.*;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // ✅ Better validation
    public boolean isProductDisplayed(String productName) {
        return driver.getPageSource().contains(productName);
    }
}