@create
Feature: ODEV

 Scenario Outline:
When kullanıcı  adresine gider
And kullanıcı new button’a Click eder
When kullanıcı first name "<first name>" girer
   When kullanıcı last name "<last name>" girer
   When kullanıcı position "<position>" girer
   When kullanıcı office "<office>" girer
   When kullanıcı Extension "<Extension>" girer
   When kullanıcı Start date "<Start date>" girer
   When kullanıcı Salary "<Salary>" girer
When kullanıcı create buttona click eder
And kullanıcı first name arar
Then name fields’in first name içerdiğini verify eder
  Examples: test data
    | first name | last name | position       | office | Extension | Start date | Salary |
    | Ahmet     | Burak    | Manuel Tester | ankara | yok       | 2023-01-23 | 18500  |
#NOT: test data farklı formlarda alın:
#1.Scenario outline
#2.Data tables
#3.Excel
