package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage extends BasePage {
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public WebElement FirstNameInput() {
        return driver.findElement(By.id("firstName"));
    }

    public WebElement LastNameInput() {
        return driver.findElement(By.id("lastName"));
    }

    public WebElement EmailInput() {
        return driver.findElement(By.id("email"));
    }

    public WebElement EmailConfirmInput() {
        return driver.findElement(By.id("emailConfirm"));
    }

    public WebElement PasswordInput() {
        return driver.findElement(By.id("txtpassword"));
    }

    public WebElement PasswordConfirmInput() {
        return driver.findElement(By.id("passwordConfirm"));
    }

    public WebElement IdentificationInput() {
        return driver.findElement(By.id("identification"));
    }

    public WebElement PhoneInput() {
        return driver.findElement(By.id("phone"));
    }

    public WebElement EmailElectronicInvoiceInput() {
        return driver.findElement(By.id("emailElectronicInvoice"));
    }

    public WebElement TermsInput() {
        return driver.findElement(By.id("terms-label"));
    }

    public WebElement SignUpButton() {
        return driver.findElement(By.id("sendInfoNotAero"));
    }
}
