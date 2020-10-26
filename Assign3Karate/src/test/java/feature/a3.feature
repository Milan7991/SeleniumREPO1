Feature: check returned countries by API

Background:

	* url 'https://api.openweathermap.org'
	* header Accept = 'application/json'
Scenario: get list of all countries
	Given path '/data/3.0/stations'
	When method get
	Then status 401
	* string temp = response
    * match temp contains 'Invalid API key. Please see http://openweathermap.org/faq#error401 for more info.'
	