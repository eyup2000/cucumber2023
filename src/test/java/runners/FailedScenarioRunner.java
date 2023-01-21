package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)

//calistirmak istedigim feature file belitmeliyim
    @CucumberOptions(
            plugin = {
                    "pretty",
                    "html:target/default-cucumber-reports.html",
                    "json:target/json-reports/cucumber.json",
                    "junit:target/xml-report/cucumber.xml",
                    "rerun:target/failedRerun.txt" ,
            },
            features = "@target/failedRerun.txt",//zorunlu =>> featrue dosyasının pathinin girilmesi lazım
            glue = "stepdefinitions",//zorunlu => stepdefinition adresi (pathi)
            tags = "@alistirma",
            dryRun = false //opsiyoneldir yazmasakta false olur

    )
    public class FailedScenarioRunner {

    }
