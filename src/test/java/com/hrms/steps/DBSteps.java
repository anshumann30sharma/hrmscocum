package com.hrms.steps;


import java.util.List;
import java.util.Map;

import com.hrms.utils.DBUtils;

import io.cucumber.java.en.When;

public class DBSteps  {
	public static List<Map<String,String>>dbData;
		@When("get first name from db")
		public void get_first_from_db() {
		    String sqlQuery="select emp_firstname from hs_hr_employees where employee_id=14688";
		   dbData= DBUtils.storeDataFromDB(sqlQuery);
		   System.out.println(dbData);
	}
		@When("get last name from db")
		public void get_last_from_db() {
		    String sqlQuery="select emp_lastname from hs_hr_employees where employee_id=14688";
		   dbData= DBUtils.storeDataFromDB(sqlQuery);
		   System.out.println(dbData);
}
}
