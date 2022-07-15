import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class REG_14 extends BaseTests {


    @Test
    public void SecondCarrouselImageInformation(){
        HomePage homePage = new HomePage(driver);
        homePage.CarrouselImage("2").click();
        String Title = homePage.CarrouselTitle("2").getAttribute("innerText");
        String Content = homePage.CarrouselContent("2").getAttribute("innerText");
        String Button = homePage.CarrouselButton("2").getAttribute("innerText");

        WebDriverWait w = new WebDriverWait(driver,2);
        w.until(ExpectedConditions.visibilityOf(homePage.CarrouselTitle("2")));

        Assert.assertTrue(homePage.CarrouselTitle("2").isDisplayed());
        Assert.assertTrue(homePage.CarrouselContent("2").isDisplayed());
        Assert.assertTrue(homePage.CarrouselButton("2").isDisplayed());
        Assert.assertTrue(Title.contains("Disfrutá al aire libre"));
        Assert.assertTrue(Content.contains("Diseños innovadores para complementar el exterior de tu casa"));
        Assert.assertTrue(Button.contains("Ver más"));
    }

    @Test
    public void FourthCarrouselImageInformation(){
        HomePage homePage = new HomePage(driver);
        homePage.CarrouselImage("4").click();
        String Title = homePage.CarrouselTitle("4").getAttribute("innerText");
        String Content = homePage.CarrouselContent("4").getAttribute("innerText");
        String Button = homePage.CarrouselButton("4").getAttribute("innerText");


        WebDriverWait w = new WebDriverWait(driver,2);
        w.until(ExpectedConditions.visibilityOf(homePage.CarrouselTitle("4")));


        Assert.assertTrue(homePage.CarrouselTitle("4").isDisplayed());
        Assert.assertTrue(homePage.CarrouselContent("4").isDisplayed());
        Assert.assertTrue(homePage.CarrouselButton("4").isDisplayed());
        Assert.assertTrue(Title.contains("Conocé los beneficios de tu Membrecía"));
        Assert.assertTrue(Content.contains("y ahorrá mucho más de lo que pagaste por ella"));
        Assert.assertTrue(Button.contains("Ver más beneficios>>"));
    }
}
