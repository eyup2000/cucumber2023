package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.account_create;
import utilities.ConfigReader;
import utilities.Driver;

public class Alistirma04 {

    account_create account_create = new account_create();


    @Given("browsera git")
    public void browsera_git() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url_alistirma"));


    }
    @Given("login buttonuna bas")
    public void login_buttonuna_bas() {
        account_create.loginButton.click();


    }
    @Given("name {string} ve email {string} gir")
    public void name_ve_email_gir(String name, String email) {
        account_create.name.sendKeys(name);
        account_create.email.sendKeys(email+ Keys.ENTER);



    }
    @Given("signup click et")
    public void signup_click_et() {



    }
    @Given("gerekli yerleri gir {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void gerekli_yerleri_gir(String password, String firstname, String lastName, String company, String adress1, String address2, String state, String city, String zipcode, String mobilNumber) {
        account_create.mrClick.click();

        account_create.password.sendKeys(password);

        Select days = new Select(account_create.days);
        days.selectByIndex(14);

        Select month = new Select(account_create.month);
        month.selectByIndex(5);

        Select year = new Select(account_create.year);
        year.selectByIndex(30);

        account_create.clickButton.click();

        account_create.firstName.sendKeys(firstname);

        account_create.lastName.sendKeys(lastName);

        account_create.company.sendKeys(company);

        account_create.address1.sendKeys(adress1);

        account_create.address2.sendKeys(address2);

        Select country = new Select(account_create.country);
        country.selectByIndex(5);

        account_create.state.sendKeys(state);

        account_create.city.sendKeys(city);

        account_create.zipcode.sendKeys(zipcode);

        account_create.mobileNumber.sendKeys(mobilNumber);


    }
    @Given("createButton click et")
    public void create_button_click_et() {
        account_create.createButton.click();


    }
    @Given("ACCOUNT CREATED! yazısını verify et")
    public void account_created_yazısını_verify_et() {
        Assert.assertTrue(account_create.message.isDisplayed());


    }
    @Then("browser kapatt")
    public void browser_kapatt() {
        Driver.closeDriver();


    }

}
