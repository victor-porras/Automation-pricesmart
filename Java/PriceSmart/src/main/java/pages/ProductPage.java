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

    public WebElement ChangeValueInput() { return driver.findElement(By.id("customValue")); }

    public WebElement ButtonIncrease() { return driver.findElement(By.cssSelector("#product-price-small-inner > div.nav > div:nth-child(1) > div > div > div > div:nth-child(3) > button"));}
}
