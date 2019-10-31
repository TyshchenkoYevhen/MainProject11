package ShowDressBanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ShowBannerTest {

    private WebDriver driver;
    private ShowBanner showBanner;
    private static final String PATH_TO_CHROMEDRIVER = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";


    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", PATH_TO_CHROMEDRIVER);
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        showBanner = new ShowBanner(this.driver);
    }

    @Test
    public void testMethod () {
        showBanner.openMainPage();
        showBanner.findBanner();
        Assert.assertTrue(true);
    }

    @AfterMethod
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.close();
    }


}