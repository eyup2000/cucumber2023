package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.createPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class odev2_Data_Tables {

        createPage createPage = new createPage();
    @When("kullanıcı adresine gider")
    public void kullanıcı_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("odev_url"));

    }
    @When("kullanıcı new button Click eder")
    public void kullanıcı_new_button_click_eder() {
        createPage.NewButton.click();

    }
    @When("kullanıcı tüm fields girer")
    public void kullanıcı_tüm_fields_girer(DataTable Bilgiler) {
        List<String> KullanıcıBilgileri = Bilgiler.row(1);

        createPage.firstName.sendKeys(KullanıcıBilgileri.get(0));
        createPage.lastName.sendKeys(KullanıcıBilgileri.get(1));
        createPage.Position.sendKeys(KullanıcıBilgileri.get(2));
        createPage.Office.sendKeys(KullanıcıBilgileri.get(3));
        createPage.Extension.sendKeys(KullanıcıBilgileri.get(4));
        createPage.StartDate.sendKeys(KullanıcıBilgileri.get(5));
        createPage.Salary.sendKeys(KullanıcıBilgileri.get(6));

    }
    @When("kullanıcı create button'a click eder")
    public void kullanıcı_create_button_a_click_eder() {
        createPage.createButton.click();

    }
    @When("kullanıcı first name ararr")
    public void kullanıcı_first_name_ararr() {
        createPage.search.sendKeys("Fırat");

    }
    @Then("name fieldsin first name içerdiğini verify eder")
    public void name_fieldsin_first_name_içerdiğini_verify_eder() {
        Assert.assertTrue(createPage.nameVerify.getText().contains("Fırat"));

    }

}
