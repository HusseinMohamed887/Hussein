package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class accountCreationPage extends BasePage {

    private WebDriver driver;

    public accountCreationPage(WebDriver driver) {
        this.driver = driver;
    }
    private By mrRadioButton = By.id("id_gender1");
    private By mrsRadioButton = By.id("id_gender2");
    private By firstNameLink = By.id("customer_firstname");
    private By lastNameLink = By.id("customer_lastname");
    private By passWordLink = By.id("passwd");
    private By AddionalInfo = By.id("other");
    private By dayDropDown = By.id("days");
    private By monthDropDown = By.id("months");
    private By yearDropDown = By.id("years");
    private By addressFirstName = By.id("firstname");
    private By addressLastNameLink = By.id("lastname");
    private By addressCompanyLink = By.id("company");
    private By address1Link = By.id("address1");
    private By cityLink = By.id("city");
    private By stateDropDown = By.id("id_state");
    private By countryDropDown = By.id("id_country");
    private By mobileNumLink = By.id("phone_mobile");
    private By aliasAddressLink = By.id("alias");
    private By postCodelink=By.id("postcode");

    public void setGender(String gender) {

        if (gender == "male") {
            driver.findElement(mrRadioButton).click();
        } else if (gender == "female") {
            driver.findElement(mrsRadioButton).click();
        }

    }

    public void setFirstname(String firstname) {
        driver.findElement(firstNameLink).sendKeys(firstname);
    }

    public void setLastname(String lastname) {
        driver.findElement(lastNameLink).sendKeys(lastname);
    }

    public void setPassword(String password) {
        driver.findElement(passWordLink).sendKeys(password);
    }

    public void setAddressFirstName(String addressfirstname) {
        driver.findElement(addressFirstName).sendKeys(addressfirstname);
    }

    public void setAddressLastName(String addresslastname) {
        driver.findElement(addressLastNameLink).sendKeys(addresslastname);
    }


    public void setAddressCompany(String addressCompany) {
        driver.findElement(addressCompanyLink).sendKeys(addressCompany);

    }
    public void setAddionalInfo(String text){
        driver.findElement(AddionalInfo).sendKeys(text);
    }
    public void setPostCodelink(String code){
        driver.findElement(postCodelink).sendKeys(code);
    }

    public void setAddress1(String address1) {
        driver.findElement(address1Link).sendKeys(address1);
    }

    public void setCity(String city) {
        driver.findElement(cityLink).sendKeys(city);
    }

    public void setMobileNum(String mobileNum) {
        driver.findElement(mobileNumLink).sendKeys(mobileNum);
    }

    public void setAliasAddress(String aliasAddress) {
        driver.findElement(aliasAddressLink).sendKeys(aliasAddress);
    }
    public myACCOUNTPage clickRegisterbutton(){
        driver.findElement(By.id("submitAccount")).click();
        return new myACCOUNTPage(driver);
    }


    private Select FindDay(){
        return new Select(driver.findElement(dayDropDown));
    }
    private Select FindMonth(){
        return new Select(driver.findElement(monthDropDown));
    }
    private Select FindYear(){
        return new Select(driver.findElement(yearDropDown));
    }
    private Select FindState(){
        return new Select(driver.findElement(stateDropDown));
    }
    private Select FindCountry(){
        return new Select(driver.findElement(countryDropDown));
    }
    public void SelectDay(int index){
        FindDay().selectByIndex(index);
    }
    public void SelectMonth(int index){
        FindMonth().selectByIndex(index);
    }
    public void SelectYear(int index){
        FindYear().selectByIndex(index);
    }
    public void SelectState(int index){
        FindState().selectByIndex(index);
    }
    public void SelectCountry(int index){
        FindCountry().selectByIndex(index);
    }


}
