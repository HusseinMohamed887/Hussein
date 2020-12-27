package Pages.CheckOutSteps;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressCheckOutStep extends BasePage {
    private WebDriver driver;
    private By ProceedtoShipping = By.name("processAddress");
    public AddressCheckOutStep(WebDriver driver) {
        this.driver=driver;
    }
    public ShippingCheckOutStep clickProceedToShipping(){
        driver.findElement(ProceedtoShipping).click();
        return new ShippingCheckOutStep(driver);
    }

}
