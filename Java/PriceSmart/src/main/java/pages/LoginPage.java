package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement UsernameInput() {
        return driver.findElement(By.id("username"));
    }

    public WebElement PasswordInput() {
        return driver.findElement(By.id("password"));
    }

    public WebElement MarketplaceLoginButton() {
        return driver.findElement(By.id("marketplace-login-btn"));
    }

    public WebElement LoginButton() {
        return driver.findElement(By.id("kc-login"));
    }
}
