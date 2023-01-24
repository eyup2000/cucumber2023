package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)

    @CucumberOptions(
            plugin = {
                    "pretty",
                    "html:target/default-cucumber-reports.html",
                    "json:target/json-reports/cucumber.json",
                    "junit:target/xml-report/cucumber.xml",
                    "rerun:target/failedRerun.txt" ,
            },
            features = "src/test/resources",//zorunlu =>> featrue dosyasının pathinin girilmesi lazım
            glue = "stepdefinitions",//zorunlu => stepdefinition adresi (pathi)
            tags = "@odev_Excel",
            dryRun = false //opsiyoneldir yazmasakta false olur

    )
    public class TestRunner {

    }

