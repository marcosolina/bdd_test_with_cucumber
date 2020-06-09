package automationtests.api.dishesservice;

import static org.assertj.core.api.Assertions.assertThat;

import automationtests.api.dishesservice.model.Dish;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteDishSteps {
    private Response response;
    private RequestSpecification request;
    private Dish dish;
    private String baseUrl = "http://localhost:8081/dishes";
    
    
    @Given("that I have the dish {string}")
    public void thatIHaveTheDishTestMaro(String dishName) {
        request = RestAssured.given();
        dish = new Dish(dishName, 543);
        assertThat(request).isNotNull();
    }

    @When("I call the DELETE API of the dishes service")
    public void iCallTheDELETEAPIOfTheDishesService() {
        response = request.delete(baseUrl + "/" + dish.getName());
        assertThat(response).isNotNull();
    }
    
    @When("I call the PUT API of the dishes service")
    public void iCallThePUTAPIOfTheDishesService() {
        request.header("Content-Type", "application/json");
        response = request.body(dish).put(baseUrl);
        assertThat(response).isNotNull();
    }

    @Then("I receive back the HTTP status code {int}")
    public void iReceiveBackTheHTTPStatusCode(Integer httpStatusCode) {
        assertThat(response.statusCode()).isEqualTo(httpStatusCode);
    }
}
