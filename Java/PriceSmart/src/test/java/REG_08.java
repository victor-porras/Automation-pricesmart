import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.NewProductsPage;
import pages.ProductPage;

public class REG_08 extends BaseTests {
    @Test
    public void verifyLinkBetweenCartAndRemoveItem() {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        NewProductsPage newProductsPage = new NewProductsPage(driver);
        homePage.NewProductsLink().click();
        newProductsPage.FirstProductLink().click();
        productPage.AddToCartButton().click();
        cartPage.RemoveItemButton().click();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.pricesmart.com/site/cr/es/carrito");
    }
}
