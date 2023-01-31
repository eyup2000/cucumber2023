package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.LoginPages;
import pages.reservationsPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Alistirma03 {

    LoginPages loginPages = new LoginPages();

    reservationsPage reservationsPage = new reservationsPage();



    @Given("browser sayfasına gidilir")
    public void browser_sayfasına_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url_login"));

    }
    @When("çerezler kabul edilir")
    public void çerezler_kabul_edilir() {

       try {
           loginPages.advancedLink.click();
           loginPages.proceedLink.click();
    }catch (Exception e){
           System.out.println("çerez çıkmadı");
       }

    }

    @When("user Name {string} ve şifre {string} girilir ve click edilir")
    public void user_name_ve_şifre_girilir_ve_click_edilir(String username, String password) {
        loginPages.username.sendKeys(username);
        loginPages.password.sendKeys(password);
        loginPages.loginButton.click();

    }
    @When("user list click edilir")
    public void user_list_click_edilir() {
        reservationsPage.userList.click();

    }
    @When("add user verify edilir ve click edilir")
    public void add_user_verify_edilir_ve_click_edilir() {
        Assert.assertTrue(reservationsPage.addUser.isDisplayed());
        reservationsPage.addUser.click();

    }
    @When("gerekli datalar girilir {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void gerekli_datalar_girilir(String userName, String password, String Email, String FullName, String PhoneNo, String SocialSecurityNumber, String DrivingLicense, String Address, String DateofBirth, String WorkingSector) {
       reservationsPage.userName.sendKeys(userName);
       reservationsPage.password.sendKeys(password);
       reservationsPage.email.sendKeys(Email);
       reservationsPage.Fullname.sendKeys(FullName);
       reservationsPage.phoneNo.sendKeys(PhoneNo);

       reservationsPage.socialSecurityNumber.sendKeys(SocialSecurityNumber);

       reservationsPage.drivingLicense.sendKeys(DrivingLicense);

       reservationsPage.address.sendKeys(Address);

       reservationsPage.dataOfBirth.sendKeys(DateofBirth);

       reservationsPage.workingSector.sendKeys(WorkingSector);


        Select select = new Select(reservationsPage.country);
        select.selectByIndex(24);

        Select select1 = new Select(reservationsPage.role);
        select1.selectByIndex(1);

    }
    @When("save buttonuna click edilir")
    public void save_buttonuna_click_edilir() {

    }
    @When("message verify edilir ve ok buttonuna click edilir")
    public void message_verify_edilir_ve_ok_buttonuna_click_edilir() {

    }
    @When("user liste click edilir")
    public void user_liste_click_edilir() {

    }
    @When("user name de search et ve search buttonuna click et")
    public void user_name_de_search_et_ve_search_buttonuna_click_et() {

    }
    @When("user name oldugunu verify et")
    public void user_name_oldugunu_verify_et() {

    }
    @Then("browserı kapat")
    public void browserı_kapat() {

    }
}
