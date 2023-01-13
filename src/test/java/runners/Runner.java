package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

//calistirmak istedigim feature file belitmeliyim
@CucumberOptions(
        features = "src/test/resources/Sprit_13.087/Egle/Day16_C5_US100450_kullanici_manager_kullanici_bilgilerini_kullanarak_login_yapmali.feature",//zorunlu =>> featrue dosyasının pathinin girilmesi lazım
        glue = "stepdefinitions",//zorunlu => stepdefinition adresi (pathi)
        tags = "@manager_login_test",
        dryRun = false //opsiyoneldir yazmasakta false olur

)
public class Runner {
/*
Runner: feature file'lari calistirmak icin kullanilir
@RunWith : Cucumber.class'lari calistirmak icin kullanilir, kullanmadan Runner calismaz
@CucumberOptions() : feature path'i eklemek icin kullanilir , step deginition paht, tags, dryRun, report plugins icerir
 -feature : feature dosyasi path'ini verir, spesifik bir feature file isaret edilebilir
 -glue : step definition class'inda spesifik path'i isaret eder
 -tags : hangi feature yada senaryo kosacak bunu belirler. bu tag'i feature file ekliyoruz
 -dryRun : herhangi bir JAVA kod eksikligini kontol eder (step definition kullaniriz)
           : dryRun 2 value (deger) alir, true (head-less) veya false
           : dryRun = false => Herhangi bir JAVA kodunun eksik olup olmadigini kotrol ederken tarayicida testleri calistirir
           : dryRun = true =>  Herhangi bir JAVA kodunun eksik olup olmadigini kotrol ederken tarayici olmadan testleri calistirir
 */

}
