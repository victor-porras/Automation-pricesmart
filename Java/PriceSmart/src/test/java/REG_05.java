import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class REG_05 extends BaseTests {
    @Test
    public void verifyLinkBetweenLoginAndHomePage() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.DropdownMenuButton().click();
        homePage.LoginButton().click();
        loginPage.UsernameInput().sendKeys("USERNAME");
        loginPage.MarketplaceLoginButton().click();
        loginPage.PasswordInput().sendKeys("PASSWORD");
        loginPage.LoginButton().click();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.pricesmart.com/site/cr/es");
    }
}
