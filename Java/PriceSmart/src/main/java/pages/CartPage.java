package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public WebElement RemoveItemButton() {
        return driver.findElement(By.cssSelector("div.cart-main-container .prod-item-cart-list:nth-child(1) button"));
    }

    public  WebElement ChangeClub() {
        return driver.findElement(By.id("clubLocationHeader"));
    }

    public WebElement WarningAlertCancel(){
        return driver.findElement(By.cssSelector("#selectClubAlert > div > div.modal-body.p-0 > div > div > a.btn.btn-clear-blue-psmt.mb-3"));
    }

    public WebElement WarningAlert(){
        return driver.findElement(By.id("selectClubAlert"));
    }
    public WebElement WarningAlertAccept(){
        return driver.findElement(By.cssSelector("#selectClubAlert > div > div.modal-body.p-0 > div > div > a.btn.btn-blue-psmt"));
    }

    public WebElement SelectionClub(){
        return driver.findElement(By.id("select-club"));
    }
}
