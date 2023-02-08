@new_create_account
Feature: Alistirma_test

  Scenario Outline: TC_101

    Given browsera git
    And login buttonuna bas
    And name "<name>" ve email "<email>" gir
    And signup click et
    And gerekli yerleri gir "<password>","<firstName>","<lastName>","<company>","<adress1>","<adress2>","<state>","<city>","<zipcode>","<mobilePhone>"
    And createButton click et
    And ACCOUNT CREATED! yazısını verify et
    Then browser kapatt

    Examples: Test_Data
      | name  | email             | password | firstName | lastName | company | adress1   | adress2      | state  | city   | zipcode | mobilePhone |
      | hakan | hakan65@gmail.com | kanak54! | Hakan     | konak    | Amazon  | USA ,was. | London, gher | jsjsjs | London | 325487  | 0212458964  |