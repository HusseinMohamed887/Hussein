package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class myACCOUNTPage extends BasePage{
    private WebDriver driver;
    private By MyAccountPhrase = By.className("page-heading");
    private By WomenBox = By.className("sf-with-ul");
    private By Blouses =By.xpath(".//a[text()='Blouses']");
    private By Orders = By.xpath(".//a[@title='Orders']");
    private By signOut = By.xpath(".//a[@class='logout']");



    public myACCOUNTPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getText(){
        return driver.findElement(MyAccountPhrase).getText();
    }
    public void hoverOverWomen(int index){
        WebElement womenCategory = driver.findElements(WomenBox).get(index);
        Actions actions = new Actions(driver);
        actions.moveToElement(womenCategory).perform();

    }
        public blousesPage SelectBlouses(){

        driver.findElement(Blouses).click();
        return new blousesPage(driver);

        }
        public OrdersPage clickOrdersPage(){
        driver.findElement(Orders).click();
        return new OrdersPage(driver);
        }
        public HomePage clickSignOut(){
        driver.findElement(signOut).click();
        return new HomePage(driver);
        }
}
