Feature: Test Background Feature
Description: The purpose of this feature is to test the Background keyword
 
Background: User opens the chrome page
 Given Open the chrome and run the application
 When User can view the Chrome search page
 Then User should enter the login link 
 
Scenario: User login to application India
 Given Open the Chrome and start the application_India
 When User navigates to Login Page for India
 Then I enter valid username and valid password
 Then User should be able to login successfully
 
Scenario: User login to application Aus
 Given Open the chrome and start the application_Aus
 When User navigates to Login Page for Aus
 Then I enter valid login credentials
 Then User login is successful
 
 Scenario: User login to application France
 Given Open the chrome and start the application_France
 When User navigates to Login Page for France
 Then User enters valid credentials
 Then User successfully loggedin