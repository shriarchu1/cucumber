Feature: Registratio Tests

@register
Scenario: Register an account with valid details
	Given User navigates to Register page
	When User provies the following details into the input fields
		|firstName|taru										|
		|lastName |motoori									|
		|email		|taru.motoori@gmail.com	|
		|phone		|12345678									|
		|password	|SeleniumTester$					|
	And Selects the privacy policy option
	And Clicks on Continue button
	Then User should get successfully registered
	
	
		