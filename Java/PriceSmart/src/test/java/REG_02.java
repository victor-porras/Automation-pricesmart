import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CategoryPage;
import pages.HomePage;
import pages.ProductPage;

public class REG_02 extends BaseTests{
    @Test
    public void pageProductValidation() {
        HomePage homePage = new HomePage(driver);
        CategoryPage categoryPage = new CategoryPage(driver);
        ProductPage productPage = new ProductPage(driver);

        homePage.DropDownCategoryMenu().click();
        homePage.OptionLicorCervezaVino().click();
        categoryPage.FirstProduct().click();
        categoryPage.ReturnHomePage().click();
        homePage.DropDownCategoryMenu().click();
        homePage.OptionLicorCervezaVino().click();
        categoryPage.SecondProduct().click();
        productPage.ChangeValueInput().sendKeys("500");
        productPage.ButtonIncrease().click();
        productPage.ChangeValueInput().sendKeys("2");
        productPage.ButtonIncrease().click();

        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.pricesmart.com/site/cr/es/pagina-producto/35667");
    }
}
