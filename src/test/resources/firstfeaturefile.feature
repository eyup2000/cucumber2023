
@google_search
Feature: Google_Search_Functionality

  Background: application_sayfasina_git
    Given kullanici google sayfasindadir

Scenario: TC01_iphone_search

  And kullanıcı iphone'u arar
  Then kullanıcı sonuclarda iqhone oldugunu verify et
  Then kullanıcı application kapatir


  Scenario: TC01_Caydanlik_search
    And kullanıcı caydanlik'i arar
    Then kullanıcı sonuclarda caydanlik oldugunu verify et
    Then kullanıcı application kapatir


  Scenario: TC02_cicek_search
    And kullanici cicek'i arar
    Then kullanici sonuclarda cicek oldugunu verify eder
    Then kullanici application kapatir


  Scenario: TC02_BMW_search
    And kullanici BMW'i arar
    Then kullanici sonuclarda BMW oldugunu verify eder
    Then kullanici application kapatir
