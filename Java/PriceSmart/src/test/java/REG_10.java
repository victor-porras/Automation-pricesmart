import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ClubListPage;
import pages.HomePage;

import java.util.ArrayList;

public class REG_10 extends BaseTests {


    @Test
    public void LocalClubInformationRequest(){
        HomePage homePage = new HomePage(driver);
        homePage.ScheduleAndLocationsButton().click();
        ClubListPage clubListPage = new ClubListPage(driver);
        clubListPage.ClubInformationLink("Zapote").click();
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
        Assert.assertEquals(URL , "https://www.instagram.com/accounts/login/?next=/pricesmartcr/");

    }
}
