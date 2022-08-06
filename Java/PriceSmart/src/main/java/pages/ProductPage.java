package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public WebElement AddToCartButton() {
        return driver.findElement(By.id("btn-add-to-cart"));
    }
}
