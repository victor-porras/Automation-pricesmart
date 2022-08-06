package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MembershipPage extends BasePage {
    public MembershipPage(WebDriver driver) {
        super(driver);
    }

    public WebElement JoinNowDiamondButton() {
        return driver.findElement(By.id("lnkJoinNowDiamondTop"));
    }
}
