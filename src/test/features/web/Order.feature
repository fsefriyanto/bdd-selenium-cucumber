Feature: Order List
	as a User I can see the list of order detail and can click to view detail
         
Background: flow till order page
    Given user is on gomed cc loginpage with url "http://alpha.linkdokter.co.id/gomed/login"
	When user enter "admin" as username and "adminadmin" as password and clicks Log in button
	Then user should be shown dashboard page
	
Scenario: search order by order id, order date and customer id
    When search by "" as order id and "" as order date and "d4bfc13c-fd81-42c3-9c0f-0fb9e0851e1f" as customer id
    Then get the following order list result:
    |OrderId          |OrderDate        |CustomerId                          |
    |P3N4YM-1863      |2017-03-15 13:15 |d4bfc13c-fd81-42c3-9c0f-0fb9e0851e1f|
    
