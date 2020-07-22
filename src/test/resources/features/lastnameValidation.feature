Feature: Last Name validation against DB
@dbTest1
Scenario: Last Name validation against DB
Given user is logged with valid admin credentials
And user navigate to employee list page
When user enters valid employee id "14688"
And click on search button
Then verify table is displayed
And get last name from table
When get last name from db
Then validate last name from ui against db