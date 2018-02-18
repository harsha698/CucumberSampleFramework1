@E2ETest
Feature: E2E Testing of online shopping

  @SmokeTest
  Scenario: E2E test scenario of an ecommerce application
    Given User is on Home page
    When He searches for an item
    |Item|
    |Dress|
    |Footware|
    And Choose to buy first item
    And Moves to check out from mini cart
    And enter personal details on checkout page
    And select same delivery address
    And select payment method as "check" payment
    And click on Place order button
    Then he received an order confirmation page
       
    

  
