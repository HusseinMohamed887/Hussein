package Pages.CheckOutSteps;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingCheckOutStep extends BasePage {
    private WebDriver driver;
    public ShippingCheckOutStep(WebDriver driver) {
        this.driver=driver;
    }
    private By proceedToPayment = By.name("processCarrier");
    private By AgreeToTermsCheckButton = By.id("cgv");
    public void agreetoTerms(){driver.findElement(AgreeToTermsCheckButton).click();}
    public PaymentCheckOutStep clickProceedToPayment(){
        driver.findElement(proceedToPayment).click();
        return new PaymentCheckOutStep(driver);
    }

}
