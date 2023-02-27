package pages;

import io.cucumber.java.ja.前提;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class test_Page1 {
  public   test_Page1(){
        PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy (xpath = "//button[@id='details-button']")
    public WebElement advancedLink;

    @FindBy (xpath = "//a[@id='proceed-link']")
    public WebElement proceedLink;

    @FindBy(xpath = "(//a[@class='nav-link'])[6]")
    public WebElement loginButton;

    @FindBy (xpath = "(//input[@id='UserName'])")
    public WebElement userName;

    @FindBy (xpath = "(//input[@id='Password'])")
    public WebElement password;

    @FindBy (xpath = "(//input[@id='btnSubmit'])")
    public WebElement login;

    @FindBy (xpath = "//input[@name='UserName']")
    public WebElement usernamee;

    @FindBy (xpath = "//input[@name='Password']")
    public WebElement passwordd;

    @FindBy (xpath = "//input[@name='Email']")
    public WebElement email;

    @FindBy (xpath = "//input[@name='NameSurname']")
    public WebElement fullname;

    @FindBy (xpath = "//input[@name='PhoneNo']")
    public WebElement phoneNo;

    @FindBy (xpath = "//input[@name='SSN']")
    public WebElement ssn;

    @FindBy (xpath = "//input[@name='DrivingLicense']")
    public WebElement driving ;

    @FindBy (xpath = "//select[@id='IDCountry']")
    public WebElement country;

    @FindBy (xpath = "//input[@id='Address']")
    public WebElement adress;

    @FindBy(xpath = "//input[@id='WorkingSector']")
    public WebElement working;

    @FindBy (xpath = "//select[@id='IDRole']")
    public WebElement role;

    @FindBy (xpath = "//input[@id='Approved']")
    public WebElement yesButton;

    @FindBy (xpath = "//button[@id='btnSubmit']")
    public WebElement saveButton;

    @FindBy(css = "span.hidden-480")
  public WebElement addUser;

    @FindBy (xpath = "//input[@id='BirthDate']")
  public WebElement date;

    @FindBy(xpath = "//td[@class='day']")
  public WebElement tarihSeçme;

    @FindBy(css = "//div[@class='bootbox-body']")
  public WebElement messagee;

    @FindBy(xpath = "(//button[@type='button'])[7]")
    public WebElement okButton;






}
