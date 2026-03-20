package pages;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class ProductsPage {

    WebDriver driver;
    WebDriverWait wait;

    By filterDropdown = By.className("product_sort_container");
    By cartIcon = By.className("shopping_cart_link");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void applyFilter() {
        WebElement dropdown = wait.until(
            ExpectedConditions.visibilityOfElementLocated(filterDropdown));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Price (low to high)");
    }

    // ✅ Dynamic product selection
    public void addProductToCart(String productName) {
        By product = By.xpath("//div[text()='" + productName + "']/ancestor::div[@class='inventory_item']//button");
        wait.until(ExpectedConditions.elementToBeClickable(product)).click();
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
    }
}