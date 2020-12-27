package AccontCreation;



import Base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AccontCreation extends BaseTest {
    @Test
    public void accountCreation(){
        var loginPage = homePage.clickLoginPage();
        loginPage.getLoginPageText();
        loginPage.setEmailForNewAccount("power55h5rr3d54.hm@gmail.com");
        var creationPage=loginPage.clickCreateNewAccount();
        creationPage.setGender("male");
        creationPage.setFirstname("hussein");
        creationPage.setLastname("mohamed");
        creationPage.setPassword("12345688");
        creationPage.setAddressFirstName("hussein");
        creationPage.setAddressLastName("mohamed");
        creationPage.setAddressCompany("company");
        creationPage.setAddress1("21 aaddress st,mohamed");
        creationPage.setCity("cairo");
        creationPage.setMobileNum("011112255");
        creationPage.setAliasAddress("aliasAddress");
        creationPage.SelectDay(1);
        creationPage.SelectMonth(1);
        creationPage.SelectYear(1);
        creationPage.SelectCountry(1);
        creationPage.SelectState(1);
        creationPage.setPostCodelink("12345");
        creationPage.setAddionalInfo("mobile no 15454");
        var MyAccountPage =creationPage.clickRegisterbutton();
        String text =MyAccountPage.getText();
        assertEquals(text,"MY ACCOUNT","error");

    }
}

