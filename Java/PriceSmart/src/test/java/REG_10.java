import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.ClubDetailsPage;
import pages.ClubListPage;
import pages.HomePage;

import java.util.ArrayList;

public class REG_10 extends BaseTests {


    @Test
    public void LocalClubInformationRequest(){
        driver.get("https://www.pricesmart.com/site/cr/es");
        HomePage homePage = new HomePage(driver);
        ClubListPage clubListPage = new ClubListPage(driver);
        ClubDetailsPage clubDetailsPage = new ClubDetailsPage(driver);
        homePage.ScheduleAndLocationsButton().click();
        clubListPage.ClubInformationLink("Zapote").click();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL , "https://www.pricesmart.com/site/cr/es/ubicacion-de-club/club/zapote");
        Assert.assertTrue(clubDetailsPage.ClubAddress().isDisplayed());
        Assert.assertTrue(clubDetailsPage.ClubSchedule().isDisplayed());

    }

    @Test
    public void ForeignClubInformationRequest(){
        driver.get("https://www.pricesmart.com/site/cr/es");
        HomePage homePage = new HomePage(driver);
        ClubListPage clubListPage = new ClubListPage(driver);
        ClubDetailsPage clubDetailsPage = new ClubDetailsPage(driver);
        homePage.ScheduleAndLocationsButton().click();
        clubListPage.ClubInformationLink("Santa Elena").click();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL , "https://www.pricesmart.com/site/cr/es/ubicacion-de-club/club/santa-elena");
        Assert.assertTrue(clubDetailsPage.ClubAddress().isDisplayed());
        Assert.assertTrue(clubDetailsPage.ClubSchedule().isDisplayed());
    }
}
