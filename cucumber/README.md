# BDD Project

This is a simple project to demonstrate how to write a BDD script with the use of [Cucumber (link)](https://cucumber.io/docs/cucumber/)

Topics covered:

* [Tutorial](https://cucumber.io/docs/guides/10-minute-tutorial/)
* [Cucumber - JUnit-integration](https://cucumber.io/docs/cucumber/api/#junit)
* Feature File definition (Cucumber)
* Steps definition (Java)
* Api Tests
* [Cucumber Tags (link)](https://cucumber.io/docs/cucumber/api/#tags)

Example:

```bash

$ mvn test "-Dcucumber.filter.tags=@WebSiteTask or @WebSiteLogIn"

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running automationtests.RunCucumberTest

@tag @WebSiteLogIn
Scenario: WebSite Login                             # automationtests/website/login.feature:6
firefox browser
  Given Firefox browser                             # automationtests.website.StepsWebSiteLogin.firefox_browser()
go to login screen
  Then I navigate to the WebSite login page         # automationtests.website.StepsWebSiteLogin.i_navigate_to_the_WebSite_login_page()
type credentials
  And I set the username and password               # automationtests.website.StepsWebSiteLogin.i_set_the_username_and_password()
Click on the login button
  Then I click on the login button                  # automationtests.website.StepsWebSiteLogin.i_click_on_the_login_button()
home page
  And I should be able to see the WebSite home page # automationtests.website.StepsWebSiteLogin.i_should_be_able_to_see_the_WebSite_home_page()

@tag @WebSiteTask
Scenario: Title of your scenario           # automationtests/website/webSiteTask.feature:6
I am on the home page
  Given that I am on the WebSite home page # automationtests.website.StepsWebSiteTask.that_I_am_on_the_WebSite_home_page()
I click on the WebSite task
  Then I will click on the WebSite task    # automationtests.website.StepsWebSiteTask.i_will_click_on_the_WebSite_task()
I perform the WebSite Task
  And perform the WebSite task             # automationtests.website.StepsWebSiteTask.perform_the_WebSite_task()

2 Scenarios (2 passed)
8 Steps (8 passed)
0m0.488s


Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.818 sec

Results :

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

```
