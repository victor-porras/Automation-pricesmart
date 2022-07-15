import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ClubDetailsPage;
import pages.ClubListPage;
import pages.CreditCardPage;
import pages.HomePage;

import java.util.ArrayList;

public class REG_11 extends BaseTests {


    @Test(priority=1)
    public void CardRequestLink(){
        driver.get("https://www.pricesmart.com/site/cr/es");
        HomePage homePage = new HomePage(driver);
        CreditCardPage creditCardPage = new CreditCardPage(driver);
        homePage.CreditCardsLink().click();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL , "https://www.pricesmart.com/site/cr/es/tarjeta-de-credito");
        creditCardPage.RequestCardButton().click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        Assert.assertEquals(tabs.size(),2);
        driver.switchTo().window(tabs.get(1));
        URL = driver.getCurrentUrl();
        driver.close();
        driver.switchTo().window(tabs.get(0));
        Assert.assertTrue(URL.contains("https://www2.baccredomatic.com/es-cr/tarjetas/credito/solicitud/pricesmart"));
    }

    @Test(priority=2)
    public void CardChangeRequest(){
        driver.get("https://www.pricesmart.com/site/cr/es");
        HomePage homePage = new HomePage(driver);
        CreditCardPage creditCardPage = new CreditCardPage(driver);
        homePage.CreditCardsLink().click();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL , "https://www.pricesmart.com/site/cr/es/tarjeta-de-credito");
        creditCardPage.RequestCardChangeButton().click();
        URL = driver.getCurrentUrl();
        Assert.assertTrue(URL.contains("https://www2.baccredomatic.com/es-cr/tarjetas/credito/solicitud/pricesmart-cambio"));
    }
}
