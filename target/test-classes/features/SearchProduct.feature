Feature: Search and place the order for the product

@OffersPage
Scenario Outline: Search experiance in both home page and offers page
Given User is on GreenCart landing page
When User searched with shortname <Name> extrancted actual name of the product
Then User searched for <Name> shortname in offers page to check if produt exists
And Validates product name in landing page and offers page is same

Examples:
|Name|
|Tom|
|Beet|