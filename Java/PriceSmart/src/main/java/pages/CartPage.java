package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public WebElement RemoveItemButton() {
        return driver.findElement(By.cssSelector("div.cart-main-container .prod-item-cart-list:nth-child(1) button"));
    }
}
