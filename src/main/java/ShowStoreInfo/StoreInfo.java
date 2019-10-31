package ShowStoreInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StoreInfo {
    private static final String MAIN_PAGE_URL = "http://automationpractice.com";
    private WebDriver driver;

    private By showInfo = By.xpath("//h4[contains(.,'Store information')]");
    private By showCategories = By.xpath("//h4[contains(.,'Categories')]");
    private By showInformation = By.xpath("xpath=//h4[contains(.,'Information')]");
    private By showMyAccount = By.xpath("//a[contains(text(),'My account')]");


    public StoreInfo (WebDriver driver) {
        this.driver = driver;
    }

    public StoreInfo openMainPage() {
        this.driver.navigate().to(MAIN_PAGE_URL);
        return this;
    }

    public StoreInfo displayBlockStoreInfo () {
        this.driver.findElement(showInfo).isDisplayed();
        return this;
    }

    public StoreInfo displayCategories () {
        this.driver.findElement(showCategories).isDisplayed();
        return this;
    }

    public StoreInfo displayInformation () {
        this.driver.findElement(showInformation).isDisplayed();
        return this;
    }

    public StoreInfo displayMyAccount () {
        this.driver.findElement(showMyAccount).isDisplayed();
        return this;
    }
}
