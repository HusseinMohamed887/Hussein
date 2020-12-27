package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrdersPage extends BasePage{
    private WebDriver driver;
    public OrdersPage(WebDriver driver){
        this.driver=driver;
    }
    private By ordersRefrence = By.className("color-myaccount");
    public int OrdersCount (){
        int orderSize =driver.findElements(ordersRefrence).size();
        return orderSize;
    }

}
