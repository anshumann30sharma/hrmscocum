package com.hrms.steps;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class crossBrowserTesting extends CommonMethods {
	@Given("User Opens HRMS in Different {string}")
	public void user_Opens_HRMS_in_Different(String string) {
			setUp1(string);		
	}

	@When("user enters valid Admin1 Credentials and click login Button")
	public void user_enters_valid_Admin_Credentials_and_click_login_Button() {
		jsClick(login.username);
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password,ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		
	}

	@Then("User Verifies log in Successful1")
	public void user_Verifies_log_in_Successful() {

	}

}
