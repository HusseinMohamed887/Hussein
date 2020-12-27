package LoginAsNewUser;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.myACCOUNTPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NewUserLogin extends BaseTest {

    @Test(dataProvider = "loginData")
    public void accountLogin(String email,String password){
        LoginPage loginPage = homePage.clickLoginPage();
        loginPage.setEmailForLogin(email);
        loginPage.setPasswordForLogin(password);
        myACCOUNTPage MyAccountPage = loginPage.clickOnLoginButtion();
        String text =MyAccountPage.getText();
        assertEquals(text,"MY ACCOUNT","error");
        MyAccountPage.clickSignOut();

    }

    @DataProvider
    public Object[][] loginData(){
        Object[][] data = new Object[2][2];
        data[0][0]="power5553.hm@gmail.com"; data[0][1]="12345688";
        data[1][0]="power55535.hm@gmail.com"; data[1][1]="123456";

        return data;
    }
}

