package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class reservationsPage {
    public reservationsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[@href='/admin/UserAdmin']")
    public WebElement userList;

    @FindBy (xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addUser;

    @FindBy (xpath = "//input[@id='UserName']")
    public WebElement userName;

    @FindBy (xpath = "//input[@id='txtPassword']")
    public WebElement password;

    @FindBy (xpath = "//input[@id='Email']")
    public WebElement email;

    @FindBy (xpath = "//input[@id='NameSurname']")
    public WebElement Fullname;

    @FindBy (xpath = "//input[@id='PhoneNo']")
    public WebElement phoneNo;

    @FindBy (xpath = "//input[@id='SSN']")
    public WebElement socialSecurityNumber;

    @FindBy (xpath = "//input[@id='DrivingLicense']")
    public WebElement drivingLicense;

    @FindBy (xpath = "//select[@id='IDCountry']")
    public WebElement country;

    @FindBy (xpath = "//input[@id='Address']")
    public WebElement address;

    @FindBy (xpath = "//input[@id='BirthDate']")
    public WebElement dataOfBirth;

    @FindBy (xpath = "(//input[@type='text'])[9]")
    public WebElement workingSector;

    @FindBy (xpath = "(//select[@id='IDRole'])")
    public WebElement role;

    @FindBy (xpath = "(//input[@id='Approved'])[1]")
    public WebElement yesButton;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement saveButton;


}
