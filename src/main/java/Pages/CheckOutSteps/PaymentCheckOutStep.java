package Pages.CheckOutSteps;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentCheckOutStep extends BasePage {
    private WebDriver driver;
    public PaymentCheckOutStep(WebDriver driver) {
        this.driver=driver;
    }
    private By payByWireMethod = By.className("bankwire");
    public PayByBankWireConfirmationPage clickBandWireMethod(){
        driver.findElement(payByWireMethod).click();
        return new PayByBankWireConfirmationPage(driver);
    }
}
