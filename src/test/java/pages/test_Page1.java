package pages;

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

    @FindBy (xpath = "//a[@id='proceed-link']")
    public WebElement proceedLink;

    @FindBy (xpath = "//a[@id='proceed-link']")
    public WebElement proceedLink;

    @FindBy (xpath = "//a[@id='proceed-link']")
    public WebElement proceedLink;

    @FindBy (xpath = "//a[@id='proceed-link']")
    public WebElement proceedLink;

    @FindBy (xpath = "//a[@id='proceed-link']")
    public WebElement proceedLink;

    @FindBy (xpath = "//a[@id='proceed-link']")
    public WebElement proceedLink;

    @FindBy (xpath = "//a[@id='proceed-link']")
    public WebElement proceedLink;

    @FindBy (xpath = "//a[@id='proceed-link']")
    public WebElement proceedLink;
    @FindBy (xpath = "//a[@id='proceed-link']")
    public WebElement proceedLink;




}
