package com.hrms.steps;

import com.hrms.utils.CommonMethods;

import java.util.*;
import org.junit.Assert;
import com.hrms.utils.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
public class InvalidLoginHW extends CommonMethods{

	@When("I enter invalid UserName and Password and click on login button and see error message")
	public void i_enter_invalid_and_and_see(DataTable dataTable) {
		List<Map<String, String>> credentials=dataTable.asMaps();
		for(Map<String,String> m:credentials) {
			String uid=m.get("UserName");
			String pwd=m.get("Password");
			String message=m.get("ErrorMessage");
			sendText(login.username, uid);
			sendText(login.password, pwd);
			click(login.loginBtn);
			wait(3);
			//=======================Validation===========//
			String actualmsg=login.errorMsg.getText();
			Assert.assertEquals("Test Case Failed", message, actualmsg);
		}
	}
}

