package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.HesapCerate;
import utilities.Driver;

public class Alıştırma06 {

    HesapCerate hesapCerate = new HesapCerate();
    @Given("Web sayfasına git")
    public void web_sayfasına_git() {

        Driver.getDriver().get("https://www.automationexercise.com/");
    }
    @Given("login button click yap")
    public void login_button_click_yap() {

        hesapCerate.loginButton.click();

    }
    @Given("datalari gir {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void datalari_gir(String name, String email, String password, String firstName, String lastName, String company, String address, String addres2, String state, String city, String zipcode, String number) {

        hesapCerate.name.sendKeys(name);

        hesapCerate.email.sendKeys(email);

        hesapCerate.sigupButton.click();

        hesapCerate.mrButton.click();

        hesapCerate.password.sendKeys(password);

        Select select = new Select(hesapCerate.day);
        select.selectByIndex(16);

        Select select2 = new Select(hesapCerate.month);
        select2.selectByIndex(10);

        Select select3 = new Select(hesapCerate.years);
        select3.selectByIndex(23);

        hesapCerate.buuton1.click();

        hesapCerate.button2.click();

        hesapCerate.firstName.sendKeys(firstName);

        hesapCerate.lastName.sendKeys(lastName);

        hesapCerate.company.sendKeys(company);

        hesapCerate.address1.sendKeys(address);

        hesapCerate.address2.sendKeys(addres2);

        Select select5 = new Select(hesapCerate.conuntry);
        select5.selectByIndex(6);

        hesapCerate.state.sendKeys(state);

        hesapCerate.city.sendKeys(city);

        hesapCerate.zipcode.sendKeys(zipcode);

        hesapCerate.phoneNumber.sendKeys(number);

        hesapCerate.createButton.click();


        Assert.assertTrue(hesapCerate.massageAssert.getText().contains("ACCOUNT CREATED!"));

        hesapCerate.loginButton.click();

        hesapCerate.delete.click();

    }
    @Given("cikan mesajı verfy et")
    public void cikan_mesajı_verfy_et() {


    }
}
