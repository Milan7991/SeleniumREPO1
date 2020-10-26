Feature: Accessing a Deleted a user

Background:

	* url 'https://reqres.in'
	* header Accept = 'application/json'
Scenario: Deleting the User
	Given path '/api/users/23'


	When method GET
	Then status 404
	* string temp = response
	* match temp contains '{}'
	
	