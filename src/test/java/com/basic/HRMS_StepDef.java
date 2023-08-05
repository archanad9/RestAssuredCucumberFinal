package com.basic;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMS_StepDef {
	@Given("Login with admin user")
	public void login_with_admin_user() {
	    System.out.println("step:login with user");
	}

	@When("Go to PIM TAB")
	public void go_to_pim_tab() {
		System.out.println("step:Go to PIM TAB");
	    
	}

	@When("search the user")
	public void search_the_user() {
		System.out.println("step:search the user");
	    }

	@Then("validate user gettting searched")
	public void validate_user_gettting_searched() {
		System.out.println("step:validate user gettting searched");
	}

	@When("don’t enter all mandatory user details")
	public void don_t_enter_all_mandatory_user_details() {
		System.out.println("step:don’t enter all mandatory user details");
	}

	@Then("validate user is not getting searched")
	public void validate_user_is_not_getting_searched() {
		System.out.println("step:user is not getting searched");
		
	   	}


}
