package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement FacebookButton() {
        return driver.findElement(By.cssSelector("span > i.fa-facebook-f"));
    }

    public WebElement InstagramButton() {
        return driver.findElement(By.cssSelector("span > i.fa-instagram"));
    }

    public WebElement ScheduleAndLocationsButton() {
        return driver.findElement(By.cssSelector("#club-location-vendor-card > a > div > div"));
    }

    public WebElement CreditCardsLink() {
        return driver.findElement(By.cssSelector("#custom-categories-section > li:nth-child(2) > a"));
    }

    public WebElement MembersSelectionCategory() {
        return driver.findElement(By.cssSelector("#home > div > div:nth-child(4) > div > div > div > div > div:nth-child(2) > a > div > div > div"));
    }

    public WebElement SpecialSavingsCategory() {
        return driver.findElement(By.cssSelector("#home > div > div:nth-child(4) > div > div > div > div > div:nth-child(6) > a > div > div > div"));
    }

    public WebElement CarrouselImage(String index) {
        return driver.findElement(By.cssSelector("#carouselPriceSmart > ol > li:nth-child(" + index + ")"));
    }

    public WebElement CarrouselTitle(String index) {
        return driver.findElement(By.cssSelector("div.carousel-inner .carousel-item:nth-child(" + index + ") .carousel-caption .carousel-title"));
    }

    public WebElement CarrouselContent(String index) {
        return driver.findElement(By.cssSelector("div.carousel-inner .carousel-item:nth-child(" + index + ") .carousel-caption .carousel-content"));
    }

    public WebElement CarrouselButton(String index) {
        return driver.findElement(By.cssSelector("div.carousel-inner .carousel-item:nth-child(" + index + ") .carousel-caption a"));
    }

    public WebElement DropdownMenuButton() {
        return driver.findElement(By.id("dropdownMenuButton"));
    }

    public WebElement LoginButton() {
        return driver.findElement(By.id("login-button"));
    }

    public WebElement SignUpButton() {
        return driver.findElement(By.id("signup-button"));
    }

    public WebElement NewProductsLink() {
        return driver.findElement(By.cssSelector("div.card-access-links-cont .card-block:nth-child(5) a"));
    }

    public WebElement SignOutButton() {
        return driver.findElement(By.id("signout-button"));
    }

    public WebElement DropDownMenuFirstButton() {
        return driver.findElement(By.cssSelector("div.membership-dropdown-body-cont .btn-blue-psmt"));
    }
}
