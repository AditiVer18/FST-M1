
@Activity2
Feature: Login Test

  Scenario: Testing login
  GIVEN: User is on Login page
	WHEN: User enters username and password
	THEN: Read the page title and confirmation message
	AND: Close the Browser