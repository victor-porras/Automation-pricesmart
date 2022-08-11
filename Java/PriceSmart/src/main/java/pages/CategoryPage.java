package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoryPage extends BasePage{

    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    public WebElement FirstProduct() {
        return driver.findElement(By.id("search-result-413498"));
    }

    public WebElement SecondProduct() {
        return driver.findElement(By.id("search-result-35667"));
    }

    public WebElement ReturnHomePage() {
        return driver.findElement(By.id("home-page"));
    }
}
