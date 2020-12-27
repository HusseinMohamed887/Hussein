package Pages;

import Pages.CheckOutSteps.AddressCheckOutStep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class proceedToCheckOutPage extends BasePage{
    private WebDriver driver;
    private By ProceedToCheckoutButton = By.xpath("//a[contains(@href,'step=1')]");

    public proceedToCheckOutPage(WebDriver driver) {
        this.driver=driver;
    }
    public AddressCheckOutStep clickProceedToAddress(){
        driver.findElement(ProceedToCheckoutButton).click();
        return new AddressCheckOutStep(driver);
    }
}
