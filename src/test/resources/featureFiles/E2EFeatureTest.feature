@E2ETest
Feature: E2E Testing of online shopping

  @SmokeTest
  Scenario Outline: E2E test scenario of an ecommerce application
    Given User is on Home page
    When He searches for an item
    And Choose to buy first item
    And Moves to check out from mini cart
    And enter "<customer>" details on checkout page
    And select same delivery address
    And select payment method as check payment
    And accept TNC
    And click on Place order button
    Then he received an order confirmation page
       
   Examples:
   |customer|
   |Harsha|
    

  
