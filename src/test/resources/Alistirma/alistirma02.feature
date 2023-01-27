@otel_list
Feature: test data

  Scenario Outline: T01_Hesap

    Given kullanıcı sayfaya gider
    When kullanıcı kullanıcı adı "<kullanıcı adi>" girer
    And kullanıcı şifre "<sifre>" girer
    And Hotel Management tıklar
    And Hotel liste tıklar
    And Add Hotel oldugunu verify et ve click et
    And kullanıcı code "<code>" girer
    And kullanıcı name "<name>" girer
    And kullanıcı Address "<address>" girer
    And kullanıcı Phone "<Phone>" girer
    And kullanıcı Email "<Email>" girer
    And kullanıcı kullanıcı IDGroup secer
    And save buttonuna click eder
    And cıkan yazıyı verify et
    And ok buttonuna click yap
    Then browser kapat

    Examples: data
      | kullanıcı adi | sifre     | code  | name   | address        | Phone     | Email               |
      | manager       | Manager1! | 56984 | Ryan   | canada ,ottowa | 698485546 | ryan.ck87@gmail.com |
      | manager       | Manager1!  | mert  | 644894 | turkey , izmir | 977458644 | mert6454@gmail.com  |