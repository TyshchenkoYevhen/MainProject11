package HomeWork10.Builder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {

    private static final String MAIN_PAGE_URL ="http://automationpractice.com";
    private WebDriver driver;

    private Account account;

    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?controller=my-account']")
    private WebElement signIn;

    @FindBy(xpath = "//input[@id='email_create']")
    private WebElement emailField;

    @FindBy (xpath = "//button[@id='SubmitCreate']/span")
    private WebElement accountButton;

    @FindBy (xpath = "//input[@id='id_gender1']")
    private WebElement gender;

    @FindBy (xpath = "//input[@id='customer_firstname']")
    private WebElement custFirstName;

    @FindBy (xpath = "//input[@id='customer_lastname']")
    private WebElement custLastName;

    @FindBy (xpath = "//input[@id='email']")
    private WebElement emailRegistr;

    @FindBy (xpath = "//input[@id='passwd']")
    private WebElement pass;

    @FindBy (xpath = "//input[@id='firstname']")
    private WebElement firstName;

    @FindBy (xpath = "//input[@id='lastname']")
    private WebElement lastName;

    @FindBy (xpath = "//input[@id='company']")
    private WebElement companyName;

    @FindBy (xpath = "//input[@id='address1']")
    private WebElement addressData;

    @FindBy (xpath = "//input[@id='city']" )
    private WebElement cityName;

    @FindBy (xpath = "//input[@id='city']")
    private WebElement postCode;

    @FindBy (xpath = "//input[@id='phone_mobile']")
    private WebElement phoneMobile;

    @FindBy (xpath = "//input[@id='alias']")
    private WebElement alias;

    @FindBy (xpath = "//button[@id='submitAccount']/span")
    private WebElement registr;

    @FindBy (xpath = "//div[@id='center_column']/div")
    private WebElement alertMes;

    public CreateAccount(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

        account = new Account.Builder()
                .withCustFirstName("Frank")
                .withCustLastName("Lampard")
                .withEmailRegistr("tyshchenko.yevhen57@gmail.com")
                .withFirstName("Frank")
                .withLastName("Lampard")
                .withCompanyName("CT")
                .withAddress("address")
                .withCityName("Kiew")
                .withPostCode("07400")
                .withPhoneMobile("80670000000")
                .withAlias("alias")
                .build();
    }

//    public CreateAccount(WebDriver driver) {
//        this.driver = driver;
//    }

    public CreateAccount openMainPage(){
        this.driver.navigate().to(MAIN_PAGE_URL);
        return this;
    }

    public CreateAccount openRegistetionForm(){
        signIn.click();
        return this;
    }


    public void enterEmail () {
        emailField.sendKeys("tyschenko.evgeniy58@gmail.com");
    }

    public CreateAccount createAccount (){
        accountButton.click();
        return this;

    }
    public CreateAccount chooseGender () {
        gender.click();
        return this;
    }
    public void enterFirstName () {
        custFirstName.sendKeys(account.getCustFirstName());

    }
    public void enterLastName () {
        custLastName.sendKeys(account.getCustLastName());

    }
    public void enterEmailAgain () {
        emailRegistr.sendKeys(account.getEmailRegistr());

    }
    public void firstName (){
        firstName.sendKeys(account.getFirstName());

    }
    public void lastName (){
        lastName.sendKeys(account.getLastNAme());
    }

    public void company (){
        companyName.sendKeys(account.getCompanyName());

    }
    public void address (){
        addressData.sendKeys(account.getAddress());

    }
    public void city (){
        cityName.sendKeys(account.getCityName());

    }
    public void zipPostal (){
        postCode.sendKeys(account.getPostCode());

    }
    public void mobile (){
        phoneMobile.sendKeys(account.getPhoneMobile());

    }
    public void aliasForFutureReference (){
        alias.sendKeys(account.getAlias());

    }
    public CreateAccount registration (){
        registr.click();
        return this;
    }

    public boolean error (){
        return alertMes.isDisplayed();
    }
}
