@DishesApi
Feature: Dishes API feature
  I want to use this feature to test the Dishes Service APIs

  @GetDishesList
  Scenario: Get the list of the available dishes
    Given that I have a Rest client
    When I perform a get request to the dishes service
    Then I receive back the list of available dishes
    
  @AddDish
  Scenario: Add a new Dish
    Given that I have a new Dish
    When post the new dish to the dishes service
    Then I receive the HTTP status code 201
    
	@UpdateDish
  Scenario: Delete a Dish
    Given that I have the dish "TestMarco"
    When I call the PUT API of the dishes service
    Then I receive back the HTTP status code 204
        
	@DeleteDish
  Scenario: Delete a Dish
    Given that I have the dish "TestMarco"
    When I call the DELETE API of the dishes service
    Then I receive back the HTTP status code 204
    

