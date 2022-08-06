import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MembershipPage;
import pages.SignUpPage;

public class REG_06 extends BaseTests {
    @Test
    public void verifyLinkBetweenSignUpAndMembershipPurchase() {
        HomePage homePage = new HomePage(driver);
        MembershipPage membershipPage = new MembershipPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        homePage.DropdownMenuButton().click();
        homePage.SignUpButton().click();
        membershipPage.JoinNowDiamondButton().click();
        signUpPage.FirstNameInput().sendKeys("Miranda");
        signUpPage.LastNameInput().sendKeys("Castaing");
        signUpPage.EmailInput().sendKeys("mcastaingk@ucenfotec.ac.cr");
        signUpPage.EmailConfirmInput().sendKeys("mcastaingk@ucenfotec.ac.cr");
        signUpPage.PasswordInput().sendKeys("nFaZ3Pj7Xdqq-z-");
        signUpPage.PasswordConfirmInput().sendKeys("nFaZ3Pj7Xdqq-z-");
        signUpPage.IdentificationInput().sendKeys("117700616");
        signUpPage.PhoneInput().sendKeys("89397940");
        signUpPage.EmailElectronicInvoiceInput().sendKeys("mcastaingk@ucenfotec.ac.cr");
        signUpPage.TermsInput().click();
        signUpPage.SignUpButton().click();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.pricesmart.com/site/cr/es/membrecia-pago");
    }
}
