@tag_name
Feature: US_001
  Scenario Outline: TC_001
    Given Kullanıcı sayfaya gider
    And çerezleri geçip web sayfasında oldugunu verify eder
    And login buttonu click edilir
    And user name "<userName>" ve password "<password>" girilir ve login edilir
    And add user buttonunu verify et ve click et
    When gerekli datalar girilir "<Username>","<pasword>","<email>","<fullName>","<Phone>","<socialSecurityNumber>","<drivingLicense>","<Address>","<workingSector>"
    And save buttonuna tıkla ve mesajı verify et "User was inserted successfully"
    Then ok butonuna tıkla ve browser kapat
    Examples: test_data
      | userName | password  | Username | pasword   | email              | fullName  | Phone     | socialSecurityNumber | drivingLicense | Address         | workingSector |
      | manager  | Manager1! | Fahrii   | Manager2! | fahri584@gmail.com | Fahri hak | (979) 646-5416 | 987456321            | jsjsjsj        | istanbul,turkey | jsbhbcdhbchdv |
