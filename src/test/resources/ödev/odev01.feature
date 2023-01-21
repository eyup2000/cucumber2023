Feature: ODEV
  Scenario:

When kullanıcı https://editor.datatables.net/ adresine gider
And kullanıcı new button’a Click eder
When kullanıcı tüm fields girer
When kullanıcı create buttona click eder
And kullanıcı first name arar
Then name fields’in first name içerdiğini verify eder
#NOT: test data farklı formlarda alın:
#1.Scenario outline
#2.Data tables
#3.Excel