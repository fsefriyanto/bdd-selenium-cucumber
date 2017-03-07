Feature: Dashboard Page

Background: flow till dashboard page
     Given user is on gomed cc loginpage with url "http://localhost:8080/GoMed/"
	 When user enter "CSUSER" as username and "password1" as password and clicks Log in button
	 Then user should be shown dashboard page

Scenario: Dashboard default content
     Then user should be shown dashboard page

Scenario: Display left menu
     When clicks sliding button
     Then left menu is display
     