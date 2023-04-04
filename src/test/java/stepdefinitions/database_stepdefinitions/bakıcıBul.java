package stepdefinitions.database_stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.locaterBulma;
import utilities.ConfigReader;
import utilities.Driver;

public class bakıcıBul {
    locaterBulma locater = new locaterBulma();

    @Given("web sayfasına git")
    public void web_sayfasına_git() {

        Driver.getDriver().get("https://www.bakicibul.net/");

    }
    @Given("üye ol click")
    public void üye_ol_click() throws InterruptedException {
        Thread.sleep(2000);
        locater.uyeOl.click();
        Thread.sleep(2000);
    }
    @Given("aile olarak üye ol tıkla")
    public void aile_olarak_üye_ol_tıkla() throws InterruptedException {


        locater.aileUyeOl.click();

        Assert.assertTrue(locater.assertEtme.isDisplayed());

        Thread.sleep(2000);

        Thread.sleep(2000);


    }
        @Then("bakıcı uyeOl click yap")
        public void bakıcı_uye_ol_click_yap() {
//           Driver.getDriver().navigate().back();
//            locater.bakiciUyeOl.click();
//            Driver.getDriver().navigate().back();
//            Driver.getDriver().navigate().back();

    }
}
