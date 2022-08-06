package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewProductsPage extends BasePage {
    public NewProductsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement FirstProductLink() {
        return driver.findElement(By.cssSelector("div.carousel__track .carousel__item:nth-child(1) a"));
    }
}
