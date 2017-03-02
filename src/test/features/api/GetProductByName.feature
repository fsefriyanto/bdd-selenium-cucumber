Feature: Get product by name
  Scenario: User calls web service to get a product by its name
	Given a product exists with an name of Crocin
	When a user retrieves the product by name
	Then status code is 200
