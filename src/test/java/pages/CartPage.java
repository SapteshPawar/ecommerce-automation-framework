package pages;

import org.openqa.selenium.*;

public class CartPage {

    WebDriver driver;

    By cartItem = By.className("inventory_item_name");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isProductDisplayed() {
        return driver.findElement(cartItem).isDisplayed();
    }
}