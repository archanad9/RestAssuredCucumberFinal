package com.ApplicationUp;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;



public class ApplicationUp_StepDef {
	Response response;
	
	@Given("hit the URI")
	public void hit_the_uri() {
		response = RestAssured.get("https://demoqa.com/BookStore/v1/Books");
	   
	}

	@Then("validate the response {string} of application")
	public void validate_the_response_of_application(String statusCode) {
	    response.then().log().all();
	    String ActualStatusCode = ""+response.getStatusCode()+"";
	    //String expectedStatusCode = 200;
	    Assert.assertEquals(statusCode, ActualStatusCode);
	    
	}


}
