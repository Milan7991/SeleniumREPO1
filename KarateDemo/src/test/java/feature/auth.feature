Feature: check returned user

Background:

	* url 'https://gorest.co.in'
	* def expOutput = read('../feature/result.json')
Scenario: get list of all users
	Given path '/public-api/users'
	And param name = 'Prof. Raj Varrier'
	When method get
	Then status 200
	
		And match response == expOutput
	