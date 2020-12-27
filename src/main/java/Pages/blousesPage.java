package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class blousesPage extends BasePage {
    private WebDriver driver;
    private By categoryText = By.className("category-name");
    private By blouseProduct = By.className("product_img_link");
    public blousesPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getText(){
        return  driver.findElement(categoryText).getText();
    }
    public resultedProduct clickReusultedProduct(){
        driver.findElement(blouseProduct).click();
        return new resultedProduct(driver);
    }
    public String getProductName(){
       return driver.findElement(blouseProduct).getText();
    }
}
