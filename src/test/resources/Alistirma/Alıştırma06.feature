@Hesap_oluşturma
Feature: Test_06
  Scenario Outline: Test

    Given Web sayfasına git
    And login button click yap
    And datalari gir "<name>","<email>","<password>","<firstName>","<lastNme>","<company>","<address>","<addres2>","<state>","<city>","<zipcode>","<number>"
    And cikan mesajı verfy et
    Then browser kapat
    Examples:test
      | name   | email                   | password   | firstName | lastNme | company | address          | addres2        | state    | city          | zipcode | number     |
      | Mehmet | zdhdsefseghzdh@gmail.com     | 123456hay! | Mehmet    | kodak   | amazon  | Turkiye,istanbul | Türkiye,Ankara | rastgele | kahramanmaraş | 54787   | 5489657485 |
      | fatih  | sgsg@gmail.com | 123456hay! | fatih     | bakar   | google  | Turkiye,istanbul | Türkiye,Ankara | rastgele | bursa         | 54787   | 658486484  |
      | fatih  | sghsfg@gmail.com | 123456hay! | fatih     | bakar   | google  | Turkiye,istanbul | Türkiye,Ankara | rastgele | bursa         | 54787   | 658486484  |