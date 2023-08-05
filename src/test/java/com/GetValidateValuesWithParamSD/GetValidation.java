package com.GetValidateValuesWithParamSD;

import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class GetValidation {
	
	Response response;
	
	@Given("hit the URI1")
	public void hit_the_uri1() {
		response = RestAssured.get("https://demoqa.com/BookStore/v1/Books");
	}

	@Then("validate title {string} and pages {string} of application")
	public void validate_title_and_pages_of_application(String title, String int1) {
		String dataString = response.getBody().asString();
		System.out.println("All Data ==== "+dataString);
		String actualTitleString = response.getBody().jsonPath().getString("books[0].title");
		Assert.assertTrue(actualTitleString.equals(title));
		int pagesInt = response.getBody().jsonPath().getInt("books[0].pages");
		String pagesString = ""+pagesInt+"";
		Assert.assertEquals(pagesString, int1);
	}
	
	@Given("hit the URI2")
	public void hit_the_uri2() {
		response = RestAssured.get("https://demoqa.com/BookStore/v1/Books");
	}

	@Then("validate subTitle {string}")
	public void validate_sub_title(String subtitle) {
		String dataString = response.getBody().asString();
		System.out.println("All Data ==== "+dataString);
		String actualSubTitleString = response.getBody().jsonPath().getString("books[0].subTitle");
		Assert.assertTrue(actualSubTitleString.equals(subtitle));   
	}

	@Then("validate publisher {string}")
	public void validate_publisher(String publisher) {
		String dataString = response.getBody().asString();
		System.out.println("All Data ==== "+dataString);
		String actualpublisherString = response.getBody().jsonPath().getString("books[0].publisher");
		Assert.assertTrue(actualpublisherString.equals(publisher)); 
		
	}
	
	@Then("validate isbn {string}")
	public void validate_isbn(String isbn) {
		String dataString = response.getBody().asString();
		System.out.println("All Data ==== "+dataString);
		String actualisbnString = response.getBody().jsonPath().getString("books[0].isbn");
		Assert.assertTrue(actualisbnString.equals(isbn)); 
	}

	@Then("validate author {string}")
	public void validate_author(String author) {
		String dataString = response.getBody().asString();
		System.out.println("All Data ==== "+dataString);
		String actualauthorString = response.getBody().jsonPath().getString("books[0].author");
		Assert.assertTrue(actualauthorString.equals(author)); 
	    
	}
	
	@Then("validate value for {string} is {string}")
	public void validate_value_for(String str1, String str2) {
		String dataString = response.getBody().asString();
		String actualTitleString = response.getBody().jsonPath().getString(str1);
		Assert.assertTrue(actualTitleString.equals(str2));
	}
	
	@Then("validate value for attribute {string} is {string} present in response")
	public void validate_value_for_attribute_is_present_in_response(String str1, String expValue) {
		
		List<Object> allItem = response.getBody().jsonPath().getList("books."+str1);
		System.out.println("==="+allItem.toString());
		Assert.assertTrue(allItem.contains(expValue));
		
	}

}
