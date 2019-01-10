@basket
Feature: Basket

  @TC-100
  Scenario Outline: Validate items added to basket
    Given User opens warehouse home page
    When user clicks on "Shop" menu
    And opens a phones page "All pay monthly phones"
    And selects a brand "<Brand>"
    And selects upfront cost "<Upfront Cost>"
    And selects monthly cost "<Monthly Cost>"
    And selects first phone in the search results
    And clicks on View deals
    And selects Cheapest total cost from Filter Plans
    And selects Network as "<Network>"
    And adds first plan to basket
    And adds first accessory to basket from Choose your Extras
    And clicks on Continue to bakset
    And clicks on Go to checkout
    And selects "<Monthly Cap>" monthly cap
    And clicks on Continue to checkout
    And fills the details in About You section "<Email>" "<Title>" "<FirstName>" "<LastName>" "<Contact>" "<Marital Status>"
    And sets pincode "<Pincode>"
    And clicks on Continue to delivery
    
  Examples:
  	| Brand   | Upfront Cost | Monthly Cost | Network  | Monthly Cap | Email         | Title | FirstName | LastName | Contact    | Marital Status | Pincode |
  	| Apple   | GBP_20       | GBP_100      | VODAFONE | NO_BILL_CAP | abc@gmail.com | Mr    | Dev       | Nadh     | 9052557770 | Single         | 500049  |
  	| Samsung | GBP_20       | GBP_50       | VODAFONE | NO_BILL_CAP | abc@gmail.com | Mr    | Dev       | Nadh     | 9100826115 | Single         | 500049  |
    
