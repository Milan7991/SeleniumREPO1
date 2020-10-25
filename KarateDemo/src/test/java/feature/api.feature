Feature: check returned countries by API

Background:

	* url 'https://reqres.in'
	* header Accept = 'application/json'
Scenario: get list of all countries
	Given path '/api/users/23'
	When method get
	Then status 404
	