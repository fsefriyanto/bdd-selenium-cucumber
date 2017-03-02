Feature: login Page
 In order to test login page
 As a Registered user
 I want to specify the login conditions
 
 Scenario: login without username and password
	 Given user is on gomed cc loginpage
	 When user clicks Log in button
	 Then user gets an error message "Please fill in this field."