package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreditCardPage extends BasePage{

    public CreditCardPage(WebDriver driver) {
        super(driver);
    }
    public WebElement RequestCardButton() {
        return driver.findElement(By.cssSelector("#cc-cta-bottom > div > section > div > div.banner-cont-body.col-12 > div > div > div > p.lead.main-card-banner-link-cont.mb-2.d-block > a"));
    }

    public WebElement RequestCardChangeButton() {
        return driver.findElement(By.cssSelector("#cc-cta-bottom > div > section > div > div.banner-cont-html.col-12 > div > div > a"));
    }
}
