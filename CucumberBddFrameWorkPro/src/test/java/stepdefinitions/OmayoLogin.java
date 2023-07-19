package stepdefinitions;




import org.junit.runner.RunWith;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
public class OmayoLogin {
	
	WebDriver driver;
	
	@Given("^I navigate to the omayo website$")
	public void I_navigate_to_the_omayo_website() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("http://www.omayo.blogspot.com");		
		
	}
	
	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\" into the fields$") 
	public void I_enter_Username_as_and_Password_as(String username,String password) {
		
		driver.findElement(By.name("userid")).sendKeys(username);
        driver.findElement(By.name("pswrd")).sendKeys(password);       
		
	}
	
	@And("^I click on Login button$")
	public void I_click_on_Login_button() {
		
		driver.findElement(By.cssSelector("input[type='button'][value='Login']")).click();	
		
	}
	
	@Then("^User should login based on expected \"([^\"]*)\" status$")
	public void User_should_login_based_on_expected_status(String expectedLoginStatus) {
		
		String expectedStatus=expectedLoginStatus;
		String actualStatus=null;
		try {
			Alert alert = driver.switchTo().alert();
			String actualText = alert.getText();
			if(actualText.equals("Error Password or Username")) {
				actualStatus="failure";
			}else {
				actualStatus="success";
			}
		}catch(Exception e) {
			actualStatus="success";		
		}
		
		if(actualStatus.equals(expectedStatus)) {
			//Do nothing
		}else {
			Assert.fail("Actual login status is not equal to the expected login status");
		}
		
		driver.quit();
	}
	

}
