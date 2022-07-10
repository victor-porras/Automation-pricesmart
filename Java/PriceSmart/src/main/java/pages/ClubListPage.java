package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClubListPage extends BasePage{

    public ClubListPage(WebDriver driver) {
        super(driver);
    }
    public WebElement ClubInformationLink(String club) {
        return driver.findElement(By.xpath("//li/a[contains(text(), '"+ club +"')]"));
    }



}
