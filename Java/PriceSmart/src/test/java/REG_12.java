import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreditCardPage;
import pages.HomePage;

import java.util.ArrayList;

public class REG_12 extends BaseTests {


    @Test
    public void MembersSelectionCategoryLink(){
        HomePage homePage = new HomePage(driver);
        homePage.MembersSelectionCategory().click();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL , "https://www.pricesmart.com/site/cr/es/members-selection");
    }

    @Test
    public void SpecialSavingsCategoryLink(){
        driver.get("https://www.pricesmart.com/site/cr/es");
        HomePage homePage = new HomePage(driver);
        homePage.SpecialSavingsCategory().click();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL , "https://www.pricesmart.com/site/cr/es/ahorros-especiales");
    }
}
