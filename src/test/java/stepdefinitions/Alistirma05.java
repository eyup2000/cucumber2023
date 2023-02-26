package stepdefinitions;

import io.cucumber.java.en.*;
import utilities.ConfigReader;
import utilities.Driver;

public class Alistirma05 {
    @Given("Kullanıcı sayfaya gider")
    public void kullanıcı_sayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

    }
    @Given("çerezleri geçip web sayfasında oldugunu verify eder")
    public void çerezleri_geçip_web_sayfasında_oldugunu_verify_eder() {


    }
    @Given("login buttonu click edilir")
    public void login_buttonu_click_edilir() {

    }
    @Given("user name {string} ve password {string} girilir ve login edilir")
    public void user_name_ve_password_girilir_ve_login_edilir(String userName, String password) {

    }
    @Given("add user buttonunu verify et ve click et")
    public void add_user_buttonunu_verify_et_ve_click_et() {

    }
    @When("gerekli datalar girilir {string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void gerekli_datalar_girilir(String Username, String pasword, String email, String fullName, String Phone, String socialSecurityNumber, String drivingLicense, String Address, String workingSector) {

    }
    @When("save buttonuna tıkla ve mesajı verify et {string}")
    public void save_buttonuna_tıkla_ve_mesajı_verify_et(String string) {

    }
    @Then("ok butonuna tıkla ve browser kapat")
    public void ok_butonuna_tıkla_ve_browser_kapat() {

    }
}
