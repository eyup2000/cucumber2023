package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.LoginPages;
import pages.createPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtil;

import java.util.List;
import java.util.Map;

public class odev3_excel {
    createPage createPage = new createPage();


    ExcelUtil excelUtil;
    List<Map<String, String>> testData;

    @When("kullanıcı browseradresine gider")
    public void kullanıcı_browseradresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("odev_url"));

    }

    @When("kullanıcı new buttona Click eder")
    public void kullanıcı_new_buttona_click_eder() {
        createPage.NewButton.click();

    }

    @When("kullanıcı tüm fields girerr")
    public void kullanıcı_tüm_fields_girerr() throws InterruptedException {

        String path = "src/test/resources/testData/odev_data.xlsx";
        String sheetName = "datalar";
        excelUtil = new ExcelUtil(path, sheetName);

        testData = excelUtil.getDataList();
        System.out.println(testData);//[{Office=Antalya, Extension=karakter, Salary=62000.0, Start Date=29-Jan-2023, Position=Oyuncu, First Name=Ali, Last Name=Kaya}]

        for (Map<String, String> datalar : testData) {

            createPage.firstName.sendKeys(datalar.get("First Name"));
            createPage.lastName.sendKeys(datalar.get("Last Name"));
            createPage.Position.sendKeys(datalar.get("Position"));
            createPage.Office.sendKeys(datalar.get("Office"));
            createPage.Extension.sendKeys(datalar.get("Extension"));
            createPage.StartDate.sendKeys(datalar.get("Start Date"));
            createPage.Salary.sendKeys(datalar.get("Salary"));

        }
    }
        @When("kullanıcı create buttona click ederr")
        public void kullanıcı_create_buttona_click_ederr () {

        createPage.createButton.click();

        }

        @When("kullanıcı first name ararrr")
        public void kullanıcı_first_name_ararrr () {

        createPage.search.sendKeys("Ali");

        }
        @Then("name fields'in first name içerdiğini verify ederr")
        public void name_fields_in_first_name_içerdiğini_verify_ederr () {

            Assert.assertTrue(createPage.nameVerify.getText().contains("Ali"));

        }

}