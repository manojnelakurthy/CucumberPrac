Feature: Checking The Reports

Scenario: View Report
   Given User Is On Report Page
   And User Select Employee "admin (cullen )"
   And User Select Project "test Project"
   And User Select Start Date "May 2021","1"
   And User Select End Date "May 2021","8"
   When User Click On View Report
   Then An Alert Is Present and Accept That
   Then Site Shows The Details Of Report
   
   
  