import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import java.util.ArrayList;

public class REG_09 extends BaseTests {


    @Test
    public void verifyFacebookLink(){
        HomePage homePage = new HomePage(driver);
        homePage.FacebookButton().click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        Assert.assertEquals(tabs.size(),2);
        driver.switchTo().window(tabs.get(1));
        String URL = driver.getCurrentUrl();
        driver.close();
        driver.switchTo().window(tabs.get(0));
        Assert.assertEquals(URL , "https://www.facebook.com/PriceSmartCostaRica/");
    }

    @Test
    public void verifyInstagramLink(){
        HomePage homePage = new HomePage(driver);
        System.out.println(driver.getCurrentUrl());
        homePage.InstagramButton().click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        Assert.assertEquals(tabs.size(),2);
        driver.switchTo().window(tabs.get(1));
        String URL = driver.getCurrentUrl();
        Assert.assertTrue(URL.contains("https://www.instagram.com/"));
        Assert.assertTrue(URL.contains("/pricesmartcr/"));
    }
}
