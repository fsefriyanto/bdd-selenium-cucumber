Feature: Product
         
Background: flow till product page
    Given user is on gomed cc loginpage with url "http://localhost:8080/GoMed/"
	When user enter "CSUSER" as username and "password1" as password and clicks Log in button
	Then user should be shown dashboard page
	When clicks sliding button
    Then left menu is display
   
	     
Scenario: Search Product By Name
    When clicks product menu
    Then product page is display
	When search product by name "Crocin"
	Then user will get following product:
	|Name                 |
	|Crocin               |     
