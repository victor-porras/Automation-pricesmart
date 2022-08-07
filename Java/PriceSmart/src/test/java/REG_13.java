import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class REG_13 extends BaseTests {
    @Test
    public void verifySignOutFunctionality() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.DropdownMenuButton().click();
        homePage.LoginButton().click();
        loginPage.UsernameInput().sendKeys("64020113090001");
        loginPage.MarketplaceLoginButton().click();
        loginPage.PasswordInput().sendKeys("pumpkin88");
        loginPage.LoginButton().click();
        homePage.DropdownMenuButton().click();
        homePage.SignOutButton().click();
        homePage.DropdownMenuButton().click();
        Assert.assertEquals(homePage.DropDownMenuFirstButton().getAttribute("value"), "Iniciar sesión");
    }
}
