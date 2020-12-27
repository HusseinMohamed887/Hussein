package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public void clickLink(String linkText){
        driver.findElement(By.className(linkText)).click();

    }
    public LoginPage clickLoginPage(){
        clickLink("login");
        return   new LoginPage(driver);

    }
}
