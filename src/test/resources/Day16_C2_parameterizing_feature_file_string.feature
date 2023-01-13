
@parameterize_google_arama
Feature: Google_Search_Functionality

  Scenario: TC01_iphone_search
    Given kullanici google sayfasindadir
    And kullanıcı "iphone" arar
    Then kullanıcı sonuclarda "iqhone" oldugunu verify et
    Then kullanıcı application kapatir


  Scenario: TC01_Caydanlik_search
    Given kullanici google sayfasindadir
    And kullanıcı "caydanlik" arar
    Then kullanıcı sonuclarda "caydanlik" oldugunu verify et
    Then kullanıcı application kapatir


  Scenario: TC02_cicek_search
    Given kullanici google sayfasindadir
    And kullanici "cicek" arar
    Then kullanici sonuclarda "cicek" oldugunu verify eder
    Then kullanıcı application kapatir


  Scenario: TC02_BMW_search
    Given kullanici google sayfasindadir
    And kullanici "BMW" arar
    Then kullanici sonuclarda "BMW" oldugunu verify eder
    Then kullanıcı application kapatir
