package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class resultedProduct extends BasePage{
    private WebDriver driver;
    public resultedProduct(WebDriver driver) {
        this.driver = driver;
    }
    private By itemName = By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/h1");
    private By addToCart = By.cssSelector("#add_to_cart button");
    private By proceedToCheckOut = By.cssSelector("#layer_cart a");
    public String getProductName() {
         WebDriverWait wait = new WebDriverWait(driver,3);
         wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(itemName),"Blouse"));
      //  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return driver.findElement(itemName).getText();

    }
        public void clickAddToCart(){
            driver.findElement(addToCart).click();
        }

        public proceedToCheckOutPage proceedToCheckOut(){

         driver.findElement(proceedToCheckOut).click();
         return new proceedToCheckOutPage(driver);

        }


}
