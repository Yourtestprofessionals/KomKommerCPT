Feature: nieuwe bevinding
  As a user
  I want to login to mantis
  So that I can report a new issue
  
  Scenario Outline: nieuwe bevinding
    Given I have a login module mantis
    When I login with the parameters "<Omgeving>" and "<Rol>" and "<Browser>" and "<TCiD>"
    Then i have succesfully created the testcase

	Examples:
	|Omgeving	|Rol				|Browser	|TCiD	|
  |PRO			|developer	|Chrome		|1|
	|PRO			|testleader	|Chrome		|3|    
	|PRO			|projectmanager	|Chrome		|5|
