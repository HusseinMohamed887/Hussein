package FollowUpCheckOutProcedure;

import Base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FollowUpCheckOutUsingBankWire extends BaseTest {
    @Test
    public void FollowUp(){
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
        String text3 =BlousesPage.getProductName();
        var resultedProductPage =BlousesPage.clickReusultedProduct();
        var result =resultedProductPage.getProductName();
        assertEquals(text3,"","error");
        resultedProductPage.clickAddToCart();
        var checkOutPage = resultedProductPage.proceedToCheckOut();
        var Step1 = checkOutPage.clickProceedToAddress();
        var Step2 = Step1.clickProceedToShipping();
        Step2.agreetoTerms();
        var Step3 = Step2.clickProceedToPayment();
        var chooseBankWireOption = Step3.clickBandWireMethod();
        var OrderConfirmationPage = chooseBankWireOption.clickConfirmMyOrder();
        String textForConfirmation = OrderConfirmationPage.getConfimrationPhraseText();
        assertEquals(textForConfirmation,"Your order on My Store is complete.","Error");





    }
}

