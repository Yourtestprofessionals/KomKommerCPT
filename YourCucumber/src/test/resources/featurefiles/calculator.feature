Feature: Calculator
  As a user
  I want to use a calculator
  So that I don't need to calculate myself

  Scenario: Add two numbers
    Given I have a calculator
    When I add 2 and 3
    Then the result should be 5
    
    Scenario: Add two numbers again
    Given I have a calculator
    When I add 5 and 3
    Then the result should be 8