package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClubDetailsPage extends BasePage{

    public ClubDetailsPage(WebDriver driver) {
        super(driver);
    }
    public WebElement ClubAddress() {
        return driver.findElement(By.cssSelector("#page > div > section > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > address"));
    }

    public WebElement ClubSchedule() {
        return driver.findElement(By.cssSelector("div.club-locations__hours"));
    }



}
