Feature: Test Background Feature
Description: The purpose of this feature is to test the Background keyword
 
Background: User opens the chrome page
 Given Open the Chrome page and run the application
 When User can view the Chrome search screen
 Then User should enter link for login
 
Scenario: User Register to application India
 Given Open Chrome and start the application_India
 When User navigates to register Page for India
 Then User enters all the required details
 Then User should be able to Register successfully
 
Scenario: User Register to application Aus
 Given Open the chrome and start the application_Aus
 When User navigates to Register Page for Aus
Then User enters the details
Then User registration successful
 
 Scenario: User Register to application France
 Given Open the chrome and start the application_France
 When User navigates to Register Page for France
 Then User enters valid details
 Then User successfully Registered
 