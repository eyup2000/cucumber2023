package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import utilities.ConfigReader;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class selenium_grid {

    @Given("user is on the application_login page with chrome")
    public void user_is_on_the_application_login_page_with_chrome() throws MalformedURLException {
        // 1. Desired Capabilities object olustur //browserlara farkli ozellikler eklemek kullaniriz, orn name, version
        DesiredCapabilities cap = new DesiredCapabilities();
        // 2. browser ve istetim sistemi belirlemek icin 'cap' object kullanilir
        cap.setBrowserName("chrome");
//        cap.setPlatform(Platform.WINDOWS);// windows icin
//        cap.setPlatform(Platform.MAC);// mac icin
        cap.setPlatform(Platform.ANY);// herhangi bir isletim sistemi icin (mac veya windows)
        //3. merge (birlestirme) chrome ile DesiredCapabilities
        ChromeOptions options = new ChromeOptions();
        options.merge(cap);
        //RenotWebDriver kullanarak bir driver object oluştur
        String hubUrl = "http://192.168.1.11:5555";

        WebDriver driver = new RemoteWebDriver(new URL(hubUrl),options);

        //bu noktadan sonre test codelerimiz standart yolu izleriz

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();

        //koşturmak istediğimiz java kodlarını buraya yazariz
        driver.get(ConfigReader.getProperty("app_url_login"));


    }

    @Then("verify the title includes admin")
    public void verify_the_title_includes_admin() {


    }
}
