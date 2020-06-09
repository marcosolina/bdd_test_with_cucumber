package automationtests.api.dishesservice;

import static org.assertj.core.api.Assertions.assertThat;

import automationtests.api.dishesservice.model.Dish;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class InsertDishSteps {
    private Response response;
    private RequestSpecification request;
    private Dish newDish;
    private String urlInsertDish = "http://localhost:8081/dishes";

    @Given("that I have a new Dish")
    public void thatIHaveANewDish() {
        newDish = new Dish("TestMarco", 123);
        request = RestAssured.given();

        assertThat(request).isNotNull();
        assertThat(newDish).isNotNull();
    }

    @When("post the new dish to the dishes service")
    public void postTheNewDishToTheDishesService() {
        request.header("Content-Type", "application/json");
        response = request.body(newDish).post(urlInsertDish);
        assertThat(response).isNotNull();
    }

    @Then("I receive the HTTP status code {int}")
    public void iReceiveTheHTTPStatusCode(Integer statusCode) {
        assertThat(response.getStatusCode()).isEqualTo(statusCode);
    }
}
