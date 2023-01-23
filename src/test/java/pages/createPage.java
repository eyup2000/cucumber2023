package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class createPage {
    public createPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement NewButton;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement firstName;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement lastName;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement Position;

    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement Office;

    @FindBy(xpath = "(//input[@type='text'])[6]")
    public WebElement Extension;

    @FindBy(xpath = "(//input[@type='text'])[7]")
    public WebElement StartDate;

    @FindBy(xpath = "(//input[@type='text'])[8]")
    public WebElement Salary;

    @FindBy(xpath = "//button[@class='btn']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement search;

    @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement nameVerify;
}
