Feature: Login Test

@All @ninja
Scenario: Login to the application using valid credentials
Provide valid username and valid password into the email address and password fields to login
	Given User navigates to login page of the application
	When User enters Username as "radhekrishna@gmail.com" and Password as "radheradhe" into the fields
	And Clicks on Login button
	Then User should successfully login