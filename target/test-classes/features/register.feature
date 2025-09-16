Feature: Register

Scenario: User should be able to register using valid credentials

Given Browser is open
And user is navigate to register page
When user enters valid credentials
And clicks on register button
Then new account should be created
And browser should be close
