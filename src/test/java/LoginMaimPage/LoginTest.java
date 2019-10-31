package LoginMaimPage;

import MainPage.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class LoginTest {

    private WebDriver driver;
    private Login login;
    private static final String PATH_TO_CHROMEDRIVER = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";


    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", PATH_TO_CHROMEDRIVER);
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        login = new Login(this.driver);
    }

    @Test(dataProvider = "getCreds")
    public void enterMail(String mail, String pass){
        login.openMainPage();
        login.signIn();
        login.enterMail(mail);
        login.enterPass(pass);
        login.Logining();
    }

    @DataProvider
    public Object[][] getCreds() {
        return new Object[][] {
               {"login1", "password2"},
                {"login2", "password2"},
                {"login3", "password3"},
                {"tyschenko.evgeniy57@gmail.com", "12345"}
        };
    }
    
    @AfterMethod
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.close();
    }


}
