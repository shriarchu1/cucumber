package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
//\"([a-zA-Z]{1,})\"
@RunWith(Cucumber.class)

public class SoftwareTesters {
	@Given("^I am a \"([^\"]*)\" software tester$")
	  public void I_am_a_good_software_tester(String testerTypes) {
		
		System.out.println(">> - I am a "+testerTypes+" tester ");
	}
	@When ("^I go to work$")
		public void	I_go_to_work() {
		
	}
    
	@And ("^I \"([^\"]*)\" with it$")
	public void I_involve_with_it(String workType) {
		System.out.println(">> - I "+workType+" with it");
	}
	
    @Then ("^My boss \"([^\"]*)\" me")
    public void My_boss_loves_me(String emotionType) {
    	System.out.println(">> - My boss "+emotionType+" me");
    }
}
