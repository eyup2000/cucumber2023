package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class Day15_C1_GoogleSearchStepDefinitions {
    //Java kodlari nerye step defination kısmına gelecek

    GooglePage googlePage = new GooglePage();

    @Given("kullanici google sayfasindadir")
    public void kullanici_google_sayfasindadir() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));

    }

    @Given("kullanıcı iphone'u arar")
    public void kullanıcı_iphone_u_arar() {
        googlePage.googleSearchBox.sendKeys("iphone" + Keys.ENTER);

    }

    @Then("kullanıcı sonuclarda iqhone oldugunu verify et")
    public void kullanıcı_sonuclarda_iqhone_oldugunu_verify_et() {
        boolean title = Driver.getDriver().getPageSource().contains("iphone");
        Assert.assertTrue(title);
    }

    @Then("kullanıcı application kapatir")
    public void kullanıcı_application_kapatir() {
        Driver.closeDriver();

    }


    //---------------------------------------------------------------------------------------------
    @Given("kullanıcı caydanlik'i arar")
    public void kullanıcı_caydanlik_i_arar() {
        googlePage.googleSearchBox.sendKeys("caydanlik" + Keys.ENTER);

    }

    @Then("kullanıcı sonuclarda caydanlik oldugunu verify et")
    public void kullanıcı_sonuclarda_caydanlik_oldugunu_verify_et() {
        String title = Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("caydanlik"));
    }


    //---------------------------------------------------------------------------------------------
    @Given("kullanici cicek'i arar")
    public void kullanici_cicek_i_arar() {
        googlePage.googleSearchBox.sendKeys("cicek" + Keys.ENTER);

    }

    @Then("kullanici sonuclarda cicek oldugunu verify eder")
    public void kullanici_sonuclarda_cicek_oldugunu_verify_eder() {

        Assert.assertTrue("cicek", Driver.getDriver().getTitle().contains("cicek"));

    }


    //----------------------------------------------------------------------------------------
    @Given("kullanici BMW'i arar")
    public void kullanici_bmw_i_arar() {
        googlePage.googleSearchBox.sendKeys("BMW" + Keys.ENTER);

    }

    @Then("kullanici sonuclarda BMW oldugunu verify eder")
    public void kullanici_sonuclarda_bmw_oldugunu_verify_eder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("BMW"));

    }


    //-------------------------------------------------------
    @Given("kullanıcı {string} arar")
    public void kullanıcı_arar(String string) {
        googlePage.googleSearchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("kullanıcı sonuclarda {string} oldugunu verify et")
    public void kullanıcı_sonuclarda_oldugunu_verify_et(String string) {

    }

    @Given("kullanici {string} arar")
    public void kullanici_arar(String string) {
        googlePage.googleSearchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("kullanici sonuclarda {string} oldugunu verify eder")
    public void kullanici_sonuclarda_oldugunu_verify_eder(String string) {

    }


    @Then("kullanici application kapatir")
    public void kullanici_application_kapatir() {

    }
}




