Feature: Product Category
    As a User I can see list of Product Category and can see detail from here
         
Background: flow till product category page
    Given user is on gomed cc loginpage with url "http://alpha.linkdokter.co.id/gomed/login"
	When user enter "admin" as username and "adminadmin" as password and clicks Log in button
	Then user should be shown dashboard page
	When clicks sliding button
    Then left menu is display
    When clicks product category menu
    Then product category page is display
	     
Scenario: Search Product Category By Name
	When search product category by name "Oral Care"
	Then user will get following product category:
	|Name                 |
	|Oral Care            |     
	
Scenario: Search Product Category By Code
	When search product category by code "FLU123"
	Then user will get following product category:
	|Code                 |
	|FLU123               |     
