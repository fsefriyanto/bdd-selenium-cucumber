Feature: Customer
	as a User I can see the list of customer information
         
Background: flow till customer page
    Given user is on gomed cc loginpage with url "http://alpha.linkdokter.co.id/gomed/login"
	When user enter "admin" as username and "adminadmin" as password and clicks Log in button
	Then user should be shown dashboard page
	When clicks sliding button
    Then left menu is display
    When clicks customer menu
    Then customer page will be displayed
   
Scenario: Search customer by mobile number and customer id
    When search customer by "+62888-123-45678" as mobile number and "89d9f399-704b-4683-a26b-1e8e3b125f47" as customer id
    Then get the following customer list result:
    |MobileNumber               |CustomerId                                   |
    |+62888-123-45678           |89d9f399-704b-4683-a26b-1e8e3b125f47         |
    
