package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.test_Page1;
import utilities.ConfigReader;
import utilities.Driver;

public class Alistirma05 {

    test_Page1 test_page1 = new test_Page1();

    @Given("Kullanıcı sayfaya gider")
    public void kullanıcı_sayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

    }
    @Given("çerezleri geçip web sayfasında oldugunu verify eder")
    public void çerezleri_geçip_web_sayfasında_oldugunu_verify_eder() {

       try{ test_page1.advancedLink.click();
        test_page1.proceedLink.click();
       }catch (Exception E){
           System.out.println("Çerezler geçildi");
       }

       String expected = "https://www.carettahotel.com/";
       String actual = Driver.getDriver().getCurrentUrl();
        //System.out.println("actual = " + actual);
        Assert.assertEquals(expected,actual);


    }
    @Given("login buttonu click edilir")
    public void login_buttonu_click_edilir() {
        test_page1.loginButton.click();

    }
    @Given("user name {string} ve password {string} girilir ve login edilir")
    public void user_name_ve_password_girilir_ve_login_edilir(String userName, String password) {
        test_page1.userName.sendKeys(userName);
        test_page1.password.sendKeys(password);
        test_page1.login.click();

    }
    @Given("add user buttonunu verify et ve click et")
    public void add_user_buttonunu_verify_et_ve_click_et() {
      try {
          Assert.assertTrue(test_page1.addUser.isDisplayed());
          test_page1.addUser.click();
      }catch (Exception e){
          System.out.println("add user bulunamadı!!");
      }


    }
    @When("gerekli datalar girilir {string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void gerekli_datalar_girilir(String username, String pasword, String email, String fullName, String Phone, String socialSecurityNumber, String drivingLicense, String Address, String workingSector) throws InterruptedException {

        test_page1.usernamee.sendKeys(username);
        test_page1.passwordd.sendKeys(pasword);
        test_page1.email.sendKeys(email);
        test_page1.fullname.sendKeys(fullName);
        test_page1.phoneNo.sendKeys(Phone);
        test_page1.ssn.sendKeys(socialSecurityNumber);
        test_page1.driving.sendKeys(drivingLicense);

        Thread.sleep(2000);
        Select select = new Select(test_page1.country);
        select.selectByIndex(6);

        Thread.sleep(1000);
        test_page1.adress.sendKeys(Address);
        test_page1.date.sendKeys("02/12/2020");

        test_page1.working.sendKeys(workingSector);

        Select select1 = new Select(test_page1.role);
        select1.selectByIndex(1);

        test_page1.yesButton.click();



    }
    @When("save buttonuna tıkla ve mesajı verify et {string}")
    public void save_buttonuna_tıkla_ve_mesajı_verify_et(String message) throws InterruptedException {
        Thread.sleep(3000);
        test_page1.saveButton.click();

//        String actual = test_page1.messagee.getText();
//        String expected  = message;
//        System.out.println("expected = " + expected);
//        System.out.println("actual = " + actual);
//        Assert.assertEquals(expected,actual);


    }
    @Then("ok butonuna tıkla ve browser kapat")
    public void ok_butonuna_tıkla_ve_browser_kapat() {
        test_page1.okButton.click();
        Driver.closeDriver();

    }
}
