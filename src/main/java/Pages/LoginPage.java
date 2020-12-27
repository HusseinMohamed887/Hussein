package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.beans.Visibility;
import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage{
    private WebDriver driver;
    private By creatNewEmailBar=By.id("email_create");
    private By createNewEmailButton=By.id("SubmitCreate");
    private By TextVerify = By.cssSelector("#center_column h1");
    private By emailBar = By.id("email");
    private By passwordBar = By.id("passwd");
    private By loginButton = By.id("SubmitLogin");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public String getLoginPageText(){

       String textVerify= driver.findElement(TextVerify).getText();
       return textVerify;
    }
    public void setEmailForNewAccount(String emailAddress){
        driver.findElement(creatNewEmailBar).sendKeys(emailAddress);
    }
    public accountCreationPage clickCreateNewAccount(){
        driver.findElement(createNewEmailButton).click();
        return new accountCreationPage(driver);
    }
    public void setEmailForLogin(String emailAddress){

        driver.findElement((emailBar)).sendKeys(emailAddress);
    }
    public void setPasswordForLogin(String password){
        driver.findElement((passwordBar)).sendKeys(password);
    }
    public myACCOUNTPage clickOnLoginButtion(){
        driver.findElement(loginButton).click();
        return new myACCOUNTPage(driver);
    }

}
