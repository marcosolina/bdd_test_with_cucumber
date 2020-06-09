package automationtests.website;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepsWebSiteTask {
    @Given("that I am on the WebSite home page")
    public void that_I_am_on_the_WebSite_home_page() {
        System.out.println("I am on the home page");
    }

    @Then("I will click on the WebSite task")
    public void i_will_click_on_the_WebSite_task() {
        System.out.println("I click on the WebSite task");
    }

    @Then("perform the WebSite task")
    public void perform_the_WebSite_task() {
        System.out.println("I perform the WebSite Task");
    }
}
