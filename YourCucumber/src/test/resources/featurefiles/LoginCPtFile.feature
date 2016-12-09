Feature: this is my logging feature file

  Scenario Outline: this is logging scenario
    Given navigate to CPT Portal
    When logging into the portal using id <User Id>
    And logging into the portal using pass <Password>
    And click on login
    Then check logout link
    Then logging is successfully

    Examples:
      | User Id           | Password    |
      | softwaredeveloper | cptYTP2016! |
      | testanalyst       | cptYTP2016! |
      | testleader        | cptYTP2016! |
      | stakeholder       | cptYTP2016! |
      | projectmanager    | cptYTP2016! |
      | donaldduck        | cptYTP2016! |
