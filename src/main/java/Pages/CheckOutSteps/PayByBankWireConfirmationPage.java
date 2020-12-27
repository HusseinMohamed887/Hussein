package Pages.CheckOutSteps;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class PayByBankWireConfirmationPage extends BasePage {
    private WebDriver driver;
    public PayByBankWireConfirmationPage(WebDriver driver) {
        this.driver=driver;
    }
    private By orderConfirmation = By.cssSelector("#cart_navigation button");
    public OrderConfirmationPage clickConfirmMyOrder(){
        driver.findElement(orderConfirmation).click();
        return new OrderConfirmationPage(driver);
    }

}
