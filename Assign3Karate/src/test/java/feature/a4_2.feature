Feature: Add a user

Background:

	* url 'https://reqres.in'
	* header Accept = 'application/json'
Scenario: POST req for adding
	Given path '/api/users'
	
	And request { name: 'Milan', job: 'Doctor', updatedAt: '2020-10-25T12:39:20.415Z'}

	When method POST
	Then status 201
	* string temp = response
    *  match temp contains 'Doctor'
	