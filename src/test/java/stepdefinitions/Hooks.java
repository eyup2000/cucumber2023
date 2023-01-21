package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    //cucumberda hook class ne demktir?

    //hook class Before ve after annotationslari sahiptir
    //hooks her bir seneryodan once (Before) veya sonra (After) çalışır
    //@After'da neleri var?
    //cucumberda @after hooks ta report ve screenShot alır
    //Hooksu ben dizayn ederim ve test scanerio başarisiz oldugunda screenShot alırım
    @Before
    public void setUp(){
        System.out.println("Bu bir hooks @Before methodudur.");

    }
    @After

    public void tearDown(Scenario scenario) {
//   final byte[]  screenshot =  ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//    // screenShot'İ scenario raporuna ekle
//       if (scenario.isFailed()) {
//            scenario.attach(screenshot, "image/png", "screenShot");
//       }
//    }
    }

}
