package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class account_create {
    public account_create(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//a)[5]")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement name;

    @FindBy(xpath = "(//input[@type='email'])[2]")
    public WebElement email;

    @FindBy(xpath = "(//div[@class='radio'])[1]")
    public WebElement mrClick;

    @FindBy(xpath = "(//input[@class='form-control'])[3]")
    public WebElement password;

    @FindBy(xpath = "(//select[@class='form-control'])[1]")
    public WebElement days;

    @FindBy(xpath = "(//select[@class='form-control'])[2]")
    public WebElement month;

    @FindBy(xpath = "(//select[@class='form-control'])[3]")
    public WebElement year;

    @FindBy(xpath = "(//input[@type='checkbox'])")
    public WebElement clickButton;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement firstName;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement lastName;

    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement company;

    @FindBy(xpath = "(//input[@type='text'])[6]")
    public WebElement address1;

    @FindBy(xpath = "(//input[@type='text'])[7]")
    public WebElement address2;

    @FindBy(xpath = "(//input[@type='text'])[8]")
    public WebElement state;

    @FindBy(xpath = "(//input[@type='text'])[9]")
    public WebElement city;

    @FindBy(xpath = "(//input[@type='text'])[10]")
    public WebElement zipcode;

    @FindBy(xpath = "(//input[@type='text'])[11]")
    public WebElement mobileNumber;

    @FindBy(xpath = "(//select[@id='country'])")
    public WebElement country;

    @FindBy(xpath = "//b")
    public WebElement message;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement createButton;

}
