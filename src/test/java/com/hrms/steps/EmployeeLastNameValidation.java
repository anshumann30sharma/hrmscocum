package com.hrms.steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.text.View;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.DBUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeLastNameValidation extends CommonMethods {
	
	private static  List<Map<String,String>>listMap;
	@Then("get last name from table")
	public void get_last_name_from_table() {
		listMap=viewEmp.getLastNameFromTable() ;
		
		
//		System.out.println(viewEmp.getLastNameFromTable()); 
	}

	@Then("validate last name from ui against db")
	public void validate_last_name_from_ui_against_db() {
		Assert.assertEquals(DBSteps.dbData,listMap);
	}

}
