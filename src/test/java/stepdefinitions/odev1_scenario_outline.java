package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.createPage;
import utilities.ConfigReader;
import utilities.Driver;

public class odev1_scenario_outline {

    createPage createPage = new createPage();


    @When("kullanıcı  adresine gider")
    public void kullanıcı_adresine_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("odev_url"));
    }
    @When("kullanıcı new button’a Click eder")
    public void kullanıcı_new_button_a_click_eder() {
        createPage.NewButton.click();
    }
    @When("kullanıcı first name {string} girer")
    public void kullanıcı_first_name_girer(String firstName) {
        createPage.firstName.sendKeys(firstName);


    }
    @When("kullanıcı last name {string} girer")
    public void kullanıcı_last_name_girer(String lastName) {
        createPage.lastName.sendKeys(lastName);


    }
    @When("kullanıcı position {string} girer")
    public void kullanıcı_position_girer(String position) {
        createPage.Position.sendKeys(position);

    }
    @When("kullanıcı office {string} girer")
    public void kullanıcı_office_girer(String ofice) {
        createPage.Office.sendKeys(ofice);

    }
    @When("kullanıcı Extension {string} girer")
    public void kullanıcı_extension_girer(String extension) {
        createPage.Extension.sendKeys(extension);

    }
    @When("kullanıcı Start date {string} girer")
    public void kullanıcı_start_date_girer(String date) {
        createPage.StartDate.sendKeys(date);

    }
    @When("kullanıcı Salary {string} girer")
    public void kullanıcı_salary_girer(String salary) {
        createPage.Salary.sendKeys(salary);

    }
    @When("kullanıcı create buttona click eder")
    public void kullanıcı_create_buttona_click_eder() {
        createPage.createButton.click();

    }
    @When("kullanıcı first name arar")
    public void kullanıcı_first_name_arar() {
        createPage.search.sendKeys("Ahmet");

    }
    @Then("name fields’in first name içerdiğini verify eder")
    public void name_fields_in_first_name_içerdiğini_verify_eder() {
        Assert.assertEquals("Ahmet Burak",createPage.nameVerify.getText());

    }
}
