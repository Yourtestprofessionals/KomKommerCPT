Feature: Inloggen
  As a user
  I want to login on CP/T
  So that I can use the portal
  

  Scenario: Login Chrome
    Given I have a login module
    When I login with the parameters "PRO" and "testleader" and "Chrome"
    Then i can succesfully login
    