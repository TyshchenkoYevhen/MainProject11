package HomeWork10;

import HomeWork10.Builder.CreateAccount;
import HomeWork10.WebDrivers.DriverType;
import HomeWork10.WebDrivers.WebDriverFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class TestCreateAccount {

    private WebDriver driver;
    private CreateAccount account;


    @Before
    public void settings() {
        System.setProperty("webdriver.chrome.driver", "d:\\install\\chromedriver_win32\\chromedriver.exe");
        driver = WebDriverFactory.getDriver(DriverType.CHROME);
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        account = new CreateAccount(this.driver);
        //    PageFactory.initElements(driver, this);
    }

    @Test
    public void createRegistration () {

        account.openMainPage();
        account.openRegistetionForm();
        account.enterEmail();
        account.createAccount();
        account.chooseGender ();
        account.enterFirstName ();
        account.enterLastName ();
        account.enterEmailAgain ();
        account.firstName();
        account.lastName();
        account.company();
        account.address();
        account.city();
        account.zipPostal();
        account.mobile();
        account.aliasForFutureReference();
        account.registration();
        Assert.assertTrue(
                account.error());
    }

    @After
    public void cleanup() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
