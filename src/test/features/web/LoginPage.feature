Feature: login Page
     As a user I should be able to login to the Control Centre so that I can manage the configurations and track SLAs
 
Scenario: login without username and password
	 Given user is on gomed cc loginpage with url "http://localhost:8080/GoMed/"
	 When user clicks Log in button
	 Then user gets an error message "Please fill in this field."
	 
Scenario: login with correct username and password
	 Given user is on gomed cc loginpage with url "http://localhost:8080/GoMed/"
	 When user enter "CSUSER" as username and "password1" as password and clicks Log in button
	 Then user should be shown dashboard page