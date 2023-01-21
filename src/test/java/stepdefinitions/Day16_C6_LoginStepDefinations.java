package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.DefaultPage;
import pages.LoginPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtil;

import java.util.List;
import java.util.Map;

public class Day16_C6_LoginStepDefinations {

    LoginPages loginPages = new LoginPages();
    DefaultPage defaultPage = new DefaultPage();


    @Given("kullanici application sayfasindadir")
    public void kullanici_application_sayfasindadir() {
        Driver.getDriver().get(ConfigReader.getProperty("qa_url_login"));

        try {
            Thread.sleep(1000);
            loginPages.advancedLink.click();
            Thread.sleep(1000);
            loginPages.proceedLink.click();
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Advanced Link and Proceed Link is not displayed");
        }
    }

    @Given("kullanici manager id {string} girer")
    public void kullanici_manager_id_girer(String string) {
        loginPages.username.sendKeys(string);
    }

    @Given("kullanici manager sifre {string} girer")
    public void kullanici_manager_sifre_girer(String string) {
        loginPages.password.sendKeys(string);
    }

    @Then("kullanici login buttonuna click eder")
    public void kullanici_login_buttonuna_click_eder() {
        // loginPages.loginButton.click();
    }

    @Then("kullanici {string} oldugunu very eder")
    public void kullanici_oldugunu_very_eder(String string) {
        Assert.assertEquals(defaultPage.hotelManagementLink.getText(), string);
    }


    @Given("kullanici admin id {string} girer")
    public void kullanici_admin_id_girer(String kullaniciadi) {
        loginPages.username.sendKeys(kullaniciadi);
    }

    @Given("kullanici admin sifre {string} girer")
    public void kullanici_admin_sifre_girer(String sifre) {
        loginPages.password.sendKeys(sifre);

    }

    @When("kullanici login button'una click eder")
    public void kullanici_login_button_una_click_eder() throws InterruptedException {
        Thread.sleep(2000);
        loginPages.loginButton.click();
    }

    @Then("default page'in displayed oldugunu verify eder")
    public void default_page_in_displayed_oldugunu_verify_eder() {


    }

    ExcelUtil excelUtil;
    List<Map<String, String>> testData;

    public void setUp() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("app_qa_environment"));
        loginPages = new LoginPages();
        Thread.sleep(1000);
        try{
            Thread.sleep(1000);
            loginPages.advancedLink.click();
            Thread.sleep(1000);
            loginPages.proceedLink.click();
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("Advanced Link ve Proceed Link gorunmedi");
        }
    }

    @Given("kullanici applicationa excel admin ile login yapar")
    public void kullanici_applicationa_excel_admin_ile_login_yapar() throws InterruptedException {
        String path = "src/test/resources/testData/smoketestdata.xlsx";
        String sheetName = "manager_login_info";
        excelUtil = new ExcelUtil(path, sheetName);

        testData = excelUtil.getDataList();
        System.out.println(testData);//[{password=Arcane123!, username=admin1}]

        for (Map<String, String> eachData : testData) {//eachData represent each username-password pairs
            setUp();//login in each loop
            loginPages.username.sendKeys(eachData.get("username"));//admin1
            loginPages.password.sendKeys(eachData.get("password"));//Arcane123!
            loginPages.loginButton.click();
        }


    }




}
