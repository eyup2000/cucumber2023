@alistirma
Feature: yeni_hesap_acma_deneme
  Scenario Outline:
    Given kullanıcı browsera gider
    Then kullanıcı login butonuna click eder
    And kullanıcı name "<name>" ve email "<email>" girer
    And title click eder
    And pasword "<sifre>" girilir
    And date Birth girilir
    And kullanıcı kutucuklara click eder
    And kullanıcı first name  "<isim>" girer
    And kullanıcı last name  "<soyisim>" girer
    And kullanıcı company  "<sirket>" girer
    And kullanıcı adress1 "<adress1>" girer
    And kullanıcı adress2  "<adress2>" girer
    And kullanıcı ülke seçer
    And kullanıcı state  "<state>" girer
    And kullanıcı zipcode "<zipcode>" girer
    And kullanıcı number phone "<number>" girer
    And kullanıcı create eder
    Then mesaj verfy edilir
    Then kullanıcı browser kapatir
    Examples: Test Data
      | name   | email             | sifre  | isim   | soyisim | sirket | adress1           | adress2            | state  | zipcode | number     |
      | Mehmet | mehmet12548@gmail.com | memo1! | mehmet | bulak   | amazon | istanbul gungoren | ankara yenigun mh. | kelime | 54894   | 4598515624 |
      | Aydin | aydin7895@gmail.com | aydın1! | Aydin | kaya   | google | istanbul bağcılar | sivas kangal  | sayi | 69492   | 02124875 |