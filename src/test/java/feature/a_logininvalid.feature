 Feature: Login Invalid feature
  Verify that user is able to not login
 
 
 Scenario Outline: Login With Invalid Data
     Given User Is On Login Page "chrome","http://qualitypointtech.net/timesheetdemo/index.php"
     When User Enters Username "<username>"
     When User Enters Password "<password>"
     When User Click On Login
     Then User Gets Error Message "Please check your username and password"
    
    
    Examples:

    |username|password|
    |manoj|admin|
