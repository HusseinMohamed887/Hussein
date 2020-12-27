package SelectBloses;

import Base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BlousesTest extends BaseTest {
    @Test
    public void selectBlousesTest(){
        var LoginPage = homePage.clickLoginPage();
        LoginPage.setEmailForLogin("power5553.hm@gmail.com");

        LoginPage.setPasswordForLogin("12345688");
        var MyAccountPage = LoginPage.clickOnLoginButtion();
        String text =MyAccountPage.getText();
        assertEquals(text,"MY ACCOUNT","error");
        MyAccountPage.hoverOverWomen(0);
        var BlousesPage =MyAccountPage.SelectBlouses();
        String text2 = BlousesPage.getText();
        assertEquals(text2,"Blouses","error");

    }
}
