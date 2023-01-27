package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class otelPage {
    public otelPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "Hotel List")
    public WebElement hotelListButton;

    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addHotel;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement code;

    @FindBy(xpath = "//input[@id='Name']")
    public WebElement name;

    @FindBy(xpath = "//input[@id='Address']")
    public WebElement adress;

    @FindBy(xpath = "//input[@id='Phone']")
    public WebElement phone;

    @FindBy(xpath = "//input[@id='Email']")
    public WebElement email;

    @FindBy(xpath = "//select[@id='IDGroup']")
    public WebElement idGroup;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement saveButton;

    @FindBy(className = "bootbox-body")
    public WebElement massage;

    @FindBy(xpath = "(//button[@type='button'])[6]")
    public WebElement okButton;



}
