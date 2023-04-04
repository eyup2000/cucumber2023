package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class locaterBulma {

    public locaterBulma(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath="(//a[@class='newbtn orange'])[1]")
    public WebElement uyeOl;

    @FindBy(xpath = "(//a[@id='hero__img-button'])[1]")
    public WebElement aileUyeOl;

    @FindBy(xpath = "(//span[@class='php-template xml'])[38]")
    public WebElement assertEtme;

    @FindBy(xpath = "(//a[@id='hero__img-button'])[2]")
    public WebElement bakiciUyeOl;
}
