package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchJava {
	
    @Given("I visit the website as a guest user$")
	public void I_visit_the_website_as_a_guest_user(){
		System.out.println(">> -  @Given - I visit the website as a guest user");
	}
    
    
   @When("I select the books option from the search dropdown$") 
    public void I_select_he_books_option_from_the_search_dropdown() {
	   System.out.println(">> -  @When - I select the books option from the search dropdown ");
   }
	@And("I click on search icon option$")
	 public void I_click_on_search_icon_option() {
		System.out.println(">> - @And - I click on search icon option");
		
	}
	@Then ("I should see the page having heading as Amazon Best Reads is getting displayed$")
	public void I_should_see_the_page_having_heading_as_Amazon_Best_Reads_is_getting_displayed() {
		System.out.println(">> - @Then - I should see the page having heading as Amazon Best Reads is getting displayed");
	}
	
	@But ("I should not see the other category products$")
	public void I_should_not_see_the_other_category_products() {
	   System.out.println(">> - @But - I should not see the other category products ");
	}
	 @Given("I visit the website as a guest users$")
		public void I_visit_the_website_as_a_guest_users(){
			System.out.println(">> -  @Given - I visit the website as a guest user");
		
	 }
	   @When("I select the Baby option from the dropdown$") 
	    public void I_select_the_Baby_option_from_the_dropdown() {
	  		   System.out.println(">> -  @When - I select the books option from the search dropdown ");
	   }
	   
		@And("I click on Search icon$")
		 public void I_click_on_Search_icon() {
			System.out.println(">> - @And - I click on Search icon");
			
		}
		@Then ("I should see the Baby page loaded$")
		public void I_should_see_the_Baby_page_loaded() {
			System.out.println(">> - @Then - I should see the Baby page loaded");
			
		}
		@And ("I should see The baby store as heading$")
		  public void I_should_see_The_baby_store_as_heading() {
			System.out.println(">> - @And - I should see The baby store as heading");
		}
		@But ("I should not see other category products$")
		public void I_should_not_see__other_category_products() {
		   System.out.println(">> - @But - I should not see the other category products ");
		} 
}


