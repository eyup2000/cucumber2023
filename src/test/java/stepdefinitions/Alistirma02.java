package stepdefinitions;

import io.cucumber.java.an.E;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.DefaultPage;
import pages.LoginPages;
import pages.otelPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Alistirma02 {

    LoginPages loginPages = new LoginPages();
    DefaultPage defaultPage = new DefaultPage();
    otelPage otelPage = new otelPage();

    @Given("kullanıcı sayfaya gider")
    public void kullanıcı_sayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url_login"));
        try {
            loginPages.advancedLink.click();
            loginPages.proceedLink.click();
        } catch (Exception e) {
            System.out.println("çerez çıkmamamıştır");
        }


    }

    @When("kullanıcı kullanıcı adı {string} girer")
    public void kullanıcı_kullanıcı_adı_girer(String username) {
        loginPages.username.sendKeys(username);


    }

    @When("kullanıcı şifre {string} girer")
    public void kullanıcı_şifre_girer(String password) {
        loginPages.password.sendKeys(password);
        loginPages.loginButton.click();


    }

    @When("Hotel Management tıklar")
    public void hotel_management_tıklar() {
        defaultPage.hotelManagementLink.click();

    }

    @When("Hotel liste tıklar")
    public void hotel_liste_tıklar() {
        otelPage.hotelListButton.click();

    }

    @When("Add Hotel oldugunu verify et ve click et")
    public void add_hotel_oldugunu_verify_et_ve_click_et() {

        Assert.assertTrue(otelPage.addHotel.isDisplayed());

        otelPage.addHotel.click();

    }

    @When("kullanıcı code {string} girer")
    public void kullanıcı_code_girer(String code) {
        otelPage.code.sendKeys(code);

    }

    @When("kullanıcı name {string} girer")
    public void kullanıcı_name_girer(String name) {
        otelPage.name.sendKeys(name);

    }

    @When("kullanıcı Address {string} girer")
    public void kullanıcı_address_girer(String Address) {
        otelPage.adress.sendKeys(Address);

    }

    @When("kullanıcı Phone {string} girer")
    public void kullanıcı_phone_girer(String Phone) {
        otelPage.phone.sendKeys(Phone);

    }

    @When("kullanıcı Email {string} girer")
    public void kullanıcı_email_girer(String Email) {
        otelPage.email.sendKeys(Email);

    }

    @When("kullanıcı kullanıcı IDGroup secer")
    public void kullanıcı_kullanıcı_id_group_secer() {
        Select select = new Select(otelPage.idGroup);
        select.selectByIndex(1);

    }

    @When("save buttonuna click eder")
    public void save_buttonuna_click_eder() throws InterruptedException {
        Thread.sleep(3000);
        otelPage.saveButton.click();

    }

    @When("cıkan yazıyı verify et")
    public void cıkan_yazıyı_verify_et() throws InterruptedException {

        Thread.sleep(3000);

        String actual  = otelPage.massage.getText();
        String expected = "Hotel was inserted successfully";

        Assert.assertEquals(expected,actual);


    }

    @When("ok buttonuna click yap")
    public void ok_buttonuna_click_yap() throws InterruptedException  {
        Thread.sleep(3000);

        otelPage.okButton.click();

    }

    @Then("browser kapat")
    public void browser_kapat() {


    }

}
