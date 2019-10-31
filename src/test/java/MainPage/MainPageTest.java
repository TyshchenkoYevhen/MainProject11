package MainPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class MainPageTest {

    private WebDriver driver;
    private MainPage mainPage;
    private static final String PATH_TO_CHROMEDRIVER = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";


    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", PATH_TO_CHROMEDRIVER);
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mainPage = new MainPage(this.driver);
    }

    @Test
    public void testOpenMainPage() {
        mainPage.openMainPage();
    }

    @Test
    public void DressButton () {
        mainPage.openMainPage();
        mainPage.findSearchField();
    }


    @AfterMethod
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}