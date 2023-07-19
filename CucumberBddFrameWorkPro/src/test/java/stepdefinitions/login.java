package stepdefinitions;

import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
public class login {

	WebDriver driver;
     @Before("@ninja")
	public void OpenBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Given("^User navigates to login page of the application$")
	public void User_navigates_to_login_page_of_the_application() {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

	}

	@When("^User enters Username as \"([^\"]*)\" and Password as \"([^\"]*)\" into the fields$")
	public void User_enters_Username_as_somthing_and_Password_as_something_into_the_fields(String emailaddress , String password) {
		driver.findElement(By.id("input-email")).sendKeys(emailaddress);
		driver.findElement(By.id("input-password")).sendKeys(password);
	}

	@And("^Clicks on Login button$")
	public void Clicks_on_Login_button() {
        driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("^User should successfully login$")
	public void User_should_successfully_login() {
		
		
	WebElement accountBreadcrumb= null;
	try {
	accountBreadcrumb = driver.findElement(By.xpath("//ul[@class='breadcrumb']"));
	}catch(Exception e) {
		System.out.println("Loging failed");
	}
	Assert.assertNotNull("Loging failed" ,accountBreadcrumb);
	}
	@After("@ninja")
      public void closure() {
		driver.close();
	}
	
}
