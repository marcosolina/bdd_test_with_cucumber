package automationtests.api.dishesservice;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.http.HttpStatus;

import automationtests.api.dishesservice.model.Dishes;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetDishesSteps {
    private Response response;
    private RequestSpecification request;
    private String urlAllDishes = "http://localhost:8081/dishes/all";

    @Given("that I have a Rest client")
    public void thatIHaveARestClient() {
        request = RestAssured.given();
        assertThat(request).isNotNull();
    }

    @When("I perform a get request to the dishes service")
    public void iPerformAGetRequestToTheDishesService() {
        response = request.get(urlAllDishes);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.SC_OK);
    }

    @Then("I receive back the list of available dishes")
    public void iReceiveBackTheListOfAvailableDishes() {
        Dishes dishes = response.getBody().as(Dishes.class);
        assertThat(dishes).isNotNull();
        assertThat(dishes.getDishes()).isNotNull();
        assertThat(dishes.getDishes().size()).isNotEqualTo(0);
    }
}
