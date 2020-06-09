@tag
Feature: WebSite Login
  I want to use this template to test the WebSite login screen

  @WebSiteLogIn
  Scenario: WebSite Login
    Given Firefox browser
    Then I navigate to the WebSite login page
    And I set the username and password
    Then I click on the login button
    And I should be able to see the WebSite home page

