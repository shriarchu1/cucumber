Feature: Search of various product categories should be posssible along with product search
It is good to provide an option to our end users where they can search for the products
based on their category, rather than only searching a product.This will increase our 
business and make end users happy. 

Background: Visiting the website as a guest user
Given I visit the website as a guest user
@All @Books @dev @SmokeTest
Scenario: User should be able to search for the products under books category
Given I visit the website as a guest user
When I select the books option from the search dropdown 
And I click on search icon option
Then I should see the page having heading as Amazon Best Reads is getting displayed
But I should not see the other category products

@smokeTest @All @Baby @wip
Scenario: Search for the products under Baby category
Given I visit the website as a guest user
When I select the Baby option from the dropdown
And I click on Search icon
Then I should see the Baby page loaded
And I should see The baby store as heading
But I should not see other category products



















































