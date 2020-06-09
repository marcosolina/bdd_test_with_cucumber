package automationtests.website;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepsWebSiteLogin {
    @Given("Firefox browser")
    public void firefox_browser() {
        System.out.println("firefox browser");
    }

    @Then("I navigate to the WebSite login page")
    public void i_navigate_to_the_WebSite_login_page() {
        System.out.println("go to login screen");
    }

    @Then("I set the username and password")
    public void i_set_the_username_and_password() {
        System.out.println("type credentials");
    }

    @Then("I click on the login button")
    public void i_click_on_the_login_button() {
        System.out.println("Click on the login button");
    }

    @Then("I should be able to see the WebSite home page")
    public void i_should_be_able_to_see_the_WebSite_home_page() {
        System.out.println("home page");
    }
}
