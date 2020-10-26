Feature: Deleting a user

Background:

	* url 'https://reqres.in'
	* header Accept = 'application/json'
Scenario: Deleting the User
	Given path '/api/users/2'
	


	When method DELETE
	Then status 204
	
	