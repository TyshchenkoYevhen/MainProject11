package AddFoodToCart;

import MainPage.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.xpath;

public class AddFood {
    private static final String MAIN_PAGE_URL = "http://automationpractice.com";
    private WebDriver driver;

    private By searchField = By.xpath("//input[@id='search_query_top']");
    private By searchBlouse = xpath("//input[@id='search_query_top']");
    private By execSearchGoods = By.cssSelector(".button-search");
    private By list = xpath("//li[@id='list']/a/i");
    private By chooseGoods = xpath("//span[contains(.,'Add to cart')]");
    private By ProcButton = xpath("//span[contains(.,'Proceed to checkout')]"); //span[contains(.,'Proceed to checkout')]
    private By addButton = xpath("//a[@id='cart_quantity_up_2_7_0_0']/span/i");
    private By total = xpath("//td[@id='total_product']");
    private By totalProduct = xpath("//span[@id='total_product_price_2_7_0']");

    public AddFood(WebDriver driver) {
        this.driver = driver;
    }

    public AddFood openMainPage() {
        this.driver.navigate().to(MAIN_PAGE_URL);
        return this;
    }

    public AddFood findSearchField (){
        this.driver.findElement(searchField).click();
        return this;
    }

        public void enterBlouse () {

            this.driver.findElement(searchBlouse).sendKeys("Blouse");
        }

        public AddFood execSearch () {
            this.driver.findElement(execSearchGoods).click();
            return this;
        }

        public AddFood switchList () {
            this.driver.findElement(list).click();
            return this;
        }

        public AddFood addToCart () {
            this.driver.findElement(chooseGoods).click();
            return this;
        }

        public AddFood procesedToCheckout () {
            this.driver.findElement(ProcButton).click();
            return this;
        }

        public AddFood increaseQuantity () {
            this.driver.findElement(total).getText();
            this.driver.findElement(addButton).click();
            new WebDriverWait(driver, 30).until(ExpectedConditions.textToBePresentInElementLocated(xpath("//td[@id='total_product']"), "$54.00"));
            return this;
        }

        public String checkTotalProduct() {
        return  this.driver.findElement(totalProduct).getText();
    }
}

