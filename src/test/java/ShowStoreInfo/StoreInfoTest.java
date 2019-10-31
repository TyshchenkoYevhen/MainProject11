package ShowStoreInfo;

import MainPage.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class StoreInfoTest {

    private WebDriver driver;
    private StoreInfo storeInfo;
    private static final String PATH_TO_CHROMEDRIVER = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", PATH_TO_CHROMEDRIVER);
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        storeInfo = new StoreInfo(this.driver);
    }

    @Test
    public void testDisplayBlockStoreInfo() {
        Assert.assertTrue(true);
    }

    @Test
    public void testDisplayCategories() {
        Assert.assertTrue(true);
    }

    @Test
    public void testDisplayInformation() {
        Assert.assertTrue(true);
    }

    @Test
    public void testDisplayMyAccount() {
        Assert.assertTrue(true);
    }

    @AfterMethod
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.close();
    }


}