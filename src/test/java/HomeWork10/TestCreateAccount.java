package HomeWork10;

import HomeWork10.Builder.Account;
import HomeWork10.Builder.CreateAccount;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class TestCreateAccount {

    private WebDriver driver;
    private CreateAccount account;


    @Before
    public void settings() {
        System.setProperty("webdriver.chrome.driver", "d:\\install\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        PageFactory.initElements(this.driver, this);
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        account = new CreateAccount(this.driver);
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
