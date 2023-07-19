package stepdefinitions;

import java.time.Duration;
import java.util.Map;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
public class Register {
	WebDriver driver;
    @Before("@register")
	public void OpenBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
    @Given("^User navigates to Register page$")
     public void User_navigates_to_Register_page() {
    	driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
    }
	@When ("^User provies the following details into the input fields$")
	  public void User_provies_the_following_details_into_he_input_fields(DataTable dataTable) {
		
		Map<String, String> datamap = dataTable.asMap(String.class,String.class);
		
		driver.findElement(By.id("input-firstname")).sendKeys(datamap.get(datamap.get("firstName")));
		driver.findElement(By.id("input-lastname")).sendKeys(datamap.get("lastName"));
		driver.findElement(By.id("input-email")).sendKeys(datamap.get("email"));
		driver.findElement(By.id("input-telephone")).sendKeys(datamap.get("phone"));
		driver.findElement(By.id("input-password")).sendKeys(datamap.get("password"));
		driver.findElement(By.id("input-confirm")).sendKeys(datamap.get("password"));
	}
	@And ("^Selects the privacy policy option$")
	  public void Selects_the_privacy_policy_option() {
		driver.findElement(By.xpath("//input[@name='agree']")).click();
	}
	@And ("^Clicks on Continue button$")
	  public void Clicks_on_Continue_button() {
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}
	@Then ("^User should get successfully registered$")
	  public void User_should_get_successfully_registered() {
String url = driver.getCurrentUrl();
		
		if(url.equals("http://tutorialsninja.com/demo/index.php?route=account/success")) {
		}else {
			
			System.out.println("User has not registered");
			
			Assert.fail("User has not registered");
	}
}
}