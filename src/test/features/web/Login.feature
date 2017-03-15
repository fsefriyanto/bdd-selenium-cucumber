Feature: login Page
     As a user I should be able to login to the Control Centre so that I can manage the configurations and track SLAs
 
Scenario: login without username and password
	 Given user is on gomed cc loginpage with url "http://alpha.linkdokter.co.id/gomed/login"
	 When user clicks Log in button
	 Then user gets an error message "Please fill in this field."
	 
Scenario: login with correct username and password
	 Given user is on gomed cc loginpage with url "http://alpha.linkdokter.co.id/gomed/login"
	 When user enter "admin" as username and "adminadmin" as password and clicks Log in button
	 Then user should be shown dashboard page