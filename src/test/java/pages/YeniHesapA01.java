package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YeniHesapA01 {
    public YeniHesapA01(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginClick;

    @FindBy(name = "name")
    public WebElement name;

    @FindBy(xpath = "(//input[@type='email'])[2]")
    public WebElement email;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signup;

    @FindBy(id = "id_gender1")
    public WebElement  titleClick;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement  sifre;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement  days;

    @FindBy(xpath = "//select[@id='months']")
    public WebElement  month;

    @FindBy(xpath = "//select[@id='years']")
    public WebElement  years;

    @FindBy(xpath = "//input[@id='optin']")
    public WebElement  buttonClick;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement  firstName;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement  lastName;

    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement  company;

    @FindBy(xpath = "//input[@id='address1']")
    public WebElement  adress1;

    @FindBy(xpath = "//input[@id='address2']")
    public WebElement  adress2;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement  country;

    @FindBy(xpath = "//input[@id='state']")
    public WebElement  state;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement  city;

    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement  zipcode;

    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement  numberPhone;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement  createButtonClick;

    @FindBy(xpath = "//b")
    public WebElement assertMessage;
}
