package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HesapCerate {


    public HesapCerate(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement name;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement email;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement sigupButton;

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement mrButton;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement day;

    @FindBy(xpath = "//select[@id='months']")
    public WebElement month;

    @FindBy(xpath = "//select[@id='years']")
    public WebElement years;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement buuton1;

    @FindBy(xpath = "//input[@id='optin']")
    public WebElement button2;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='company']")
    public WebElement company;

    @FindBy(xpath = "//input[@id='address1']")
    public WebElement address1;

    @FindBy(xpath = "//input[@id='address2']")
    public WebElement address2;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement conuntry;


    @FindBy(xpath = "//input[@id='state']")
    public WebElement state;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement city;

    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement zipcode;

    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement phoneNumber;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement createButton;

    @FindBy(xpath = "//b")
    public WebElement massageAssert;

   @FindBy(xpath = "//a[@href='/delete_account']")
   public WebElement delete;
//
//    @FindBy(xpath = "//input[@id='zipcode']")
//    public WebElement zipcode;
//
//    @FindBy(xpath = "//input[@id='zipcode']")
//    public WebElement zipcode;
//
//    @FindBy(xpath = "//input[@id='zipcode']")
//    public WebElement zipcode;

}
