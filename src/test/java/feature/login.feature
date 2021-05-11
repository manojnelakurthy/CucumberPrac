Feature: Login feature
  Verify that user is able to login

  
  Scenario: Login With Valid Data
    Given User Is On Login Page "chrome","http://qualitypointtech.net/timesheetdemo/index.php"
    And User Enters Username "admin"
    And User Enters Password "admin"
    When User Click On Login
    Then An Alert Is Present and Accept That
    Then User Should Get Report Page