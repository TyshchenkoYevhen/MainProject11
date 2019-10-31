package LoginMaimPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

        private static final String MAIN_PAGE_URL = "http://automationpractice.com";
        private WebDriver driver;

       private By signIn = By.xpath("//a[contains(text(),'Sign in')]");;
        private By mail = By.xpath("//input[@id='email']");
        private By login = By.xpath("//form[@id='login_form']/div/div");
        private By psss = By.xpath("//input[@id='passwd']");
        private By signInButton = By.xpath("//button[@id='SubmitLogin']/span");

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public Login openMainPage() {
            this.driver.navigate().to(MAIN_PAGE_URL);
            return this;
        }

        public Login signIn (){
            this.driver.findElement(signIn).click();
            return this;
        }

        public void enterMail(String s){
        this.driver.findElement(mail).sendKeys(s);
        }

        public void enterPass(String s){
        this.driver.findElement(psss).sendKeys(s);
        }

        public Login Logining () {
            this.driver.findElement(signInButton).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return this;
        }
}
