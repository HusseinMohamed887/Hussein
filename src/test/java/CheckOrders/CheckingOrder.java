package CheckOrders;

import Base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CheckingOrder extends BaseTest {
    @Test
    public void CheckingOrders(){
        var LoginPage = homePage.clickLoginPage();

        LoginPage.setEmailForLogin("power5553.hm@gmail.com");

        LoginPage.setPasswordForLogin("12345688");
        var MyAccountPage = LoginPage.clickOnLoginButtion();
        String text =MyAccountPage.getText();
        assertEquals(text,"MY ACCOUNT","error");
        var OrdersPage = MyAccountPage.clickOrdersPage();
        int count =OrdersPage.OrdersCount();
        System.out.println(count);


    }
}

