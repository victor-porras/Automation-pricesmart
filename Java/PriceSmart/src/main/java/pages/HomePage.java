package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

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



}
