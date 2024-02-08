Feature: Place the order for the product

@PlaceOrder
Scenario Outline: Search experiance in both home page and offers page
Given User is on GreenCart landing page
When User searched with shortname <Name> extrancted actual name of the product
And Added "3" items to the cart
Then user proceeds to Checkout and validates the <Name> items in checkout page
And Verify user has ability to enter promo code and place the order

Examples:
|Name|
|tom|