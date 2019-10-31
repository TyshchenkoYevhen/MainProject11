package ShowDressBanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.xpath;

public class ShowBanner {
    private static final String MAIN_PAGE_URL = "http://automationpractice.com/index.php?id_category=9&controller=category";
    private WebDriver driver;

    private By dressButton = By.xpath("(//a[contains(text(),'Dresses')])[5]");
    private By chooseCasual = By.xpath("//a[contains(text(),'Casual Dresses')])[3]"); //
    private By banner = By.xpath("//div[@class='content_scene_cat_bg']");

    public ShowBanner (WebDriver driver) {
        this.driver = driver;
    }

    public ShowBanner openMainPage (){
        this.driver.navigate().to(MAIN_PAGE_URL);
        return this;
    }

    public ShowBanner findBanner () {
        this.driver.findElement(banner).isDisplayed();
        return this;
    }
}
