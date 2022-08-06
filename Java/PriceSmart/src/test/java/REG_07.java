import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.NewProductsPage;
import pages.ProductPage;

public class REG_07 extends BaseTests {
    @Test
    public void verifyLinkBetweenAddToCartAndCart() {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        NewProductsPage newProductsPage = new NewProductsPage(driver);
        homePage.NewProductsLink().click();
        newProductsPage.FirstProductLink().click();
        productPage.AddToCartButton().click();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.pricesmart.com/site/cr/es/carrito");
    }
}
