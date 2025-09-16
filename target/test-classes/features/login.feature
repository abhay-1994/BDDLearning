Feature: Login

Scenario:
 Validate user is able to login using valid credentials
 
Given Browser is open and URL is navigated
And Login page is displayed
When user enters valid username and valid password
And user click on login button
Then user should be successfully logged in
And browser should close 