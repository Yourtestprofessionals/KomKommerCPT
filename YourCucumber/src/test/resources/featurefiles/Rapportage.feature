Feature: rapportage
  As a user
  I want to navigate to our portal
  So that I can login

@Word
Scenario: Print Word Report
Given user enters CP/T webbrowser
When user logins with "testanalyst" and "cptYTP2016!"
And Clicks on the Submitbutton
And user clicks on right arrow
And user clicks on Issues
And user clicks on View Issues
And user clicks on Print Reports
And user selects the Word icon
Then a wordreport is created

@IE
Scenario: Print IE Report
Given user enters CP/T webbrowser
When user logins with "testanalyst" and "cptYTP2016!"
And Clicks on the Submitbutton
And user clicks on right arrow
And user clicks on Issues
And user clicks on View Issues
And user clicks on Print Reports
And user selects the IE icon
Then an IEreport is created


@CSV
Scenario: Print CSV Report
Given user enters CP/T webbrowser
When user logins with "testanalyst" and "cptYTP2016!"
And Clicks on the Submitbutton
And user clicks on right arrow
And user clicks on Issues
And user clicks on View Issues
And user clicks on CSV Export
Then a CSV report is created

@XML
Scenario: Print XML Report
Given user enters CP/T webbrowser
When user logins with "testanalyst" and "cptYTP2016!"
And Clicks on the Submitbutton
And user clicks on right arrow
And user clicks on Issues
And user clicks on View Issues
And user clicks on XML Export
Then a XML report is created




