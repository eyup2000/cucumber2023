package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.DefaultPage;
import pages.LoginPages;
import pages.RoomRezervasyonPages;

import java.util.List;
import java.util.Map;

public class Day17_C7_Room_Rezervasyon_Step_Definitions {
    LoginPages loginPages = new LoginPages();
    DefaultPage defaultPage = new DefaultPage();
    RoomRezervasyonPages roomRezervasyonPages = new RoomRezervasyonPages();

    @Given("kullanici manager kullanici bilgilerini girer")
    public void kullanici_manager_kullanici_bilgilerini_girer(DataTable kullaniciBilgileri) {
        /*
      List<String> menejerKullaniciBilgileri = kullaniciBilgileri.row(1);
        System.out.println(menejerKullaniciBilgileri);
        System.out.println(menejerKullaniciBilgileri.get(0));
        System.out.println(menejerKullaniciBilgileri.get(1));

        loginPages.username.sendKeys(menejerKullaniciBilgileri.get(0));
        loginPages.password.sendKeys(menejerKullaniciBilgileri.get(1));
        loginPages.loginButton.click();

        //data List<List<String>> olarak alma
        List<List<String>> manajerBilgiler2 = kullaniciBilgileri.asLists();
        System.out.println(manajerBilgiler2);

       /* for (List<String> herbirBilgi : manajerBilgiler2){
            System.out.println(herbirBilgi);
            System.out.println(herbirBilgi.get(0));
            System.out.println(herbirBilgi.get(1));

            if (!herbirBilgi.get(0).equals("username")){
                loginPages.username.sendKeys(herbirBilgi.get(0));
                loginPages.password.sendKeys(herbirBilgi.get(1));
                loginPages.loginButton.click();
            }

        }
        //datayi lambda ile alma
        manajerBilgiler2.stream().filter(t ->!t.get(0).equals("username")).forEach(t ->{
            loginPages.username.sendKeys(t.get(0));
            loginPages.password.sendKeys(t.get(1));
            loginPages.loginButton.click();
        });*/

        //List<Map<String ,String>> alma
      List<Map<String ,String>> manajerBilgi3 =  kullaniciBilgileri.asMaps(String.class , String.class);
        System.out.println(manajerBilgi3);
        for (Map<String,String> herBirBilgi : manajerBilgi3){
            System.out.println(herBirBilgi);
            loginPages.username.sendKeys(herBirBilgi.get("username"));
            loginPages.password.sendKeys(herBirBilgi.get("password"));
            loginPages.loginButton.click();
        }

    }
    @Then("kullanici {string} oldugunu verify eder")
    public void kullanici_oldugunu_verify_eder(String string) {
     Assert.assertEquals(defaultPage.hotelManagementLink.getText(),string);

    }
    @Given("kullanıcı oda rezervasyon sayfasını yönlendirilir")
    public void kullanıcı_oda_rezervasyon_sayfasını_yönlendirilir() {
        defaultPage.hotelManagementLink.click();
        defaultPage.roomReservationsLink.click();
        roomRezervasyonPages.addRoomReservationButton.click();
    }
    @Given("kullanıcı tüm zorunlu alanları girer")
    public void kullanıcı_tüm_zorunlu_alanları_girer(DataTable dataTable) {
    List<String>  testData = dataTable.row(1);
        System.out.println(testData);
        //idUser bir dropDown
        Select selectIdUser= new Select(roomRezervasyonPages.idUser);
        selectIdUser.selectByIndex(2);

        //idHotel bir dropDown
        Select selectIdHotelRoom= new Select(roomRezervasyonPages.idHotelRoom);
        selectIdHotelRoom.selectByIndex(2);

        roomRezervasyonPages.price.sendKeys(testData.get(2));

        roomRezervasyonPages.dateStart.sendKeys(testData.get(3));

        roomRezervasyonPages.dateEnd.sendKeys(testData.get(4));

        roomRezervasyonPages.adultAmount.sendKeys(testData.get(5));

        roomRezervasyonPages.childrenAmount.sendKeys(testData.get(6));

        roomRezervasyonPages.contactNameSurname.sendKeys(testData.get(7));

        roomRezervasyonPages.contactPhone.sendKeys(testData.get(8));

        roomRezervasyonPages.contactEmail.sendKeys(testData.get(9));

        roomRezervasyonPages.notes.sendKeys(testData.get(10));


    }
    @Given("kullanıcı approved checkbox’a click eder")
    public void kullanıcı_approved_checkbox_a_click_eder() throws InterruptedException {
        Thread.sleep(2000);
        roomRezervasyonPages.isApproved.click();
    }
    @Given("kullanıcı paid check box’a click eder")
    public void kullanıcı_paid_check_box_a_click_eder() throws InterruptedException {
        Thread.sleep(2000);
        roomRezervasyonPages.isPaid.click();

    }
    @Given("kullanıcı save button’una click eder")
    public void kullanıcı_save_button_una_click_eder() throws InterruptedException {
        Thread.sleep(2000);
    roomRezervasyonPages.saveButton.click();
    }
    @Then("kullanıcı success mesajını verify eder")
    public void kullanıcı_success_mesajını_verify_eder() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(roomRezervasyonPages.successMessage.isDisplayed());
        Thread.sleep(3000);
        roomRezervasyonPages.okButton.click();
    }



}
