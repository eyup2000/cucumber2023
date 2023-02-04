package stepdefinitions.database_stepdefinitions;

import io.cucumber.java.en.*;
import utilities.DBUtils;

public class Create_Step_Definitions {
    @When("USER CREte a new hotel with this values {string}")
    public void user_cr_ete_a_new_hotel_with_this_values(String hotelData) {
      String sql =  "Insert Into tHOTEL (Code , Name , Address, Phone , Email, CreateDate, CreateUser)"+
              "VALUES ("+hotelData+")";
        DBUtils.executeQuery(sql);
    }
    @Then("verify the creation is successful")
    public void verify_the_creation_is_successful() {
        DBUtils.getColumnData("Select Name fROM tHOTEL","Name").toString().contains("Royal King Star Hotel");

    }
}

