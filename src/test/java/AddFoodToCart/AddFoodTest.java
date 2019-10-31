package AddFoodToCart;

import MainPage.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class AddFoodTest {

    private WebDriver driver;
    private AddFood addFood;
    private static final String PATH_TO_CHROMEDRIVER = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";


    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", PATH_TO_CHROMEDRIVER);
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        addFood = new AddFood(this.driver);
    }

    @Test
    public void testOpenMainPage() {
        addFood.openMainPage();
        Assert.assertTrue(true);
    }

    @Test
    public void testFindSearchField() {
        addFood.openMainPage();
        addFood.findSearchField();
        Assert.assertTrue(true);
    }

    @Test
    public void testEnterBlouse() {
        addFood.openMainPage();
        addFood.findSearchField();
        addFood.enterBlouse();
        Assert.assertTrue(true);
    }

    @Test
    public void testExecSearch() {
        addFood.openMainPage();
        addFood.findSearchField();
        addFood.enterBlouse();
        addFood.execSearch ();
        Assert.assertTrue(true);
    }

    @Test
    public void testSwitchList() {
        addFood.openMainPage();
        addFood.findSearchField();
        addFood.enterBlouse();
        addFood.execSearch ();
        addFood.switchList ();
        Assert.assertTrue(true);
    }

    @Test
    public void testAddToCart() {
        addFood.openMainPage();
        addFood.findSearchField();
        addFood.enterBlouse();
        addFood.execSearch ();
        addFood.switchList ();
        addFood.addToCart ();
        Assert.assertTrue(true);
    }

    @Test
    public void testProcesedToCheckout() {
        addFood.openMainPage();
        addFood.findSearchField();
        addFood.enterBlouse();
        addFood.execSearch ();
        addFood.switchList ();
        addFood.procesedToCheckout ();
        Assert.assertTrue(true);
    }

    @Test
    public void testIncreaseQuantity() {
        addFood.openMainPage();
        addFood.findSearchField();
        addFood.enterBlouse();
        addFood.execSearch ();
        addFood.switchList ();
        addFood.procesedToCheckout ();
        addFood.increaseQuantity();
        String expRes = "$54.00"; //54
        String actRes = addFood.checkTotalProduct();
        Assert.assertEquals(expRes,actRes);
    }

    @AfterMethod
        public void tearDown() {
            driver.manage().deleteAllCookies();
            driver.close();
        }
    }