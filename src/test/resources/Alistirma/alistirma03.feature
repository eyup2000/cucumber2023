@reservation
Feature: reservations_hotel
  Scenario Outline: hotel
    Given browser sayfasına gidilir
    When çerezler kabul edilir
    And user Name "<username>" ve şifre "<sifre>" girilir ve click edilir
    And user list click edilir
    And add user verify edilir ve click edilir
    And gerekli datalar girilir "<userName>","<Password>","<Email>","<Full Name>","<PhoneNo>","<Social Security Number>","<Driving License>","<Address>","<WorkingSector>","<Date of Birth>"
    And save buttonuna click edilir
    And message verify edilir ve ok buttonuna click edilir
    And user liste click edilir
    And user name de search et ve search buttonuna click et
    And user name oldugunu verify et
    Then browserı kapat
    Examples: data
      | username | sifre     | userName | Password | Email               | Full Name | PhoneNo  | Social Security Number | Driving License | Address       | WorkingSector | Date of Birth |
      | manager  | Manager1! | kemalke  | Kemal32! | kemal6587@gmail.com | kemal kan | 65874125 | 98746684               | 30/06/1999          | USA, new york | jdjhd         |  hg   |