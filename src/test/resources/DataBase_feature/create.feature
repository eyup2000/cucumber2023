@oda_rezervasyonu
  Feature: create_new_hotel
    Scenario: TC01_create_new_hotel_test
      Given user connects to the database
      When USER CREte a new hotel with this values "'3000','Royal King Star Hotel','LA Downtown','88899','royalla@testemail.com','2023-4-02 19:40:47.597', 4"
      Then verify the creation is successful