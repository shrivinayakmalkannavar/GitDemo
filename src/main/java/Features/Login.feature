Feature: To verify End to End Turn in Functionality 

@Smoke
Scenario: Genesis Turn in Scenario to verify login
When user enters blank username and password and click on submit
When user enters username and password and click on submit And select organization
Then verify page title

@Regression
Scenario Outline: Genesis Turn in Scenario to verify login
When user enters blank username and password and click on submit
When user enters username and password and click on submit And select organization
Then verify page title
Then Click on Tools
Then Select Turn in   
Then Enter "<Vin>" and Click on Continue
Then Click on Continue
Then Fill all details and "<Mileage>" and click on Continue
Then click on turn in

Examples:
     | Vin |							| Mileage |
     |KMTFN4JE7LU328902|  |20000 |







