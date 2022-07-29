Feature: Application Login

Scenario: Home page default login
Given User is on netbanking landing page
When User login to application with "jin" and password "1234"
Then Home page is populated
And cards are displayed "true"

Scenario: Home page default login
Given User is on netbanking landing page
When User login to application with "john" and password "4321"
Then Home page is populated
And cards are displayed "false"