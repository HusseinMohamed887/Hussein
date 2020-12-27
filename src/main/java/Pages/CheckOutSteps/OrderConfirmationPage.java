package Pages.CheckOutSteps;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class OrderConfirmationPage extends BasePage {
    private WebDriver driver;
    public OrderConfirmationPage(WebDriver driver) {
        this.driver=driver;
    }
    private By confirmationPhrase = By.xpath(".//strong[text()='Your order on My Store is complete.']");

    public String getConfimrationPhraseText(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
         return driver.findElement(confirmationPhrase).getText();
    }
}
