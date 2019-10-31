package MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    private static final String MAIN_PAGE_URL = "http://automationpractice.com";
    private WebDriver driver;

//    @FindBy (xpath = "//a[contains(text(),'Dresses')])[5]")
//    private WebElement dressButton;
    private By searchField = By.xpath("//input[@id='search_query_top']");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage openMainPage() {
        this.driver.navigate().to(MAIN_PAGE_URL);
        return this;
    }

    public MainPage findSearchField (){
        this.driver.findElement(searchField).click();
        return this;
    }
}