@odev_Create_Data_tables
Feature: data tables

Scenario:
When kullanıcı adresine gider
And kullanıcı new button Click eder
When kullanıcı tüm fields girer
  | First name | Last name | Position         | Office | Extension | Start date | Salary |
  | Fırat      | Kılıc     | junior developer | London | Test      | 2023-01-23 | 20000  |
When kullanıcı create button'a click eder
And kullanıcı first name ararr
Then name fieldsin first name içerdiğini verify eder
#NOT: test data farklı formlarda alın:
#1.Scenario outline
#2.Data tables
#3.Excel

