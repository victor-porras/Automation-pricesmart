import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MembershipPage;
import pages.SignUpPage;

public class REG_04 extends BaseTests{
    @Test
    public void RegistrationValidation(){
        HomePage homePage = new HomePage(driver);
        MembershipPage membershipPage = new MembershipPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);

        homePage.DropdownMenuButton().click();
        homePage.SignUpButton().click();
        membershipPage.JoinNowDiamondButton().click();
        signUpPage.FirstNameInput().sendKeys("Nilce");
        signUpPage.LastNameInput().sendKeys("Vila");
        signUpPage.EmailInput().sendKeys("gabyvcc@hotmail.com");
        signUpPage.EmailConfirmInput().sendKeys("gabyvco@gmail.com");
        signUpPage.PasswordInput().sendKeys("nilceVila");
        signUpPage.PasswordConfirmInput().sendKeys("nilceVilaCcopa");
        signUpPage.IdentificationInput().sendKeys("118340204");
        signUpPage.PhoneInput().sendKeys("63098744");
        signUpPage.EmailElectronicInvoiceInput().sendKeys("gabyvcc@hotmail.com");
        signUpPage.SignUpButton().click();
        signUpPage.TermsInput().click();
        signUpPage.SignUpButton().click();

        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.pricesmart.com/site/cr/es/registro?item_number=989998&club_code=6407");
    }
}
