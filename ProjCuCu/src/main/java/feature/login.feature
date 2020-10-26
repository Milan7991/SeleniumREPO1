Feature: Login Action

Scenario: Successful Login with Valid Credentials

	Given user is already on the login page
	When title of the login page is
	And user enter username and password
	Then user clicks on login button
