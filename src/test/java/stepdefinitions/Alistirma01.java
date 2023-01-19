package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.YeniHesapA01;
import utilities.ConfigReader;
import utilities.Driver;

public class Alistirma01 {
    YeniHesapA01 yeniHesapA01 = new YeniHesapA01();
    @Given("kullanıcı browsera gider")
    public void kullanıcı_browsera_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url_alistirma"));
    }
    @Then("kullanıcı login butonuna click eder")
    public void kullanıcı_login_butonuna_click_eder() {
        yeniHesapA01.loginClick.click();
    }
    @Then("kullanıcı name {string} ve email {string} girer")
    public void kullanıcı_name_ve_email_girer(String name, String email) {
        yeniHesapA01.name.sendKeys(name);
        yeniHesapA01.email.sendKeys(email);
        yeniHesapA01.signup.click();
    }
    @Then("title click eder")
    public void title_click_eder() {
    yeniHesapA01.titleClick.click();

    }
    @Then("pasword {string} girilir")
    public void pasword_girilir(String sifre) {
        yeniHesapA01.sifre.sendKeys(sifre);

    }
    @Then("date Birth girilir")
    public void date_birth_girilir() {
        Select select = new Select(yeniHesapA01.days);
        select.selectByIndex(16);

        Select select1 = new Select(yeniHesapA01.month);
        select1.selectByIndex(4);

        Select select2 = new Select(yeniHesapA01.years);
        select2.selectByIndex(16);

    }
    @Then("kullanıcı kutucuklara click eder")
    public void kullanıcı_kutucuklara_click_eder() {
        yeniHesapA01.buttonClick.click();

    }
    @Then("kullanıcı first name  {string} girer")
    public void kullanıcı_first_name_girer(String firstName) {
        yeniHesapA01.firstName.sendKeys(firstName);

    }
    @Then("kullanıcı last name  {string} girer")
    public void kullanıcı_last_name_girer(String lastName) {
        yeniHesapA01.lastName.sendKeys(lastName);

    }
    @Then("kullanıcı company  {string} girer")
    public void kullanıcı_company_girer(String company) {
        yeniHesapA01.company.sendKeys(company);

    }
    @Then("kullanıcı adress1 {string} girer")
    public void kullanıcı_adress1_girer(String adress1) {
        yeniHesapA01.adress1.sendKeys(adress1);

    }
    @Then("kullanıcı adress2  {string} girer")
    public void kullanıcı_adress2_girer(String adress2) {
        yeniHesapA01.adress2.sendKeys(adress2);

    }
    @Then("kullanıcı ülke seçer")
    public void kullanıcı_ülke_seçer() {
        Select select = new Select(yeniHesapA01.country);
        select.selectByIndex(3);

    }
    @Then("kullanıcı state  {string} girer")
    public void kullanıcı_state_girer(String state) {
        yeniHesapA01.state.sendKeys(state);

    }
    @Then("kullanıcı zipcode {string} girer")
    public void kullanıcı_zipcode_girer(String zipcode) {
        yeniHesapA01.city.sendKeys("Adana");
       yeniHesapA01.zipcode.sendKeys(zipcode);

    }
    @Then("kullanıcı number phone {string} girer")
    public void kullanıcı_number_phone_girer(String number) {
        yeniHesapA01.numberPhone.sendKeys(number);

    }
    @Then("kullanıcı create eder")
    public void kullanıcı_create_eder() {
        yeniHesapA01.createButtonClick.click();

    }
    @Then("mesaj verfy edilir")
    public void mesaj_verfy_edilir() {
        Assert.assertEquals("ACCOUNT CREATED!" , yeniHesapA01.assertMessage.getText());
    }
    @Then("kullanıcı browser kapatir")
    public void kullanıcı_browser_kapatir() {
    Driver.closeDriver();
    }
}
