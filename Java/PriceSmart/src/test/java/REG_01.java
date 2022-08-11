import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class REG_01 extends BaseTests {
    @Test
    public void loginValidation() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.DropdownMenuButton().click();
        homePage.LoginButton().click();
        loginPage.UsernameInput().sendKeys("12345");
        loginPage.MarketplaceLoginButton().click();
        loginPage.UsernameInput().clear();
        loginPage.UsernameInput().sendKeys("..............");
        loginPage.MarketplaceLoginButton().click();
        loginPage.UsernameInput().clear();
        loginPage.UsernameInput().sendKeys("");
        loginPage.MarketplaceLoginButton().click();
        loginPage.UsernameInput().clear();
        loginPage.UsernameInput().sendKeys("64012290240001");
        loginPage.MarketplaceLoginButton().click();
        loginPage.PasswordInput().sendKeys("12345");
        loginPage.LoginButton().click();
        loginPage.PasswordInput().clear();
        loginPage.LoginButton().click();
        loginPage.ContinueShopping().click();

        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL,"https://www.pricesmart.com/site/cr/es");
    }
}
