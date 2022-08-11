import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class REG_03 extends BaseTests{
    @Test
    public void CartPageWarning() {
        HomePage homePage = new HomePage(driver);
        CategoryPage categoryPage = new CategoryPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        WebDriverWait wait = new WebDriverWait(driver,5);

        homePage.DropDownCategoryMenu().click();
        homePage.OptionLicorCervezaVino().click();
        categoryPage.SecondProduct().click();
        productPage.AddToCartButton().click();
        cartPage.ChangeClub().click();
        wait.until(ExpectedConditions.visibilityOf(cartPage.WarningAlert()));
        cartPage.WarningAlertCancel().click();
        cartPage.ChangeClub().click();
        wait.until(ExpectedConditions.visibilityOf(cartPage.WarningAlert()));
        cartPage.WarningAlertAccept().click();
        cartPage.SelectionClub().click();

        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.pricesmart.com/site/cr/es/carrito");
    }
}
